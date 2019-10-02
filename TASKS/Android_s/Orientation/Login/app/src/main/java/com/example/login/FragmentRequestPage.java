package com.example.login;

import android.content.res.Configuration;
import android.os.Bundle;

import com.example.login.Deligate.DeligatesInterface;
import com.example.login.Model.Request_model;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class FragmentRequestPage extends AppCompatActivity
        implements DeligatesInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_request_page);

        RequestItems myFragment = new RequestItems();
        myFragment.setDeligatesInterface(this);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        //  fragmentTransaction.add(R.id.fragmentD, myFragment);
        fragmentTransaction.add(R.id.fragment, myFragment);
        fragmentTransaction.commit();
    }


    //for regain the same page when orientn back to Lsc to Pt
    @Override
    public void onConfigurationChanged(Configuration newConfiguration){
        super.onConfigurationChanged(newConfiguration);
        if(newConfiguration.orientation==Configuration.ORIENTATION_PORTRAIT){
            Fragment myFragment1 = new RequestViewNew();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            //replace in th same page when orientn change
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.replace(R.id.fragment, myFragment1);
            fragmentTransaction.commit();


        }
        else{
            Fragment myFragment1 = new RequestViewNew();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.replace(R.id.fragment2, myFragment1);
            fragmentTransaction.commit();
        }
    }


    @Override
    public void RequestItemOnClick(Request_model request_model) {

        int orientation = this.getResources().getConfiguration().orientation;

        if (orientation == Configuration.ORIENTATION_PORTRAIT) {

            Fragment myFragment1 = new RequestViewNew();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            //replace in th same page when orientn change
            fragmentTransaction.replace(R.id.fragment, myFragment1);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();

            ((RequestViewNew) myFragment1).setData(request_model);
        }
        else {
            Fragment myFragment1 = new RequestViewNew();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment2, myFragment1);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();

            ((RequestViewNew) myFragment1).setData(request_model);
        }
    }
}



