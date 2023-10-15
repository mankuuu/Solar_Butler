package com.example.solar_butler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class QuickMode extends AppCompatActivity {
    Button submit;
    Spinner city;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.println("Hello");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quick_mode);
        submit = (Button) findViewById(R.id.qsubmit);
        city = (Spinner) findViewById(R.id.spinner);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cityname = city.getSelectedItem().toString();
                System.out.println(cityname);
                Intent intent = new Intent(QuickMode.this, QuickAnswer.class);
                intent.putExtra("city", cityname);
                startActivity(intent);

            }
        });
    }
}