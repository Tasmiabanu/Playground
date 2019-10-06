package com.carmel.bootcamp.tasmia;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.carmel.bootcamp.tasmia.Model.RequestModel;
import com.carmel.bootcamp.tasmia.R;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {

    Context context;
    ArrayList<RequestModel> request;

    public ListAdapter(Context context, ArrayList<RequestModel> request_models) {
        this.request = request_models;
        this.context = context;
    }

    @Override
    public int getCount() {
        return request.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view1 = LayoutInflater.from(context).inflate(R.layout.requisitionitems, viewGroup, false);
        TextView description;
        ImageView ImageView;

        RequestModel Request = this.request.get(i);

        description = view1.findViewById(R.id.data);
        ImageView = view1.findViewById(R.id.equal);

        description.setText(String.valueOf(Request.getData()));
        ImageView.setImageResource(R.drawable.equals);

        return view1;
    }
}
