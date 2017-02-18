package nyc.c4q.tarynking.genericlesson;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/**
 * Created by tarynking on 1/14/17.
 */

public class NumberKeyAdapter extends RecyclerView.Adapter<NumberKeyViewHolder> {
    @Override
    public NumberKeyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(NumberKeyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


//    private List<Animal> animal = new ArrayList<>();
//
//    @Override
//    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        return new AnimalViewHolder(parent);
//    }
//
//    @Override
//    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
//        AnimalViewHolder animalViewHolder = (AnimalViewHolder) holder;
//        Animal currentPost = animal.get(position);
//        animalViewHolder.bind(currentPost);
//    }
//
//    @Override
//    public int getItemCount() {
//        return animal.size();
//    }
//
//    public void setData(List<Animal> animal) {
//        this.animal = animal;
//        notifyDataSetChanged();
//    }
}
