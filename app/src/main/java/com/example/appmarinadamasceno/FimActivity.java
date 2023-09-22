package com.example.appmarinadamasceno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class FimActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fim);

        findViewById(R.id.btnparte3);
    }
    public void Loja(View v) {
        Intent intentFim = new Intent(FimActivity.this, lojaActivity.class);
        startActivity(intentFim);
    }
    public void Site(View v) {
        Uri web = Uri.parse("https://www.portaldomeioambiente.com.br");
        Intent siteIntent = new Intent(Intent.ACTION_VIEW, web);
        startActivity(siteIntent);
    }
}