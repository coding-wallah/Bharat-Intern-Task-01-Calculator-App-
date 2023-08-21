package com.aditya.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class activity_fahrenheit_celsius extends AppCompatActivity {


   Button b,b1;
    EditText e;
    TextView t;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fahrenheit_celsius);

        b=findViewById(R.id.button7);
        b1=findViewById(R.id.button);
        e=findViewById(R.id.editTextText);
        t=findViewById(R.id.result3);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(activity_fahrenheit_celsius.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e.getText().toString();
                Double i=Double.parseDouble(s1);
                Double r=(5*(i-32))/9;
                String s2=r.toString();
                t.setText(s2);
            }
        });
    }
}