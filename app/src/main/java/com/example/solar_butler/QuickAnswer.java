package com.example.solar_butler;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Map;
import java.util.Iterator;

import android.os.Bundle;
import android.widget.TextView;
import java.util.Calendar;
import java.util.HashMap;

public class QuickAnswer extends AppCompatActivity {
    Map<String , int[]> mp = new HashMap<>();
    int[] Bengaluru = {29, 21, 13, 5, 0, 0, 0, 5, 12, 21, 29, 36, 5, 36, 13};
    int[] Chennai = {29, 21, 13, 5, 0, 0, 0, 5, 13, 21, 29, 36, 5, 36, 13};
    int[] Delhi = {45, 37, 29, 21, 13, 6, 13, 21, 29, 37, 45, 52, 6, 52, 29};
    int[] Kolkata = {39, 31, 23, 15, 7, 0, 7, 15, 23, 31, 39, 46, 0, 46, 23};
    int[] Mumbai = {35, 27, 19, 11, 3, 0, 3, 11, 19, 27, 35, 42, 6, 42, 19};
    String[] monthName = {"January", "February",
            "March", "April", "May", "June", "July",
            "August", "September", "October", "November",
            "December"};
    TextView city, month, angle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quick_answer);
        mp.put("Bengaluru", Bengaluru);
        mp.put("Chennai", Chennai);
        mp.put("Delhi", Delhi);
        mp.put("Kolkata", Kolkata);
        mp.put("Mumbai", Mumbai);
        city = (TextView) findViewById(R.id.city);
        month = (TextView) findViewById(R.id.month);
        angle = (TextView) findViewById(R.id.angle);
        String cityname = getIntent().getStringExtra("city");
        Calendar cal = Calendar.getInstance();
        int index = cal.get(Calendar.MONTH);
        String months = monthName[index];
        city.setText(cityname);
        month.setText(months);
        int[] value = mp.get(cityname);
        assert value != null;
        int ans = value[index];
        angle.setText(ans + "");

    }
}