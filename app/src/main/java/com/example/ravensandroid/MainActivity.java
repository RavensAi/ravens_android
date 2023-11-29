package com.example.ravensandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.webkit.WebView;
import androidx.webkit.WebSettings;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("https://app.ravens.ir/");

        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setAllowFileAccess(true);
    }
}