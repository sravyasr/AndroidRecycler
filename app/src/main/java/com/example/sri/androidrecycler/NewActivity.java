package com.example.sri.androidrecycler;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        tv=findViewById(R.id.textview);
        //Declaring a string and getting the assigned values using a key called "name"
        String s=getIntent().getStringExtra("name");
        tv.setText(s);
    }
}
