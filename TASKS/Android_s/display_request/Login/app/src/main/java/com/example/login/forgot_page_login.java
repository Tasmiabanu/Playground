package com.example.login;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class forgot_page_login extends AppCompatActivity {
    Button log;
    ImageView i1;
    ImageView i2;
    TextView i3;
    TextView i4;
    TextView i5;
    EditText etext;
    AlertDialog.Builder alertBuilder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_page_login);
        log=findViewById(R.id.button2);
        i1= findViewById(R.id.imageView2);
        i2=findViewById(R.id.imageView5);
        i3=findViewById(R.id.textView10);
        i4=findViewById(R.id.textView11);
        i5=findViewById(R.id.button2);
        etext=findViewById(R.id.editText);
        alertBuilder = new AlertDialog.Builder(this);




        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(etext.getText().toString().equals(""))
                {
                    i1.setVisibility(View.VISIBLE);
                    i2.setVisibility(View.VISIBLE);
                    i3.setVisibility(View.VISIBLE);
                    i4.setVisibility(View.VISIBLE);

                }
                else
                    {
                    final View alertView = getLayoutInflater().inflate(R.layout.activity_forgot_password, null);
                    alertBuilder.setView(alertView);
                    final AlertDialog alertDialog = alertBuilder.create();
                    alertDialog.show();
                }
            }
        });
             i5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(getApplicationContext(),request_page.class);
                    startActivity(intent);
                }

        });
    }
}
