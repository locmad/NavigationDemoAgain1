package locnv27.fpoly.navigationdemoagain.recyclerview;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import locnv27.fpoly.navigationdemoagain.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link RecyclerviewFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RecyclerviewFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private ArrayList<MyObject>arrayList = new ArrayList<>();
    private MyAdapter myAdapter;
    public RecyclerviewFragment() {
        // Required empty public constructor
    }
    // TODO: Rename and change types and number of parameters
    public static RecyclerviewFragment newInstance() {
        RecyclerviewFragment fragment = new RecyclerviewFragment();
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
        return inflater.inflate(R.layout.fragment_recyclerview, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mRecyclerView = view.findViewById(R.id.id_recyclerview);
        arrayList.add(new MyObject("nguyễn văn A",R.drawable.ic_launcher_background));
        arrayList.add(new MyObject("nguyễn văn B",R.drawable.ic_launcher_background));
        arrayList.add(new MyObject("nguyễn văn C",R.drawable.ic_launcher_background));
        arrayList.add(new MyObject("nguyễn văn D",R.drawable.ic_launcher_background));
        myAdapter = new MyAdapter(getActivity());
        myAdapter.setData(arrayList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(myAdapter);
    }
}