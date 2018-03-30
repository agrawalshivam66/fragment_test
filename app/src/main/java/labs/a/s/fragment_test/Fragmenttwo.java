package labs.a.s.fragment_test;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragmenttwo extends Fragment {

View root;
    TextView res;

    public Fragmenttwo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        root= inflater.inflate(R.layout.fragment_fragmenttwo, container, false);
    res=(TextView)root.findViewById(R.id.result);

        String value = getArguments().getString("key");
        res.setText(value);
        return root;
    }

}
