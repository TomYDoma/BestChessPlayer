package com.example.bestchessplayer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class regmatch extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.regmatch);
    }


    public void regmatch_one_click(View view) {
        Intent intent = new Intent(regmatch.this, allMatch.class);
        startActivity(intent);
    }
}