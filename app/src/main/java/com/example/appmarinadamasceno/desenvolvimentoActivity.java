package com.example.appmarinadamasceno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class desenvolvimentoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desenvolvimento);

        findViewById(R.id.btnparte2);
    }
    public void Fim(View v) {
        Intent intentDesenvolvimento = new Intent(desenvolvimentoActivity.this, FimActivity.class);
        startActivity(intentDesenvolvimento);
    }
}