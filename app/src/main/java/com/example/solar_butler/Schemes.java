package com.example.solar_butler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Schemes extends AppCompatActivity {
    WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schemes);
        webview = (WebView) findViewById(R.id.wv);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("https://mnre.gov.in/solar/schemes/");
        WebSettings  webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}