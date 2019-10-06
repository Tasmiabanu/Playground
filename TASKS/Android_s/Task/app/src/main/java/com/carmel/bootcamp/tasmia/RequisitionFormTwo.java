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
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListPopupWindow;
import android.widget.ListView;
import android.widget.TextView;

import com.carmel.bootcamp.tasmia.Deligate.DeligatesInterface;
import com.carmel.bootcamp.tasmia.Model.RequestModel;

import java.util.ArrayList;


public class RequisitionFormTwo extends Fragment {
    ListView listView;
    TextView text;
    DeligatesInterface deligatesInterface;
    View view;
    ImageView Add;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_requisition_form_two, container, false);

        listView = view.findViewById(R.id.ListView);
        final ArrayList<RequestModel> request_models = new ArrayList<>();
        //Created Constructor to call//
        RequestModel request_model = new RequestModel();
        request_model.setData("IBM ThinkServer TS150 Tower Server With Max. Processor 1 x Intel Xeon E3 (Quad Core) E3-1225 v5\"(3.3 GHz /Cache 8 MB)...");
        request_models.add(request_model);

        request_model = new RequestModel();
        request_model.setData("Lenovo ThinkServer TS450 (PN:70M2001VIH) With Max. Processor 1 x Intel Xeon E3 (Quad Core) E3-1225 v5”(3.3 GHz /Cache ");
        request_models.add(request_model);

        request_model = new RequestModel();
        request_model.setData("IBM X3300M4 Server With x3300M4/ Part NO:7382IA4/ Intel Xeon E5 1230v2 1.8 GHz,10 MB,1066MHz/ 1x 8GB RAM/ 1x500GB SATA HDD/ 3.5Simple-Swap/ MULTI BUTRNER");
        request_models.add(request_model);

        request_model = new RequestModel();
        request_model.setData("IBM Lenovo ThinkServer RD450 Rack Server (PN:70Q90059IH) with 1 x Intel® Xeon® E5-2620v4 (2.1GHz/8C/20MB/85W/2133Mhz)");
        request_models.add(request_model);

        Add = view.findViewById(R.id.AddItems);
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AddItemsPopUp myFragment = new AddItemsPopUp();

                FragmentManager fragmentManager = getFragmentManager();

                fragmentManager.popBackStackImmediate(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.add(R.id.fragment, myFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        ListAdapter listAdapter = new com.carmel.bootcamp.tasmia.ListAdapter(view.getContext(), request_models);
        listView.setAdapter(listAdapter);
        return view;
    }

    public void setDeligatesInterface(DeligatesInterface deligatesInterface) {
        this.deligatesInterface = deligatesInterface;
    }
}
