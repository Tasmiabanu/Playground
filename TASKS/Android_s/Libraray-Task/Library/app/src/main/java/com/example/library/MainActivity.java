package com.example.library;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {
    Button Request;
    Button books;
    Button id;
    Button edition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Request = findViewById(R.id.button);

        Request.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Details b = new Details();
                b.demo(getApplicationContext());
            }

        });

        books = findViewById(R.id.button2);
        books.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Details b = new Details();
                b.demo1(getApplicationContext());
            }
        });

        id = findViewById(R.id.button3);
        id.setOnClickListener(new View.OnClickListener() {
             @Override
              public void onClick(View view) {
                 Details b = new Details();
                 b.demo2(getApplicationContext());
          }
        });

        edition = findViewById(R.id.button4);
        edition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Details b = new Details();
                b.demo3(getApplicationContext());
            }
        });
    }
}
