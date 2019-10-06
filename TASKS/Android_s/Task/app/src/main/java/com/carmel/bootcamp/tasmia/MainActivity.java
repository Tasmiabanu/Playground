package com.carmel.bootcamp.tasmia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RequisitionFormOne myFragment = new RequisitionFormOne();
        //  myFragment.setDeligatesInterface(this);
        FragmentManager fragmentManager = getSupportFragmentManager();

        fragmentManager.popBackStackImmediate(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment, myFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public void onClick(View view) {
        RequisitionFormOne myFragment1 = new RequisitionFormOne();

        FragmentManager fragmentManager = getSupportFragmentManager();

        fragmentManager.popBackStackImmediate(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment, myFragment1);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
