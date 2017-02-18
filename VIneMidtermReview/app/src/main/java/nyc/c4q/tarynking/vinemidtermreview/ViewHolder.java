package nyc.c4q.tarynking.vinemidtermreview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import nyc.c4q.tarynking.vinemidtermreview.models.Record;

/**
 * Created by tarynking on 12/13/16.
 */

public class ViewHolder extends RecyclerView.ViewHolder {
    TextView txtView;

    public ViewHolder(View itemView) {
        super(itemView);
        txtView = (TextView)itemView.findViewById(R.id.liked);
    }

    public void onBind(Record record){


        txtView.setText(String.valueOf(record.getLiked().intValue()));



    }
}
