package com.example.jgoodson2.cpsc6138_assignment3_timer_and_threads;

//import android.graphics.drawable.ColorDrawable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
//import android.graphics.Color;

public class Calculator extends AppCompatActivity {


    String operation = "initial";
    String displayValue = "";
    double val1 = 0.0;
    double val2 = 0.0;
    boolean val1entered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        final TextView display = findViewById(R.id.display);
        final Button button0 = findViewById(R.id.button0);
        final Button button1 = findViewById(R.id.button1);
        final Button button2 = findViewById(R.id.button2);
        final Button button3 = findViewById(R.id.button3);
        final Button button4 = findViewById(R.id.button4);
        final Button button5 = findViewById(R.id.button5);
        final Button button6 = findViewById(R.id.button6);
        final Button button7 = findViewById(R.id.button7);
        final Button button8 = findViewById(R.id.button8);
        final Button button9 = findViewById(R.id.button9);
        final Button buttonDot = findViewById(R.id.buttonDot);
        final Button buttonEq = findViewById(R.id.buttonEq);
        final Button buttonAdd = findViewById(R.id.buttonAdd);
        final Button buttonSubt = findViewById(R.id.buttonSubt);
        final Button buttonMult = findViewById(R.id.buttonMult);
        final Button buttonDiv = findViewById(R.id.buttonDiv);
        final Button buttonDel = findViewById(R.id.buttonDel);

        button1.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        if (val1entered) {
                            display.setText("");
                            val1entered = false;
                        }
                        display.setText(display.getText() + button1.getText().toString());
                    }
                }
        );

        button2.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        if (val1entered) {
                            display.setText("");
                            val1entered = false;
                        }
                        display.setText(display.getText() + button2.getText().toString());
                    }
                }
        );

        button3.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        if (val1entered) {
                            display.setText("");
                            val1entered = false;
                        }
                        display.setText(display.getText() + button3.getText().toString());
                    }
                }
        );

        button4.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        if (val1entered) {
                            display.setText("");
                            val1entered = false;
                        }
                        display.setText(display.getText() + button4.getText().toString());
                    }
                }
        );

        button5.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        if (val1entered) {
                            display.setText("");
                            val1entered = false;
                        }
                        display.setText(display.getText() + button5.getText().toString());
                    }
                }
        );

        button6.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        if (val1entered) {
                            display.setText("");
                            val1entered = false;
                        }
                        display.setText(display.getText() + button6.getText().toString());
                    }
                }
        );

        button7.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        if (val1entered) {
                            display.setText("");
                            val1entered = false;
                        }
                        display.setText(display.getText() + button7.getText().toString());
                    }
                }
        );

        button8.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        if (val1entered) {
                            display.setText("");
                            val1entered = false;
                        }
                        display.setText(display.getText() + button8.getText().toString());
                    }
                }
        );

        button9.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        if (val1entered) {
                            display.setText("");
                            val1entered = false;
                        }
                        display.setText(display.getText() + button9.getText().toString());
                    }
                }
        );

        button0.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        if (val1entered) {
                            display.setText("");
                            val1entered = false;
                        }
                        if (!display.getText().equals("0")) {
                            display.setText(display.getText() + button0.getText().toString());
                        }
                    }
                }
        );

        buttonDot.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        if (display.getText().toString().equals("")) {
                            display.setText(display.getText() + "0.");
                        } else if (!display.getText().toString().contains(".")) {
                            display.setText(display.getText() + ".");
                        }
                    }
                }
        );

        buttonAdd.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        operation = "add";
                        val1 = Double.valueOf(display.getText().toString());
                        buttonAdd.setBackgroundColor(getResources().getColor(R.color.colorButtonOpActive));
                        val1entered = true;
                    }
                }
        );

        buttonSubt.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        operation = "subtract";
                        val1 = Double.valueOf(display.getText().toString());
                        buttonSubt.setBackgroundColor(getResources().getColor(R.color.colorButtonOpActive));
                        val1entered = true;
                    }
                }
        );

        buttonMult.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        operation = "multiply";
                        val1 = Double.valueOf(display.getText().toString());
                        buttonMult.setBackgroundColor(getResources().getColor(R.color.colorButtonOpActive));
                        val1entered = true;
                    }
                }
        );

        buttonDiv.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        operation = "divide";
                        val1 = Double.valueOf(display.getText().toString());
                        buttonDiv.setBackgroundColor(getResources().getColor(R.color.colorButtonOpActive));
                        val1entered = true;
                    }
                }
        );

        buttonEq.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        if (operation.equals("add")) {
                            displayValue = String.valueOf(val1 + Double.valueOf(display.getText().toString()));
                        } else if (operation.equals("subtract")) {
                            displayValue = String.valueOf(val1 - Double.valueOf(display.getText().toString()));
                        } else if (operation.equals("multiply")) {
                            displayValue = String.valueOf(val1 * Double.valueOf(display.getText().toString()));
                        } else if (operation.equals("divide")) {
                            displayValue = String.valueOf(val1 / Double.valueOf(display.getText().toString()));
                        }
                        display.setText(displayValue);
                        operation = "equals";
                    }
                }
        );

        buttonDel.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        if (operation.equals("equals")) {
                            display.setText("");
                            operation = "new";
                            displayValue = "";
                            val1 = 0.0;
                            val2 = 0.0;
                            val1entered = false;
                            buttonAdd.setBackgroundColor(getResources().getColor(R.color.colorButton));
                            buttonSubt.setBackgroundColor(getResources().getColor(R.color.colorButton));
                            buttonMult.setBackgroundColor(getResources().getColor(R.color.colorButton));
                            buttonDiv.setBackgroundColor(getResources().getColor(R.color.colorButton));
                        } else if (!operation.equals("new") && display.getText().toString().length() > 0) {
                            display.setText(display.getText().toString().substring(0, display.getText().toString().length() - 1));
                        }
                    }
                }
        );
    }

    public void goToMenu(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
