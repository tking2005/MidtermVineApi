package nyc.c4q.tarynking.exam12122016;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import nyc.c4q.tarynking.exam12122016.models.Animal;
import nyc.c4q.tarynking.exam12122016.models.AnimalModel;
import nyc.c4q.tarynking.exam12122016.networks.AnimalApi;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by tarynking on 12/21/16.
 */

public class MainFragment extends Fragment {

    private View rootView;
    private static final String BASE_URL = "http://jsjrobotics.nyc/";
    private RecyclerView recyclerView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_main, container, false);
        return rootView;

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(new AnimalAdapter());

        //retrofit
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        AnimalApi api = retrofit.create(AnimalApi.class);

        Call<AnimalModel> call = api.getAnimals();
        call.enqueue(new Callback<AnimalModel>() {
            @Override
            public void onResponse(Call<AnimalModel> call, Response<AnimalModel> response) {
                AnimalModel model = response.body();
                List<Animal> houses = model.getAnimals();
                AnimalAdapter adapter = (AnimalAdapter) recyclerView.getAdapter();
                adapter.setData(houses);
            }

            @Override
            public void onFailure(Call<AnimalModel> call, Throwable t) {

            }
        });

    }
//    @Override
    public void onAnimalNameClicked(Animal animal) {
        rootView.setBackgroundColor(Color.parseColor(animal.getBackground()));
    }


}

