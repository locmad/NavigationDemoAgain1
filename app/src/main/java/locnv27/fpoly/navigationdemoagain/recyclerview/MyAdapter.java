package locnv27.fpoly.navigationdemoagain.recyclerview;/*
///
/// Project: NavigationDemoAgain
/// Created by NguyenLoc on 7/22/2022.
/// Copyright © 2018-2019 Beeknights Co., Ltd. All rights reserved.
///
*/

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import locnv27.fpoly.navigationdemoagain.R;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.UserViewHolder> {

    private Context mContext;
    private ArrayList<MyObject> myObjectArrayList ;

    public MyAdapter(Context mContext) {
        this.mContext = mContext;
    }
    public void setData(ArrayList<MyObject>arrayList){
        this.myObjectArrayList=arrayList;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).
                inflate(R.layout.layoutitem,parent,false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        MyObject myObject = myObjectArrayList.get(position);
        if(myObject ==null){
            return;
        }else {

            holder.textView.setText(myObject.getName());
            holder.imageView.setImageResource(myObject.getImg());

        }
    }

    @Override
    public int getItemCount() {
        return myObjectArrayList.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView textView;
        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.id_img);
            textView= itemView.findViewById(R.id.id_tvname);

        }
    }
}
