package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button login;
ImageView i1;
    ImageView i2;
    TextView i3;
    TextView i4;
 TextView i5;
    EditText i6;
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
        i6=findViewById(R.id.editText7);
        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(i6.getText().toString().equals("")){
                    i1.setVisibility(View.VISIBLE);
                    i2.setVisibility(View.VISIBLE);
                    i3.setVisibility(View.VISIBLE);
                    i4.setVisibility(View.VISIBLE);
                }
                else{
                    Intent intent=new Intent(getApplicationContext(),FragmentRequestPage.class);
                    startActivity(intent);
                }


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
