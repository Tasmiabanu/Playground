package com.example.login;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class list_adapter_recycler extends RecyclerView.Adapter<list_adapter_recycler.MyViewHolder> {
    String titles[]={},dates[]={},status[]={};
    private Context context;
    public list_adapter_recycler(Context context, String[] title, String[] date, String[] status) {
        this.context=context;
        this.titles=title;
        this.dates=date;
        this.status=status;
}
    @NonNull
    @Override
    public list_adapter_recycler.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(context).inflate(R.layout.items_list,viewGroup,false);
        MyViewHolder myViewHolder=new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        list_adapter_recycler.MyViewHolder myViewHolder = ( list_adapter_recycler.MyViewHolder) holder;
        myViewHolder.setUpData(String.valueOf(titles[position]),String.valueOf(dates[position]),String.valueOf(status[position]));
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title,date,statusText;
        public ImageView imageView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.titles);
            date=itemView.findViewById(R.id.dates);
            statusText=itemView.findViewById(R.id.textView16);
            imageView=itemView.findViewById(R.id.imageView6);
        }
        public void setUpData(String titles,String dates, String status){
            title.setText(titles);
            date.setText(dates);
            statusText.setText(status);
            imageView.setImageResource(R.drawable.bell);
        }
    }
}
