package com.example.appmarinadamasceno;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnentrar);
    }
    public void Login(View v){
        Intent intentMain = new Intent(MainActivity.this, loginActivity.class);
        startActivity(intentMain);
    }
}