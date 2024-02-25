package com.example.lab1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class DinnerActivity2 extends AppCompatActivity {
    Button buttonDinnerBack_2, buttonDinner2Timer, buttonDinner2Timer2, buttonDinner2Timer3;
    TextView textViewDinner2Time, textViewDinner2Time2, textViewDinner2Time3;
    CountDownTimer timer, timer2, timer3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner2);

        buttonDinnerBack_2 = findViewById(R.id.buttonDinnerBack_2);
        buttonDinner2Timer = findViewById(R.id.buttonDinner2Timer);
        buttonDinner2Timer2 = findViewById(R.id.buttonDinner2Timer2);
        buttonDinner2Timer3 = findViewById(R.id.buttonDinner2Timer3);
        textViewDinner2Time = findViewById(R.id.textViewDinner2Time);
        textViewDinner2Time2 = findViewById(R.id.textViewDinner2Time2);
        textViewDinner2Time3 = findViewById(R.id.textViewDinner2Time3);

        buttonDinner2Timer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (timer != null){
                    timer.cancel();
                    buttonDinner2Timer.setText(getString(R.string.n2));
                    buttonDinner2Timer.setBackgroundColor(Color.parseColor("#6750A4"));
                    timer = null;
                    textViewDinner2Time.setText("00:00");
                } else {
                    buttonDinner2Timer.setText(getString(R.string.cancel));
                    buttonDinner2Timer.setBackgroundColor(Color.RED);
                    timer = new CountDownTimer(600000,1000) {
                        @Override
                        public void onTick(long l) {
                            NumberFormat f = new DecimalFormat("00");
                            long sec = l / 1000;
                            long min = sec / 60;
                            sec = sec % 60;
                            String time = f.format(min) + ":" + f.format(sec);
                            textViewDinner2Time.setText(time);
                        }

                        @Override
                        public void onFinish() {
                            buttonDinner2Timer.setText(getString(R.string.n2));
                            buttonDinner2Timer.setBackgroundColor(Color.parseColor("#6750A4"));
                        }
                    };
                    timer.start();
                }
            }
        });

        buttonDinner2Timer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (timer2 != null){
                    timer2.cancel();
                    buttonDinner2Timer2.setText(getString(R.string.n4));
                    buttonDinner2Timer2.setBackgroundColor(Color.parseColor("#6750A4"));
                    timer2 = null;
                    textViewDinner2Time2.setText("00:00");
                } else {
                    buttonDinner2Timer2.setText(getString(R.string.cancel));
                    buttonDinner2Timer2.setBackgroundColor(Color.RED);
                    timer2 = new CountDownTimer(240000,1000) {
                        @Override
                        public void onTick(long l) {
                            NumberFormat f = new DecimalFormat("00");
                            long sec = l / 1000;
                            long min = sec / 60;
                            sec = sec % 60;
                            String time = f.format(min) + ":" + f.format(sec);
                            textViewDinner2Time2.setText(time);
                        }

                        @Override
                        public void onFinish() {
                            buttonDinner2Timer2.setText(getString(R.string.n4));
                            buttonDinner2Timer2.setBackgroundColor(Color.parseColor("#6750A4"));
                        }
                    };
                    timer2.start();
                }
            }
        });

        buttonDinner2Timer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (timer3 != null){
                    timer3.cancel();
                    buttonDinner2Timer3.setText(getString(R.string.n5));
                    buttonDinner2Timer3.setBackgroundColor(Color.parseColor("#6750A4"));
                    timer3 = null;
                    textViewDinner2Time3.setText("00:00");
                } else {
                    buttonDinner2Timer3.setText(getString(R.string.cancel));
                    buttonDinner2Timer3.setBackgroundColor(Color.RED);
                    timer3 = new CountDownTimer(900000,1000) {
                        @Override
                        public void onTick(long l) {
                            NumberFormat f = new DecimalFormat("00");
                            long sec = l / 1000;
                            long min = sec / 60;
                            sec = sec % 60;
                            String time = f.format(min) + ":" + f.format(sec);
                            textViewDinner2Time3.setText(time);
                        }

                        @Override
                        public void onFinish() {
                            buttonDinner2Timer3.setText(getString(R.string.n5));
                            buttonDinner2Timer3.setBackgroundColor(Color.parseColor("#6750A4"));
                        }
                    };
                    timer3.start();
                }
            }
        });

        buttonDinnerBack_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DinnerActivity2.this, DinnerActivity.class);
                startActivity(intent);
            }
        });
    }
}