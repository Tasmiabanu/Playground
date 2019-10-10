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
import android.widget.TextView;

import com.carmel.bootcamp.tasmia.Deligate.DeligatesInterface;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class RequisitionFormOne extends Fragment {

    Button next;
    View view;
    DeligatesInterface deligatesInterface;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_requisition_form_one, container, false);

        next = (Button) view.findViewById(R.id.button);


        TextView output1 = (TextView) view.findViewById(R.id.option1);

        String strJson = "{ \"Employee\" :[{\"request-id\":\"123456677\",\"requester-name\":\"Divya\",\"request-type\":\"SELF\"}] }";
        String data1 = "";


        try {
            JSONObject jsonRootObject = new JSONObject(strJson);

            JSONArray jsonArray = jsonRootObject.optJSONArray("Employee");


            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);

                int id = Integer.parseInt(jsonObject.optString("request-id").toString());
                String name = jsonObject.optString("requester-name").toString();
                String type = jsonObject.optString("request-type").toString();

                data1 +=  type + " \n ";


            }
            output1.setText(data1);


        } catch (JSONException e) {
            e.printStackTrace();
        }

        TextView output2 = (TextView) view.findViewById(R.id.option2);

        String strJson2 = "{ \"Employee\" :[{\"request-id\":\"123456677\",\"requester-name\":\"Divya\",\"request-type\":\"TEAM/DEPARTMENT/BRANCH\"}] }";

        String data2 = "";


        try {
            JSONObject jsonRootObject2 = new JSONObject(strJson2);

            JSONArray jsonArray2 = jsonRootObject2.optJSONArray("Employee");


            for (int i = 0; i < jsonArray2.length(); i++) {
                JSONObject jsonObject2 = jsonArray2.getJSONObject(i);

                int id = Integer.parseInt(jsonObject2.optString("request-id").toString());
                String name = jsonObject2.optString("requester-name").toString();
                String type = jsonObject2.optString("request-type").toString();

                data2 +=  type + " \n ";


            }
            output2.setText(data2);


        } catch (JSONException e) {
            e.printStackTrace();
        }


        TextView output3 = (TextView) view.findViewById(R.id.option3);

        String strJson3 = "{ \"Employee\" :[{\"request-id\":\"123456677\",\"requester-name\":\"Divya\",\"request-type\":\"SOMEONE ELSE\"}] }";

        String data3 = "";


        try {
            JSONObject jsonRootObject3 = new JSONObject(strJson3);

            JSONArray jsonArray3 = jsonRootObject3.optJSONArray("Employee");


            for (int i = 0; i < jsonArray3.length(); i++) {
                JSONObject jsonObject2 = jsonArray3.getJSONObject(i);

                int id = Integer.parseInt(jsonObject2.optString("request-id").toString());
                String name = jsonObject2.optString("requester-name").toString();
                String type = jsonObject2.optString("request-type").toString();

                data3 += type + " \n ";


            }
            output3.setText(data3);


        } catch (JSONException e) {
            e.printStackTrace();
        }


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                RequisitionFormTwo myFragment = new RequisitionFormTwo();

                FragmentManager fragmentManager = getFragmentManager();

                //  fragmentManager.popBackStackImmediate(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.add(R.id.fragment, myFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        return view;
    }

    public void setDeligatesInterface(MainActivity mainActivity) {
        this.deligatesInterface = deligatesInterface;
    }
}
