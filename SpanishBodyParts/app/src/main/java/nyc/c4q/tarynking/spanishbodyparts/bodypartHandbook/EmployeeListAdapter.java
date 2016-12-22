package nyc.c4q.tarynking.spanishbodyparts.bodypartHandbook;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;

import nyc.c4q.tarynking.spanishbodyparts.R;


class EmployeeListAdapter extends RecyclerView.Adapter{

    private List<EmployeeDescription> mData = Arrays.asList(
        new EmployeeDescription("Los Manos", R.drawable.los_manos),
        new EmployeeDescription("La Cara", R.drawable.la_cara)
    );

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new EmployeeViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        EmployeeViewHolder viewHolder = (EmployeeViewHolder) holder;
        EmployeeDescription employee = mData.get(position);
        viewHolder.bind(employee);
        viewHolder.setOnClickListener(buildEmployeeClickListener(employee));
    }

    private View.OnClickListener buildEmployeeClickListener(EmployeeDescription employee) {
        if (employee != null){
            return navigateToEmployeeViewListener(employee.getName());
        }
        return defaultClickListener();
    }

    /**
     * This click listener launches an intent with the employee name as an extra
     * @param name
     * @return
     */
    private View.OnClickListener navigateToEmployeeViewListener(final String name) {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), EmployeeView.class);
                intent.putExtra(EmployeeView.EMPLOYEE_NAME, name);
                view.getContext().startActivity(intent);
            }
        };
    }

    /*
     The default click listener does nothing;
     */
    private View.OnClickListener defaultClickListener() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Do Nothing
            }
        };
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
}
