package com.example.orientation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button request;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        request =findViewById(R.id.button4);
//
//        request.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Intent intent = new Intent(getApplicationContext(),RequestView.class);
//                startActivity(intent);
//            }
//        });
//    }
    }
        public void Click(View view){
            Fragment one= new ListItems();
            FragmentManager FM=getSupportFragmentManager();
            FragmentTransaction FT=FM.beginTransaction();
            FT.replace(R.id.fragmentOne,one);
            FT.commit();
        }

        public void Click1(View view){
            Fragment two= new RequestView();
            FragmentManager fragmentManager=getSupportFragmentManager();
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentTwo,two);
            fragmentTransaction.commit();
        }
}
