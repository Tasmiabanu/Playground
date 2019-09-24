package com.example.demofragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button request;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Click(View view){
        Fragment one= new Left();
        FragmentManager FM=getSupportFragmentManager();
        FragmentTransaction FT=FM.beginTransaction();
        FT.replace(R.id.fragment,one);
        FT.commit();
    }

    public void Click1(View view){
        Fragment two= new Right();
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment,two);
        fragmentTransaction.commit();
    }

    public void Clicks(View view){
        Fragment one= new Left();
        FragmentManager FM=getSupportFragmentManager();
        FragmentTransaction FT=FM.beginTransaction();
        FT.replace(R.id.fragment,one);
        FT.commit();
    }

    public void Click2(View view){
        Fragment two= new Right();
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment,two);
        fragmentTransaction.commit();
    }
}
