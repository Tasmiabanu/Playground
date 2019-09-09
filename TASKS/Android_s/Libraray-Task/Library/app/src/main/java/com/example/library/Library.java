package com.example.library;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import static android.widget.Toast.LENGTH_SHORT;

public class Library extends AppCompatActivity {
    public Library(String abc, String fifth, String s) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int price;
    String author,edition;
   public Library( String author,String edition, int price){
       this.author=author;
       this.edition=edition;
       this.price=price;
   }
    public void Library(Context applicationContext) {
        Toast.makeText(applicationContext,"this is demo", LENGTH_SHORT).show();
    }
}
