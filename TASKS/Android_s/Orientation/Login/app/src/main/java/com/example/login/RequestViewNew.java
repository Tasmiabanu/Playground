package com.example.login;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.login.Model.Request_model;

public class RequestViewNew extends Fragment {
    Request_model requestModel;
    TextView Reqno, Rdate, Rstatus;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_request_view_new, container, false);

        Reqno=view.findViewById(R.id.titles);
        Rdate=view.findViewById(R.id.dates);
        Rstatus=view.findViewById(R.id.statuses);

//        Reqno.setText(requestModel.getReqNumber());
//        Rdate.setText(requestModel.getRequestDate());
//        Rstatus.setText(requestModel.getRequest_status().toString());


           return view;
    }

    public void setData(Request_model requestModel)
    {
        this.requestModel=requestModel;
    }
}

