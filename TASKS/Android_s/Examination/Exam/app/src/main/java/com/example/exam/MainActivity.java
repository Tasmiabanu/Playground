package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button Request;
        Button books;
        Button id;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Request = findViewById(R.id.button);
        Request.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           com.example.library.Details b = new com.example.library.Details();
                                           b.demo(getApplicationContext());
                                       }
                                   });

                books = findViewById(R.id.button2);
        books.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                com.example.library.Details b = new com.example.library.Details();
                b.demo1(getApplicationContext());
            }
        });

        id = findViewById(R.id.button3);
        id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                com.example.library.Details b = new com.example.library.Details();
                b.demo2(getApplicationContext());
            }
        });


    }
}
