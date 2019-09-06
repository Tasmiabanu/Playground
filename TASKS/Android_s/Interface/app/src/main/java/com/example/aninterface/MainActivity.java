package com.example.aninterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Interface, Multiple{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display();
        items();
    }


    @Override
    public void display() {
            Toast.makeText(getApplicationContext(),"onCreate()", Toast.LENGTH_SHORT).show();

    }


    @Override
    public void items() {
        Toast.makeText(getApplicationContext(),"onResume", Toast.LENGTH_LONG).show();
    }
}
