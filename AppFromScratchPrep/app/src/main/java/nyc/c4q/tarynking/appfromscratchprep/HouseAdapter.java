package nyc.c4q.tarynking.appfromscratchprep;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tarynking on 12/20/16.
 */

public class HouseAdapter extends RecyclerView.Adapter {
    private List<House> house = new ArrayList<>();

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new HouseViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        HouseViewHolder houseViewHolder = (HouseViewHolder) holder;
        House currentPost = house.get(position);
        houseViewHolder.bind(currentPost);
    }

    @Override
    public int getItemCount() {
        return house.size();
    }

    public void setData(List<House> house) {
        this.house = house;
        notifyDataSetChanged();
    }
}
