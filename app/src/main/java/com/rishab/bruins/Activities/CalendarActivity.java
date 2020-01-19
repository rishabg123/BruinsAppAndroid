package com.rishab.bruins.Activities;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.rishab.bruins.R;


public class CalendarActivity extends AppCompatActivity {


    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        WebView browser = findViewById(R.id.webView);
        WebSettings webSettings = browser.getSettings();
        webSettings.setJavaScriptEnabled(true);

browser.loadUrl("https://calendar.google.com/calendar/embed?mode=AGENDA&height=1000&wkst=1&bgcolor=%23FFFFFF&src=santaclarahighcal%40scusd.net&color=%232952A3&ctz=America%2FLos_Angeles");



    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
        return true;
    }

}
