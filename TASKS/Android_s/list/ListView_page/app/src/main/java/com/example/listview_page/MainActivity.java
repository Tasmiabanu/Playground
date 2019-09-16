package com.example.listview_page;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listv;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listv = findViewById(R.id.list_view);

        ArrayList<String> a1 = new ArrayList<>();
        ArrayList<String> a2 = new ArrayList<>();
        ArrayList<String> a3 = new ArrayList<>();

        a1.add("PUR-056");
        a1.add("PUR-056");
        a1.add("PUR-056");

        a2.add("06 Jul 2019");
        a2.add("06 Jul 2019");
        a2.add("06 Jul 2019");

        a3.add("APPROVED");
        a3.add("APPROVED");
        a3.add("APPROVED");

        List_adapter_class a = new List_adapter_class(getApplicationContext(), a1, a2, a3);

        listv.setAdapter(a);

        Intent intent = new Intent(getApplicationContext(), List_adapter_class.class);
        startActivity(intent);
    }
}


