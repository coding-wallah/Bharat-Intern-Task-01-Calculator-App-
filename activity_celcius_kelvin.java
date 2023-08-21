package com.aditya.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class activity_celcius_kelvin extends AppCompatActivity {


    Button b,b1;
    EditText e;
    TextView t;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celcius_kelvin);


        b=findViewById(R.id.button13);
        b1=findViewById(R.id.button12);
        e=findViewById(R.id.editTextText4);
        t=findViewById(R.id.result6);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(activity_celcius_kelvin.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e.getText().toString();
                Double i=Double.parseDouble(s1);
                Double r=273.15+i;
                String s2=r.toString();
                t.setText(s2);
            }
        });

    }
}