package com.carmel.bootcamp.tasmia;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class RequisitionFormOne extends Fragment {

    Button next;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_requisition_form_one, container, false);

        next = (Button) view.findViewById(R.id.button);
        //next.setOnClickListener((View.OnClickListener) this);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                RequisitionFormTwo myFragment1 = new RequisitionFormTwo();

                FragmentManager fragmentManager = getFragmentManager();

                fragmentManager.popBackStackImmediate(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.add(R.id.fragment, myFragment1);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        return view;
    }

}
