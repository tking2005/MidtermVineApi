package nyc.c4q.tarynking.exam12122016;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.tarynking.exam12122016.models.Animal;

/**
 * Created by tarynking on 12/20/16.
 */

public class AnimalAdapter extends RecyclerView.Adapter {
    private List<Animal> animal = new ArrayList<>();

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new AnimalViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        AnimalViewHolder animalViewHolder = (AnimalViewHolder) holder;
        Animal currentPost = animal.get(position);
        animalViewHolder.bind(currentPost);
    }

    @Override
    public int getItemCount() {
        return animal.size();
    }

    public void setData(List<Animal> animal) {
        this.animal = animal;
        notifyDataSetChanged();
    }


}
