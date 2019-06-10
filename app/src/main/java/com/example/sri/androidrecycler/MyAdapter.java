package com.example.sri.androidrecycler;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by sri on 02/12/2018.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    Context ct;
    int myimages[];
    String mynames[];

    public MyAdapter(MainActivity mainActivity, int[] images, String[] names) {
        ct= mainActivity;
        myimages=images;
        mynames=names;
    }

    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(ct).inflate(R.layout.row,parent,false);
        MyViewHolder myViewholder=new MyViewHolder(v);
        return myViewholder;

    }

    @Override
    public void onBindViewHolder(MyAdapter.MyViewHolder holder, int position) {
        holder.iv.setImageResource(myimages[position]);
        holder.tv.setText(mynames[position]);

    }

    @Override
    public int getItemCount() {
        return myimages.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView iv;
        TextView tv;
        public MyViewHolder(View itemView) {

            super(itemView);
            iv=itemView.findViewById(R.id.image);
            tv=itemView.findViewById(R.id.textv);
            tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Passing data between activities using intents and putextra
                    Intent i=new Intent(ct,NewActivity.class);
                    i.putExtra("name",mynames[getLayoutPosition()]);
                    ct.startActivity(i);
                }
            });

        }
    }
}
