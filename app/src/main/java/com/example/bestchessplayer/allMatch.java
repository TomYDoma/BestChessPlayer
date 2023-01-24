package com.example.bestchessplayer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class allMatch extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.match);
    }

    public void profile_one_click(View view) {
        Intent intent = new Intent(allMatch.this, profile.class);
        startActivity(intent);
    }

    public void reg_match_one_click(View view) {
        Intent intent = new Intent(allMatch.this, regmatch.class);
        startActivity(intent);
    }

}
