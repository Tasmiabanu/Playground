package com.example.login;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Json_adapter extends RecyclerView.Adapter{
    private Context context;
    JSONObject list;

    public Json_adapter(Context context, JSONObject jsonObject) {
        this.context=context;
        this.list=new JSONObject();
        this.list=jsonObject;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.items_list,viewGroup,false);
        MyViewHolder myViewHolder=new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
    MyViewHolder myViewHolder1=myViewHolder;
    try {
        JSONArray jsonArray=list.getJSONArray("data");
        JSONObject jsonObject=jsonArray.getJSONObject(i);
        myViewHolder1.setUpData(jsonObject);

    } catch (JSONException e) {
        e.printStackTrace();
    }
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    private class MyViewHolder {
        public void setUpData(JSONObject jsonObject) {
        }
    }
}

