package com.aditya.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class activity_kelvin_fahrenheit extends AppCompatActivity {

    Button b,b1;
    EditText e;
    TextView t;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelvin_fahrenheit);


        b=findViewById(R.id.button11);
        b1=findViewById(R.id.button10);
        e=findViewById(R.id.editTextText3);
        t=findViewById(R.id.result5);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(activity_kelvin_fahrenheit.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e.getText().toString();
                Double i=Double.parseDouble(s1);
                Double r=((i-273.15)*1.8)+32;
                String s2=r.toString();
                t.setText(s2);
            }
        });
    }
}

