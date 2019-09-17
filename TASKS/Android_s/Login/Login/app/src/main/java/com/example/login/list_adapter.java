package com.example.login;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class list_adapter extends BaseAdapter {
    Context context;
    ArrayList<String> a1;
    ArrayList<String> a2;
    ArrayList<String> a3;

     public list_adapter(Context context, ArrayList<String> a1, ArrayList<String> a2, ArrayList<String> a3) {
         this.a1=a1;
         this.a2=a2;
         this.a3=a3;
         this.context=context;
     }

     @Override
     public int getCount() {
         return a1.size();
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
         public View getView(int position, View convertView, ViewGroup parent) {
             View view=LayoutInflater.from(context).inflate(R.layout.items_list,parent,false);

             TextView title,date,status;
             ImageView imageView;

             title=view.findViewById(R.id.titles);
             date=view.findViewById(R.id.dates);
             status=view.findViewById(R.id.textView16);
             imageView=view.findViewById(R.id.imageView6);

             title.setText(a1.get(position));
             date.setText(a2.get(position));
             status.setText(a3.get(position));
             imageView.setImageResource(R.drawable.bell);
             return view;
     }
 }



