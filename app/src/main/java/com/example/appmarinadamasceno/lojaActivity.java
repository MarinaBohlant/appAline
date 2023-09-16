package com.example.appmarinadamasceno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lojaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loja);

        findViewById(R.id.btnvoltar);
    }
    public void Comeco(View v) {
        Intent intentLoja = new Intent(lojaActivity.this, MainActivity.class);
        startActivity(intentLoja);
    }
}