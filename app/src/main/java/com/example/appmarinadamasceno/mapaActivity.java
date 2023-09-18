package com.example.appmarinadamasceno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class mapaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);

        Uri location = Uri.parse("geo:-15.5683531,-56.0696463?z=17");
        Intent mapaIntent = new Intent(Intent.ACTION_VIEW,location);
        startActivity(mapaIntent);
    }
}