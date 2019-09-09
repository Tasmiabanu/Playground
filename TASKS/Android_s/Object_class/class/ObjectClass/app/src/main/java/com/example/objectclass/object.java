package com.example.objectclass;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import static android.widget.Toast.LENGTH_SHORT;

public class object extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
  object()
    {
     System.out.println("java");
  }
    public void demo(Context applicationContext) {
        Toast.makeText(applicationContext,"this is demo", LENGTH_SHORT).show();
    }

    }






