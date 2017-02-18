package nyc.c4q.tarynking.vinemidtermreview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import nyc.c4q.tarynking.vinemidtermreview.models.Record;

/**
 * Created by tarynking on 12/13/16.
 */

public class VineAdapter extends RecyclerView.Adapter{
    List<Record> recordList;

    public VineAdapter(List<Record> recordList) {
        this.recordList = recordList;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
       Record record =  recordList.get(position);
        ViewHolder viewHolder = (ViewHolder)holder;
        viewHolder.onBind(record);

    }

    @Override
    public int getItemCount() {
        return recordList.size();
    }

    public void setRecordList(List<Record> recordList){
        this.recordList = recordList;
        notifyDataSetChanged();
    }
}
