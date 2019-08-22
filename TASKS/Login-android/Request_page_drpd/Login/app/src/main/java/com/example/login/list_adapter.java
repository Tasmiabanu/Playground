package com.example.login;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

 public abstract class list_adapter extends BaseAdapter {
     String titles[] = {}, dates[] = {}, status[] = {};
     private Context context;

     public list_adapter(Context context, String[] title, String[] date, String[] status) {
         this.context = context;
         this.titles = title;
         this.dates = date;
         this.status = status;
     }

     @Override
     public int getCount() {
         return titles.length;
     }

     @Override
     public Object getItem(int i) {
         return null;
     }
 }



