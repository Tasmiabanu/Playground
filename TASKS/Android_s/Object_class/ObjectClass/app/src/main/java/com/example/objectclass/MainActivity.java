package com.example.objectclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        object b=new object();
         demo();
    }

    public void demo() {
        Toast.makeText(getApplicationContext(),"This is object", Toast.LENGTH_SHORT).show();
    }
}
