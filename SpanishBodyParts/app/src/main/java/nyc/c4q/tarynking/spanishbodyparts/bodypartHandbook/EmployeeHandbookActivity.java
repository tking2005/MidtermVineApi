package nyc.c4q.tarynking.spanishbodyparts.bodypartHandbook;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import nyc.c4q.tarynking.spanishbodyparts.R;


public class EmployeeHandbookActivity extends AppCompatActivity{

    private RecyclerView mRecyclerView;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.employee_handbook);
        mRecyclerView = (RecyclerView) findViewById(R.id.employeeList);
        mRecyclerView.setLayoutManager(new GridLayoutManager(this,2));
        mRecyclerView.setAdapter(new EmployeeListAdapter());
    }
}
