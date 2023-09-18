package com.example.appmarinadamasceno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class siteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_site);

        Uri uriSite = Uri.parse("https://www.ambientebrasil.com.br");
        Intent intentSite = new Intent(Intent.ACTION_VIEW,uriSite);
        startActivity(intentSite);
    }
}