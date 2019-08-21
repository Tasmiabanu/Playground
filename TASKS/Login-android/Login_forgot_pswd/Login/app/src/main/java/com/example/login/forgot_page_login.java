package com.example.login;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class forgot_page_login extends AppCompatActivity {
    Button log;
    ImageView i1;
    ImageView i2;
    TextView i3;
    TextView i4;
    AlertDialog.Builder alertBuilder;
    Button cont;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_page_login);
        log=findViewById(R.id.button2);
        i1= findViewById(R.id.imageView2);
        i2=findViewById(R.id.imageView5);
        i3=findViewById(R.id.textView10);
        i4=findViewById(R.id.textView11);


        alertBuilder = new AlertDialog.Builder(this);
        final View alertView = getLayoutInflater().inflate(R.layout.activity_forgot_password, null);
        alertBuilder.setView(alertView);
        final AlertDialog alertDialog = alertBuilder.create();
        alertDialog.show();
        cont=findViewById(R.id.button2);
        cont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.show();

                i1.setVisibility(1);
                i2.setVisibility(1);
                i3.setVisibility(1);
                i4.setVisibility(1);


            }
        });


    }
}
