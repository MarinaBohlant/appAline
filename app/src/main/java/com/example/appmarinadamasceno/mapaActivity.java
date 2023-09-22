package com.example.appmarinadamasceno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class mapaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);

        findViewById(R.id.mapView);
    }
    public void Mapa(View v) {
        Uri local = Uri.parse("geo:-15.5683531,-56.0722212?z=17");
        Intent mapaIntent = new Intent(Intent.ACTION_VIEW, local);
        startActivity(mapaIntent);
    }
}