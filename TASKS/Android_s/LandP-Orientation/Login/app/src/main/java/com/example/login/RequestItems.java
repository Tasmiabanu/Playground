package com.example.login;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListPopupWindow;
import android.widget.ListView;
import android.widget.TextView;

import com.example.login.Deligate.DeligatesInterface;
import com.example.login.Global.Request_status;
import com.example.login.ItemsModel.RequestViewItems;
import com.example.login.Model.Request_model;

import java.util.ArrayList;

public class RequestItems extends Fragment {
    ListView listView;
    ImageView filterOption;
    ListPopupWindow listPopupWindow;
    TextView text;
    Button request;
  DeligatesInterface deligatesInterface;
  View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       view= inflater.inflate(R.layout.fragment_request_items, container, false);
        listPopupWindow= new ListPopupWindow(getContext());

        String[] items={" Clear", " Approved", " Draft"," Reject"};

        filterOption=view.findViewById(R.id.imageView11);

        listPopupWindow.setAdapter(new ArrayAdapter(getContext(),R.layout.filter_icon_popup, items));
        listPopupWindow.setAnchorView(filterOption);
        listPopupWindow.setModal(true);
        filterOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listPopupWindow.show();
            }
        });



request=view.findViewById(R.id.button4);
      listView=view.findViewById(R.id.listView);
        final ArrayList<Request_model> request_models=new ArrayList<>();

        Request_model request_model=new Request_model();

        request_model.setReqNumber("PUR-056");
        request_model.setRequest_status(Request_status.APPROVED);
        request_model.setRequestDate("06 Jul 2019");
        request_models.add(request_model);

        request_model=new Request_model();
        request_model.setReqNumber("PUR-057");
        request_model.setRequest_status(Request_status.AWAITING_APPROVAL);
        request_model.setRequestDate("07 Jul 2019");
        request_models.add(request_model);

        request_model=new Request_model();
        request_model.setReqNumber("PUR-058");
        request_model.setRequest_status(Request_status.REJECTED);
        request_model.setRequestDate("08 Jul 2019");
        request_models.add(request_model);

        request_model=new Request_model();
        request_model.setReqNumber("PUR-059");
        request_model.setRequest_status(Request_status.DRAFT);
        request_model.setRequestDate("09 Jul 2019");
        request_models.add(request_model);

        request_model=new Request_model();
        request_model.setReqNumber("PUR-057");
        request_model.setRequest_status(Request_status.APPROVED);
        request_model.setRequestDate("10 Jul 2019");
        request_models.add(request_model);

        request_model=new Request_model();
        request_model.setReqNumber("PUR-058");
        request_model.setRequest_status(Request_status.AWAITING_APPROVAL);
        request_model.setRequestDate("08 Jul 2019");
        request_models.add(request_model);

request.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(getContext(),Request_form.class);
        startActivity(intent);
    }
});

       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
         @Override
         public void onItemClick(AdapterView<?> adapterView, View view, int i, long arg) {
           Request_model request_model=request_models.get(i);
           if (deligatesInterface !=null){
             deligatesInterface.RequestItemOnClick(request_model);
           }
         }
       });

        ListAdapter listAdapter= new list_adapter(view.getContext(),request_models);
        listView.setAdapter(listAdapter);

        return view;
    }
    public void setDeligatesInterface(DeligatesInterface deligatesInterface){
      this.deligatesInterface=deligatesInterface;
    }

}