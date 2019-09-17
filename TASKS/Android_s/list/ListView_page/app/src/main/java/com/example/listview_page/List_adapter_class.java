package com.example.listview_page;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class List_adapter_class extends BaseAdapter {
    Context context;
    ArrayList<String> a1;
    ArrayList<String> a2;
    ArrayList<String> a3;

    public List_adapter_class(Context Context, ArrayList<String> a1, ArrayList<String> a2, ArrayList<String> a3) {
        this.a1=a1;
        this.a2=a2;
        this.a3=a3;
        this.context=Context;

    }

    @Override
    public int getCount() {
        return a1.size();
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
        View view1=LayoutInflater.from(context).inflate(R.layout.list_view_draw,viewGroup,false);
        TextView title,date,status;
        ImageView imageView;

        title=view1.findViewById(R.id.title);
        date=view1.findViewById(R.id.dates);
        status=view1.findViewById(R.id.status_array);
        imageView=view1.findViewById(R.id.imageView);

        title.setText(a1.get(i));
        date.setText(a2.get(i));
        status.setText(a3.get(i));
        imageView.setImageResource(R.drawable.bell);
        return view1;

    }
}
