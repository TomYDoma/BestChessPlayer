package com.example.bestchessplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void login_click(View view) {
        Intent intent = new Intent(MainActivity.this, login.class);
        startActivity(intent);
    }

    public void registration_click(View view) {
        Intent intent = new Intent(MainActivity.this, registration.class);
        startActivity(intent);
    }
}