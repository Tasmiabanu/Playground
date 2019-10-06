package com.carmel.bootcamp.tasmia;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class AddItemsPopUp extends Fragment {
    Button done;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       view=inflater.inflate(R.layout.fragment_add_items_pop_up, container, false);
        done=view.findViewById(R.id.Done);

        done.setOnClickListener(new View.OnClickListener() {
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
