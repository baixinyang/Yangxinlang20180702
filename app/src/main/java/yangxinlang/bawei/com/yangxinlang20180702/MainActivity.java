package yangxinlang.bawei.com.yangxinlang20180702;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private FrameLayout framel;
    private RadioGroup radiogroup;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         fragmentManager = getFragmentManager();
         fragmentTransaction = fragmentManager.beginTransaction();
         fragmentTransaction.replace(R.id.framel,new FrastFragment());
        fragmentTransaction.commit();
        initFind();
        radiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.frist:
                        fragmentTransaction.replace(R.id.framel,new FrastFragment());
                        break;
                    case R.id.two:
                        fragmentTransaction.replace(R.id.framel,new DingFragment());
                        break;
                    case R.id.these:
                        fragmentTransaction.replace(R.id.framel,new MyFragment());
                        break;
                }
            }
        });
    }

    private void initFind() {
        radiogroup = findViewById(R.id.radiogroup);
        framel = findViewById(R.id.framel);
    }

}
