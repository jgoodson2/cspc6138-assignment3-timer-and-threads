package com.example.jgoodson2.cpsc6138_assignment3_timer_and_threads;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToCalc(View view) {
        Intent i = new Intent(this, Calculator.class);
        startActivity(i);
    }
}
