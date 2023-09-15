package com.example.appmarinadamasceno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class loginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        findViewById(R.id.btnlogin);
    }
    public void Logado(View v) {
        Intent intentLogin = new Intent(loginActivity.this, LogadoActivity.class);
        startActivity(intentLogin);
    }
}