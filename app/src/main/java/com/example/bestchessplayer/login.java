package com.example.bestchessplayer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.login);
    }

    public void login_one_click(View view) {
        Intent intent = new Intent(login.this, profile.class);
        startActivity(intent);
    }
}
