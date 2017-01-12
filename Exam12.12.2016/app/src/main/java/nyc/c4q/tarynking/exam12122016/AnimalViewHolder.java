package nyc.c4q.tarynking.exam12122016;

import android.app.Fragment;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import nyc.c4q.tarynking.exam12122016.models.Animal;

/**
 * Created by tarynking on 12/20/16.
 */

public class AnimalViewHolder extends RecyclerView.ViewHolder {


    private TextView animalNameTv;
    private int textColor;
    private int backgroundColor;
    private Fragment fragment;





    public AnimalViewHolder(ViewGroup parent) {
        super(inflateView(parent));
        animalNameTv = (TextView) itemView.findViewById(R.id.vh_animal_name);







    }

    private static View inflateView(ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return inflater.inflate(R.layout.animal_item_layout, parent, false);
    }

    public void bind(final Animal animal) {
        animalNameTv.setText(animal.getName());
        textColor = Color.parseColor(animal.getTextColor());
        animalNameTv.setTextColor(textColor);



        itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Toast.makeText(itemView.getContext(), "CLICKED", Toast.LENGTH_SHORT).show();
                onAnimalNameClicked(animal);


            }

            private void onAnimalNameClicked(Animal animal) {
            }
        });
    }
}