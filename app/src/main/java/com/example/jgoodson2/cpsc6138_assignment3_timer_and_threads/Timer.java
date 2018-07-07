package com.example.jgoodson2.cpsc6138_assignment3_timer_and_threads;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Timer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);
    }

    public void goToMenu(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
