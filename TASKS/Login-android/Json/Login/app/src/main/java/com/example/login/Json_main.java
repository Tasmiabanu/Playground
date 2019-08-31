package com.example.login;

import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.StringReader;

public class Json_main extends AppCompatActivity {
    String title[],date[],status[],text;
    Button loadData;
    RecyclerView recycler;

    String url="https://wonder-stricken-str.000webhostapp.com/requestpage.json.txt";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json_main);
        loadData=findViewById(R.id.loadData);
        recycler=findViewById(R.id.recyclerView);
        loadData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringRequest request=new StringRequest(url, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        responseJSONData(response);
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(getApplicationContext(),"There is an error", Toast.LENGTH_LONG).show();
                    }

            });
                RequestQueue rQueue = Volley.newRequestQueue(Json_main.this);
                rQueue.add(request);
            }
        });
    }

    public void responseJSONData(String response) {
        Log.d("Response",response);
        try {
            JSONObject jsonObject=new JSONObject(response);
            Log.d("JSON", String.valueOf(jsonObject));
            recycler.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
            Json_adapter jsonAdapter=new Json_adapter(getApplicationContext(),jsonObject);
            recycler.setAdapter(jsonAdapter);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

}
