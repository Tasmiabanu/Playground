package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button login;
ImageView i1;
    ImageView i2;
    TextView i3;
    TextView i4;
 TextView i5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login=findViewById(R.id.button);
        i1= findViewById(R.id.imageView3);
        i2=findViewById(R.id.imageView4);
        i3=findViewById(R.id.textView6);
        i4=findViewById(R.id.textView7);
        i5=findViewById(R.id.textView4);
        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                i1.setVisibility(1);
                i2.setVisibility(1);
                i3.setVisibility(1);
                i4.setVisibility(1);

            }
        });

        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),forgot_page_login.class);
                startActivity(intent);
            }
        });

    }
}
