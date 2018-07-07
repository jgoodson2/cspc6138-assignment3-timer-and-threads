package com.example.jgoodson2.cpsc6138_assignment3_timer_and_threads;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Timer extends AppCompatActivity {

    private int hours = 0;
    private int minutes = 0;
    private int seconds = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);
    }

    public void goToMenu(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void clearTimer(View view) {
        hours = 0;
        minutes = 0;
        seconds = 0;
        TextView txtHours = (TextView) findViewById(R.id.txtHours);
        TextView txtMin = (TextView) findViewById(R.id.txtMin);
        TextView txtSec = (TextView) findViewById(R.id.txtSec);
        txtHours.setText(R.string._0);
        txtMin.setText(R.string._00);
        txtSec.setText(R.string._00);

    }

    public void addHour(View view) {
        TextView txtHours = (TextView) findViewById(R.id.txtHours);
        if (!txtHours.getText().toString().equals("9")) {
            hours++;
            txtHours.setText(String.valueOf(hours));
            System.out.println("hours = " + hours);
        }
    }

    public void subtractHour(View view) {
        TextView txtHours = (TextView) findViewById(R.id.txtHours);
        if (!txtHours.getText().toString().equals("0")) {
            hours--;
            txtHours.setText(String.valueOf(hours));
            System.out.println("hours = " + hours);
        }
    }

    public void addMin(View view) {
        TextView txtMin = (TextView) findViewById(R.id.txtMin);
        if (!txtMin.getText().toString().equals("59")) {
            minutes++;
            txtMin.setText(String.valueOf(minutes));
            System.out.println("minutes = " + minutes);
        }
    }

    public void subtractMin(View view) {
        TextView txtMin = (TextView) findViewById(R.id.txtMin);
        if (Integer.parseInt(txtMin.getText().toString()) > 0) {
            minutes--;
            txtMin.setText(String.valueOf(minutes));
            System.out.println("minutes = " + minutes);
        }
    }

    public void addSec(View view) {
        TextView txtSec = (TextView) findViewById(R.id.txtSec);
        if (!txtSec.getText().toString().equals("59")) {
            seconds++;
            txtSec.setText(String.valueOf(seconds));
            System.out.println("seconds = " + seconds);
        }
    }

    public void subtractSec(View view) {
        TextView txtSec = (TextView) findViewById(R.id.txtSec);
        if (Integer.parseInt(txtSec.getText().toString()) > 0) {
            seconds--;
            txtSec.setText(String.valueOf(seconds));
            System.out.println("minutes = " + seconds);
        }
    }

    Handler timerEnd = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            Toast.makeText(Timer.this, R.string.timerFinished, Toast.LENGTH_LONG).show();
        }
    };

    public void startTimer(View view) {

        Runnable r = new Runnable() {
            @Override
            public void run() {
                int numSecRemaining = seconds + minutes * 60 + hours * 60 * 60;
                System.out.println("numSecRemaining = " + numSecRemaining);
                for (int i = 0; i < numSecRemaining; ++i) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    decrementTimer();
                }
                System.out.println("timer done");
                timerEnd.sendEmptyMessage(0);
            }
        };

        Thread timerThread = new Thread(r);
        timerThread.start();
    }

    public void decrementTimer() {
        TextView txtHours = (TextView) findViewById(R.id.txtHours);
        TextView txtMin = (TextView) findViewById(R.id.txtMin);
        TextView txtSec = (TextView) findViewById(R.id.txtSec);
        if (Integer.parseInt(txtSec.getText().toString()) > 0) {
            txtSec.setText(String.valueOf(Integer.parseInt(txtSec.getText().toString()) - 1));
            seconds--;
        } else {
            txtSec.setText("59");
            seconds = 59;
            if (Integer.parseInt(txtMin.getText().toString()) > 0) {
                txtMin.setText(String.valueOf(Integer.parseInt(txtMin.getText().toString()) - 1));
                minutes--;
            } else {
                txtMin.setText("59");
                minutes = 59;
                if (Integer.parseInt(txtHours.getText().toString()) > 0) {
                    txtHours.setText(String.valueOf(Integer.parseInt(txtHours.getText().toString()) - 1));
                    hours--;
                }
            }
        }
    }
}
