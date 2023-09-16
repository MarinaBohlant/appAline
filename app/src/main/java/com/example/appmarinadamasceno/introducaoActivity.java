package com.example.appmarinadamasceno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class introducaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introducao);

        findViewById(R.id.btnparte1);
    }
    public void Desenvolvimento(View v) {
        Intent intentIntroducao = new Intent(introducaoActivity.this, desenvolvimentoActivity.class);
        startActivity(intentIntroducao);
    }
}