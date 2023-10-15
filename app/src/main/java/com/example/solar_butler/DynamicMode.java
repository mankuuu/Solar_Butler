package com.example.solar_butler;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DynamicMode extends AppCompatActivity {
    EditText input;
    Button submit;

    //    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_mode);
        input = (EditText) findViewById(R.id.inputLat);
        submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = input.getText().toString();
                float lati;
                if(!temp.isEmpty())
                    try
                    {
                        lati= Float.parseFloat(temp);
                        Intent intent = new Intent(DynamicMode.this, DynAnswer.class);
                        intent.putExtra("lati", lati);
                        startActivity(intent);
                        // it means it is double
                    } catch (Exception e1) {
                        // this means it is not double
                        e1.printStackTrace();
                    }

            }
        });
    }
}