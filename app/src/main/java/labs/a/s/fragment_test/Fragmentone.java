package labs.a.s.fragment_test;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragmentone extends Fragment {

    View root;
    TextView username;
    EditText first;
    EditText second;
    FragmentManager fm;
Button addbutton;
    public Fragmentone() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        root= inflater.inflate(R.layout.fragment_fragmentone, container, false);
        fm=getFragmentManager();
        addbutton=(Button)root.findViewById(R.id.buttonadd);

        EditText user=(EditText)getActivity().findViewById(R.id.username);
        String name = user.getText().toString();
        name="welcome "+name;

        username=(TextView)root.findViewById(R.id.usernametext);
        username.setText(name);

        addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                



                FragmentTransaction transaction=fm.beginTransaction();
                Fragmenttwo two=new Fragmenttwo();
                transaction.replace(R.id.activity_main_layout,two,"two");
                transaction.commit();
            }
        });

        return root;
    }

}
