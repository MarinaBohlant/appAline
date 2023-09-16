package com.example.appmarinadamasceno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LogadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logado);

        findViewById(R.id.btncomeco);
    }
    public void Introducao(View v) {
        Intent intentLogado = new Intent(LogadoActivity.this, introducaoActivity.class);
        startActivity(intentLogado);
    }
}