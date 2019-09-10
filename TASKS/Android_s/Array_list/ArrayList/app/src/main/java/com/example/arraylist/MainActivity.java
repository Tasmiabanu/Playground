package com.example.arraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button add;
    Button remove;
    Button show;
    TextView text;
    ArrayList <String> ar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add = findViewById(R.id.button1);
        remove=findViewById(R.id.button2);
        show=findViewById(R.id.button3);
        ar=new ArrayList<String>();
        text=findViewById(R.id.textView);

       add.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               ar.add(0,"A");
          ar.add(1,"B");
ar.add(2,"C");ar.add(3,"D");}
});
       remove.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               ar.remove(3);
           }
       });
show.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        for (char i=0; i<ar.size();i++){
text.append(ar.get(i));
    }
}
});
}
}
