package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Recycler_view extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        recyclerView=findViewById(R.id.recycle_View);
        String title[]={"Rose","Lotus","Jasmine","RCB","Bengularu Bulls"};
        String date[]={"22-Aug","24-Aug","28-Aug","30-Aug","2-Sep"};
        String status[]={"APPROVED","REJECTED","DRAFT","AWAITING","COMPLETED"};
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        list_adapter_recycler myRecyclerListAdapter=new list_adapter_recycler(getApplicationContext(),title,date,status);
        recyclerView.setAdapter(myRecyclerListAdapter);

    }
}
