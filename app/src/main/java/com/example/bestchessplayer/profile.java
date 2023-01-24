package com.example.bestchessplayer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class profile extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.profile);

        String login = "admin";
        String last_name = "Никитин";
        String first_name = "Никита";
        String midle_name = "Никитич";
        String age = "До 14 лет";

        // last_name = getIntent().getExtras().getString("lname");
        // first_name = getIntent().getExtras().getString("fname");
        // midle_name = getIntent().getExtras().getString("mname");

        TextView lNameTextView = findViewById(R.id.last_name);
        TextView fNameTextView = findViewById(R.id.first_name);
        TextView mNameTextView = findViewById(R.id.midle_name);

        lNameTextView.setText(last_name);
        fNameTextView.setText(first_name);
        mNameTextView.setText(midle_name);




    }

    public void match_one_click(View view) {
        Intent intent = new Intent(profile.this, allMatch.class);
        startActivity(intent);
    }

    public void about_one_click(View view) {
        Intent intent = new Intent(profile.this, about.class);
        startActivity(intent);
    }
}
