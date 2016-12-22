package nyc.c4q.tarynking.appfromscratch.RecyclerView;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.tarynking.appfromscratch.R;

/**
 * Created by tarynking on 11/14/16.
 */

public class ColorPaletteAdapter extends RecyclerView.Adapter{

    private List<ColorPalette> colorPalettes = new ArrayList<>();


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_color_item, parent, false);
        return new ColorListViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ColorListViewHolder colorListViewHolder = (ColorListViewHolder) holder;
        ColorPalette colorPalette = colorPalettes.get(position);
        colorListViewHolder.bind(colorPalette);

    }

    @Override
    public int getItemCount() {
        return colorPalettes.size();
    }
}
