package com.example.bestchessplayer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class registration extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.registration);
    }

    public void login_one_click(View view) {
        EditText login = findViewById(R.id.loginEditText);
        EditText password = findViewById(R.id.passwordEditText);
        EditText lname = findViewById(R.id.lastNameEditText);
        EditText fname = findViewById(R.id.firstNameEditText);
        EditText mname = findViewById(R.id.middleNameEditText);
        EditText ageGroup = findViewById(R.id.ageEditText);

        Intent intent = new Intent(registration.this, profile.class);

        intent.putExtra("login", login.getText().toString());
        intent.putExtra("lname", lname.getText().toString());
        intent.putExtra("fname", fname.getText().toString());
        intent.putExtra("mname", mname.getText().toString());
        intent.putExtra("age", ageGroup.getText().toString());

        startActivity(intent);
    }
}
