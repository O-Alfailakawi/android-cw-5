package com.example.classwork2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle n = getIntent().getExtras();
        String text = n.getString("O");
        TextView Tv = findViewById(R.id.Tv2);
        Tv.setText(text);
    }
}