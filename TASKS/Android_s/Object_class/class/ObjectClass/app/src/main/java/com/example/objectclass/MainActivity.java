package com.example.objectclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button Request;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Request = findViewById(R.id.button);
        Request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                object b=new object();
                b.demo(getApplicationContext());
            }
        });
    }


    }


