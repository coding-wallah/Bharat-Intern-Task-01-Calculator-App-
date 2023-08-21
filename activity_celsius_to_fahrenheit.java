package com.aditya.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class activity_celsius_to_fahrenheit extends AppCompatActivity {
    Button b,b1;
    TextView t;
    EditText e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celsius_to_fahrenheit);


        b=findViewById(R.id.button25);
        b1=findViewById(R.id.button23);
        t=findViewById(R.id.result2);
        e=findViewById(R.id.editText1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(activity_celsius_to_fahrenheit.this,MainActivity.class);
                startActivity(intent);
                finish();

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e.getText().toString();
                Double i=Double.parseDouble(s1);
                Double r=((i*9)/5)+32;
                String s2=r.toString();
                t.setText(s2);
            }
        });

    }




}