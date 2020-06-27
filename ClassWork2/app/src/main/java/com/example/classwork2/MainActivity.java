package com.example.classwork2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




       final EditText ET = findViewById(R.id.ET);
        final Button AC2 = findViewById(R.id.Activity2);
        Button AC3 = findViewById(R.id.Activity3);


        AC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent GoTo2 = new Intent(MainActivity.this, MainActivity2.class);
                GoTo2.putExtra("O",ET.getText().toString());
                startActivity(GoTo2);


            }
        });



        AC3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent GoTo3 = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(GoTo3);
            }
        });


    }
}