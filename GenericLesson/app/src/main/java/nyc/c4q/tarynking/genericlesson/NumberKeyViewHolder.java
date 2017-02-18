package nyc.c4q.tarynking.genericlesson;

import android.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by tarynking on 1/14/17.
 */

public class NumberKeyViewHolder extends RecyclerView.ViewHolder{
    public NumberKeyViewHolder(View itemView) {
        super(itemView);
    }

    private TextView animalNameTv;
    private int textColor;
    private int backgroundColor;
    private Fragment fragment;


//    public AnimalViewHolder(ViewGroup parent) {
//        super(inflateView(parent));
//        animalNameTv = (TextView) itemView.findViewById(R.id.vh_animal_name);
//
//    }
//
//    private static View inflateView(ViewGroup parent) {
//        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
//        return inflater.inflate(R.layout.animal_item_layout, parent, false);
//    }
//
//    public void bind(final Animal animal) {
//        animalNameTv.setText(animal.getName());
//        textColor = Color.parseColor(animal.getTextColor());
//        animalNameTv.setTextColor(textColor);
//
//
//
//        itemView.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//
//                Toast.makeText(itemView.getContext(), "CLICKED", Toast.LENGTH_SHORT).show();
//                View mView = (View) view.getParent();
//                mView.setBackgroundColor(Color.parseColor(animal.getBackground()));
//
//
//            }
//
//
//        });
//    }
}
