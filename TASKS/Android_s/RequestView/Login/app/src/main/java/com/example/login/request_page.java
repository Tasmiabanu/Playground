package com.example.login;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;

import com.example.login.Global.Request_status;
import com.example.login.Model.Request_model;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListPopupWindow;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class request_page extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    ImageView filterOption;
    ListPopupWindow listPopupWindow;
    TextView text;
    ListView listView;
    Button request;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_page2);

        filterOption = findViewById(R.id.imageView11);
        listView=findViewById(R.id.listView);
        final ArrayList<Request_model> request_models=new ArrayList<>();

        Request_model request_model=new Request_model();

        request_model.setReqNumber("PUR-056");
        request_model.setRequest_status(Request_status.APPROVED);
        request_model.setRequestDate("06 Jul 2019");
        request_models.add(request_model);



        request_model=new Request_model();
        request_model.setReqNumber("PUR-057");
        request_model.setRequest_status(Request_status.AWAITING_APPROVAL);
        request_model.setRequestDate("06 Jun 2019");
        request_models.add(request_model);

        request_model=new Request_model();
        request_model.setReqNumber("PUR-057");
        request_model.setRequest_status(Request_status.REJECTED);
        request_model.setRequestDate("07 Jun 2019");
        request_models.add(request_model);

        request_model=new Request_model();
        request_model.setReqNumber("PUR-057");
        request_model.setRequest_status(Request_status.DRAFT);
        request_model.setRequestDate("08 JuL 2019");
        request_models.add(request_model);

        listView= findViewById(R.id.listView);


//        row.setOnClickListener(new AdapterView.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Cursor data= list_adapter.getItemId(request_models.getReqNumber());
//            }
//        });

     listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
         @Override
         public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
             Intent intent=new Intent(request_page.this,RequestView.class);


             Request_model request=request_models.get(i);

             Bundle requestDataBundle=new Bundle();
             requestDataBundle.putString("RequestNo",request.getReqNumber());
             requestDataBundle.putString("RequestDate",request.getRequestDate());
             requestDataBundle.putString("RequestStatus",request.getRequest_status().toString());

             intent.putExtra("request",requestDataBundle);

            startActivity(intent);

       }
        });


        ListAdapter listAdapter= new list_adapter(getApplicationContext(),request_models);
        listView.setAdapter(listAdapter);

        listPopupWindow= new ListPopupWindow(getApplicationContext());

        String[] items={" Clear", " Approved", " Draft"," Reject"};

        listPopupWindow.setAdapter(new ArrayAdapter(getApplicationContext(),R.layout.filter_icon_popup, items));
        listPopupWindow.setAnchorView(filterOption);
        listPopupWindow.setModal(true);
        filterOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listPopupWindow.show();
            }
        });

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        request = findViewById(R.id.button4);
        request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Request_form.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.request_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.nav_home) {

        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_tools) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
