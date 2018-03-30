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
                             final Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        root= inflater.inflate(R.layout.fragment_fragmentone, container, false);
        fm=getFragmentManager();
        addbutton=(Button)root.findViewById(R.id.buttonadd);

        EditText user=(EditText)getActivity().findViewById(R.id.username);
        String name = user.getText().toString();
        name="welcome "+name;

        username=(TextView)root.findViewById(R.id.usernametext);
        username.setText(name);

        first=(EditText)root.findViewById(R.id.first);
        second=(EditText)root.findViewById(R.id.second);

        addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String f=first.getText().toString();
                int f1=Integer.parseInt(f);
                String s=second.getText().toString();
                int s1=Integer.parseInt(s);
                int res=f1+s1;
                String result=String.valueOf(res);

                Bundle bundle=new Bundle();
                bundle.putString("key",result);

                FragmentTransaction transaction=fm.beginTransaction();
                Fragmenttwo two=new Fragmenttwo();
                two.setArguments(bundle);
                transaction.replace(R.id.activity_main_layout,two,"two");
                transaction.commit();
            }
        });

        return root;
    }

}
