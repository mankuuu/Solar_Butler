package com.example.solar_butler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DynAnswer extends AppCompatActivity {
    TextView summer, winter, spring, average;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dyn_answer);
        summer = (TextView) findViewById(R.id.summer);
        winter = (TextView) findViewById(R.id.winter);
        spring = (TextView) findViewById(R.id.spring);
        average = (TextView) findViewById(R.id.average);
        float lati = getIntent().getFloatExtra("lati", 0);
        calc(lati);


    }
    private void calc(float lati) {
        float sum_tilt, win_tilt, spr_tilt;
        int avg_tilt;
        sum_tilt = (float) Math.abs(((lati * 0.9) - 23.5));
        win_tilt = (float) ((lati * 0.9) + 29);
        spr_tilt = (float) Math.abs(lati - 2.5);
        avg_tilt = (int) ((sum_tilt + win_tilt + spr_tilt) / 3);
        summer.setText(sum_tilt + "");
        winter.setText(win_tilt + "");
        spring.setText(spr_tilt + "");
        average.setText(avg_tilt + "");
    }
}