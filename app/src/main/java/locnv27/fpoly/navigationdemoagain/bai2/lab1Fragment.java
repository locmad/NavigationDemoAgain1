package locnv27.fpoly.navigationdemoagain.bai2;

import android.graphics.Typeface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

import locnv27.fpoly.navigationdemoagain.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link lab1Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class lab1Fragment extends Fragment {

    private TextView tvname;
    private ToggleButton toggleButton;

    public lab1Fragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static lab1Fragment newInstance() {
        lab1Fragment fragment = new lab1Fragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lab1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tvname = view.findViewById(R.id.tvname);
        toggleButton = view.findViewById(R.id.id_toggle);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Typeface typeface= Typeface.createFromAsset(getActivity().getAssets(), "Blazed.ttf");
                    tvname.setTypeface(typeface);
                }else {

                    tvname.setTypeface(Typeface.create("nomal", Typeface.NORMAL));
                }
            }
        });

    }
}