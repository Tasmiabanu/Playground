package com.example.login;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class list_adapter extends BaseAdapter {
     String titles[], dates[], status_array[];
     private Context context;

     public list_adapter(Context context, String[] title, String[] date, String[] status) {
         this.context = context;
         this.titles = title;
         this.dates = date;
         this.status_array = status;
     }

     @Override
     public int getCount() {
         return titles.length;
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

             title.setText(String.valueOf(titles[position]));
             date.setText(String.valueOf(dates[position]));
             status.setText(String.valueOf(status_array[position]));
             imageView.setImageResource(R.drawable.bell);
             return view;
     }
 }



