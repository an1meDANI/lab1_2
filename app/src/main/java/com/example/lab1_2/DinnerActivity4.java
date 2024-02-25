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

public class DinnerActivity4 extends AppCompatActivity {
    Button buttonDinnerBack_4, buttonDinner4Timer, buttonDinner4Timer2, buttonDinner4Timer3;
    TextView textViewDinner4Time, textViewDinner4Time2, textViewDinner4Time3;
    CountDownTimer timer, timer2, timer3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner4);

        buttonDinnerBack_4 = findViewById(R.id.buttonDinnerBack_4);
        buttonDinner4Timer = findViewById(R.id.buttonDinner4Timer);
        buttonDinner4Timer2 = findViewById(R.id.buttonDinner4Timer2);
        buttonDinner4Timer3 = findViewById(R.id.buttonDinner4Timer3);
        textViewDinner4Time = findViewById(R.id.textViewDinner4Time);
        textViewDinner4Time2 = findViewById(R.id.textViewDinner4Time2);
        textViewDinner4Time3 = findViewById(R.id.textViewDinner4Time3);

        buttonDinner4Timer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (timer != null){
                    timer.cancel();
                    buttonDinner4Timer.setText(getString(R.string.n2));
                    buttonDinner4Timer.setBackgroundColor(Color.parseColor("#6750A4"));
                    timer = null;
                    textViewDinner4Time.setText("00:00");
                } else {
                    buttonDinner4Timer.setText(getString(R.string.cancel));
                    buttonDinner4Timer.setBackgroundColor(Color.RED);
                    timer = new CountDownTimer(300000,1000) {
                        @Override
                        public void onTick(long l) {
                            NumberFormat f = new DecimalFormat("00");
                            long sec = l / 1000;
                            long min = sec / 60;
                            sec = sec % 60;
                            String time = f.format(min) + ":" + f.format(sec);
                            textViewDinner4Time.setText(time);
                        }

                        @Override
                        public void onFinish() {
                            buttonDinner4Timer.setText(getString(R.string.n2));
                            buttonDinner4Timer.setBackgroundColor(Color.parseColor("#6750A4"));
                        }
                    };
                    timer.start();
                }
            }
        });

        buttonDinner4Timer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (timer2 != null){
                    timer2.cancel();
                    buttonDinner4Timer2.setText(getString(R.string.n4));
                    buttonDinner4Timer2.setBackgroundColor(Color.parseColor("#6750A4"));
                    timer2 = null;
                    textViewDinner4Time2.setText("00:00");
                } else {
                    buttonDinner4Timer2.setText(getString(R.string.cancel));
                    buttonDinner4Timer2.setBackgroundColor(Color.RED);
                    timer2 = new CountDownTimer(900000,1000) {
                        @Override
                        public void onTick(long l) {
                            NumberFormat f = new DecimalFormat("00");
                            long sec = l / 1000;
                            long min = sec / 60;
                            sec = sec % 60;
                            String time = f.format(min) + ":" + f.format(sec);
                            textViewDinner4Time2.setText(time);
                        }

                        @Override
                        public void onFinish() {
                            buttonDinner4Timer2.setText(getString(R.string.n4));
                            buttonDinner4Timer2.setBackgroundColor(Color.parseColor("#6750A4"));
                        }
                    };
                    timer2.start();
                }
            }
        });

        buttonDinner4Timer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (timer3 != null){
                    timer3.cancel();
                    buttonDinner4Timer3.setText(getString(R.string.n5));
                    buttonDinner4Timer3.setBackgroundColor(Color.parseColor("#6750A4"));
                    timer3 = null;
                    textViewDinner4Time3.setText("00:00");
                } else {
                    buttonDinner4Timer3.setText(getString(R.string.cancel));
                    buttonDinner4Timer3.setBackgroundColor(Color.RED);
                    timer3 = new CountDownTimer(120000,1000) {
                        @Override
                        public void onTick(long l) {
                            NumberFormat f = new DecimalFormat("00");
                            long sec = l / 1000;
                            long min = sec / 60;
                            sec = sec % 60;
                            String time = f.format(min) + ":" + f.format(sec);
                            textViewDinner4Time3.setText(time);
                        }

                        @Override
                        public void onFinish() {
                            buttonDinner4Timer3.setText(getString(R.string.n5));
                            buttonDinner4Timer3.setBackgroundColor(Color.parseColor("#6750A4"));
                        }
                    };
                    timer3.start();
                }
            }
        });

        buttonDinnerBack_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DinnerActivity4.this, DinnerActivity.class);
                startActivity(intent);
            }
        });
    }
}