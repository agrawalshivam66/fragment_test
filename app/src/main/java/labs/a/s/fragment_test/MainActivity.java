package labs.a.s.fragment_test;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  {

     FragmentManager fm;
    Button add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fm=getSupportFragmentManager();
        add=(Button)findViewById(R.id.button);

    }


    public void first(View view) {
        FragmentTransaction transaction=fm.beginTransaction();
        Fragmentone one=new Fragmentone();
        transaction.add(R.id.activity_main_layout,one,"one");
        transaction.commit();
    }
}
