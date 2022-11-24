package locnv27.fpoly.navigationdemoagain.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import java.lang.reflect.Array;

import locnv27.fpoly.navigationdemoagain.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DialogFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DialogFragment extends Fragment {
    private Button button;
    private String array[]={"dua hau","dua bo","dua chuot"};
    public DialogFragment() {
        // Required empty public constructor
    }
    // TODO: Rename and change types and number of parameters
    public static DialogFragment newInstance() {
        DialogFragment fragment = new DialogFragment();
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
        return inflater.inflate(R.layout.fragment_dialog, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        button = view.findViewById(R.id.btnshowdialog);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                /*builder.setMessage("thông báo");
                builder.setTitle("cảnh báo");
                builder.create();*/
               /* builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                builder.setNegativeButton("Cancle", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });*/
               /* builder.setItems(array, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        switch (i){
                            case 0:
                                Toast.makeText(getActivity(),array[i],Toast.LENGTH_SHORT).show();
                                break;

                            case 1:
                                Toast.makeText(getActivity(),array[i],Toast.LENGTH_SHORT).show();
                                break;
                            case 2:
                                Toast.makeText(getActivity(),array[i],Toast.LENGTH_SHORT).show();
                                break;
                        }
                    }
                });*/
               /* builder.setSingleChoiceItems(array, 2, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });*/
               /* builder.setMultiChoiceItems(array, null, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                        switch (i){
                            case 0:
                                if(b){
                                    Toast.makeText(getActivity(),array[i],Toast.LENGTH_SHORT).show();
                                }
                                break;

                            case 1:
                                if(b){
                                    Toast.makeText(getActivity(),array[i],Toast.LENGTH_SHORT).show();
                                }
                                break;
                            case 2:
                                if(b){
                                    Toast.makeText(getActivity(),array[i],Toast.LENGTH_SHORT).show();
                                }
                                break;
                        }
                    }
                });*/
                LayoutInflater inflater = getActivity().getLayoutInflater();
                View view1 = inflater.inflate(R.layout.custome_dialog,null);
                builder.setView(view1);
                builder.show();
               /* Dialog dialog = new Dialog(getActivity());
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.custome_dialog);
                dialog.show();
                Button cancle = dialog.findViewById(R.id.btnCancle);
                Button ok = dialog.findViewById(R.id.btnOK);
                cancle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getActivity(),"Cancle",Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                });
*/
            }


        });
    }
}