package nyc.c4q.tarynking.spanishbodyparts.bodypartHandbook;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import nyc.c4q.tarynking.spanishbodyparts.R;
import nyc.c4q.tarynking.spanishbodyparts.bodypartHandbook.employees.LosManos;
import nyc.c4q.tarynking.spanishbodyparts.bodypartHandbook.employees.LaCara;

public class EmployeeView extends AppCompatActivity {
    public static final String EMPLOYEE_NAME = "extra.employee.name";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.employee_view);
        String employee = getIntent().getStringExtra(EMPLOYEE_NAME);
        if(employee != null){
            switch (employee){
                case "Los Manos":
                    showLosManos();
                    break;
                case "La Cara":
                    showCara();
                    break;
                default:
                    break;
            }

        }
    }

    private void showLosManos(){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.body_part_profile,new LosManos());
        fragmentTransaction.commit();
    }
    private void showCara(){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.body_part_profile,new LaCara());
        fragmentTransaction.commit();
    }
}
