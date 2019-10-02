package com.example.login;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.login.Model.Request_model;

import java.util.ArrayList;

public class list_adapter extends BaseAdapter {


    Context context;
    ArrayList<Request_model> request;
    public list_adapter(Context context, ArrayList<Request_model> request_models){
        this.request=request_models;
        this.context=context;
    }

    @Override
     public int getCount() {
         return request.size();
     }
     @Override
     public Object getItem(int position) {
         return null;
     }
     @Override
     public long getItemId(int position) {
         return 0;
     }
         @Override
         public View getView(int i, View convertView, ViewGroup parent) {
             View view=LayoutInflater.from(context).inflate(R.layout.items_list,parent,false);

             TextView title,date,status;
             ImageView imageView;

             Request_model Request= this.request.get(i);

             title=view.findViewById(R.id.titles);
             date=view.findViewById(R.id.dates);
             status=view.findViewById(R.id.textView16);
             imageView=view.findViewById(R.id.imageView6);

             title.setText(String.valueOf(Request.getReqNumber()));
             date.setText(String.valueOf(Request.getRequestDate()));
             status.setText(String.valueOf(Request.getRequest_status()));
             imageView.setImageResource(R.drawable.bell);
             return view;
     }

 }



