package nyc.c4q.tarynking.appfromscratchprep;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by tarynking on 12/20/16.
 */

public class HouseViewHolder extends RecyclerView.ViewHolder {


    private TextView houseStyleTv;
    private TextView housePriceTv;
    private TextView houseLocationTv;


    public HouseViewHolder(ViewGroup parent) {
        super(inflateView(parent));
        houseStyleTv = (TextView) itemView.findViewById(R.id.vh_house_style);
        housePriceTv = (TextView) itemView.findViewById(R.id.vh_house_price);
        houseLocationTv = (TextView) itemView.findViewById(R.id.vh_house_location);

    }

    private static View inflateView(ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return inflater.inflate(R.layout.house_item_layout, parent, false);
    }

    public void bind(final House house) {
        houseStyleTv.setText(house.getStyle());
        housePriceTv.setText(house.getPrice());
        houseLocationTv.setText(house.getLocation());


//        itemView.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//
//                Toast.makeText(itemView.getContext(), "CLICKED", Toast.LENGTH_SHORT).show();
//                SecondFragment secondFragment = new SecondFragment();
//
//                Bundle extras = new Bundle();
//                extras.putString("POST_ID", post.getId() + "");
//                extras.putString("POST_TITLE", post.getTitle());
//                extras.putString("POST_CONTENT", post.getContent());
//                extras.putString("POST_DATE", post.getDate());
//
//                secondFragment.setArguments(extras);
//                ((Activity) itemView.getContext()).getFragmentManager().beginTransaction()
//                        .replace(R.id.fragment_layout, secondFragment)
//                        .addToBackStack(null)
//                        .commit();
//            }
//        });
    }
}