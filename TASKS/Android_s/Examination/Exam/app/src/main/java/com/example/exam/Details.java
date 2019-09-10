package com.example.library;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.exam.R;

import static android.widget.Toast.LENGTH_SHORT;

public class Details extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public Details()
    {
        System.out.println("java");
    }
    public void demo(Context applicationContext) {
        Toast.makeText(applicationContext,"These are Student", LENGTH_SHORT).show();
    }

    public void demo1(Context applicationContext) {
        Toast.makeText(applicationContext,"this is Examiner", LENGTH_SHORT).show();
    }
    public void demo2(Context applicationContext) {
        Toast.makeText(applicationContext,"these are Id's", LENGTH_SHORT).show();
    }


}

