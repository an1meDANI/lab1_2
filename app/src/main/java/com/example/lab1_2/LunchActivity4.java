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

public class LunchActivity4 extends AppCompatActivity {
    Button buttonLunchBack_4, buttonLunch4Timer, buttonLunch4Timer2, buttonLunch4Timer3;
    TextView textViewLunch4Time, textViewLunch4Time2, textViewLunch4Time3;
    CountDownTimer timer, timer2, timer3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch4);

        buttonLunchBack_4 = findViewById(R.id.buttonLunchBack_4);
        buttonLunch4Timer = findViewById(R.id.buttonLunch4Timer);
        buttonLunch4Timer2 = findViewById(R.id.buttonLunch4Timer2);
        buttonLunch4Timer3 = findViewById(R.id.buttonLunch4Timer3);
        textViewLunch4Time = findViewById(R.id.textViewLunch4Time);
        textViewLunch4Time2 = findViewById(R.id.textViewLunch4Time2);
        textViewLunch4Time3 = findViewById(R.id.textViewLunch4Time3);

        buttonLunch4Timer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (timer != null){
                    timer.cancel();
                    buttonLunch4Timer.setText(getString(R.string.n1));
                    buttonLunch4Timer.setBackgroundColor(Color.parseColor("#6750A4"));
                    timer = null;
                    textViewLunch4Time.setText("00:00");
                } else {
                    buttonLunch4Timer.setText(getString(R.string.cancel));
                    buttonLunch4Timer.setBackgroundColor(Color.RED);
                    timer = new CountDownTimer(480000,1000) {
                        @Override
                        public void onTick(long l) {
                            NumberFormat f = new DecimalFormat("00");
                            long sec = l / 1000;
                            long min = sec / 60;
                            sec = sec % 60;
                            String time = f.format(min) + ":" + f.format(sec);
                            textViewLunch4Time.setText(time);
                        }

                        @Override
                        public void onFinish() {
                            buttonLunch4Timer.setText(getString(R.string.n1));
                            buttonLunch4Timer.setBackgroundColor(Color.parseColor("#6750A4"));
                        }
                    };
                    timer.start();
                }
            }
        });

        buttonLunch4Timer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (timer2 != null){
                    timer2.cancel();
                    buttonLunch4Timer2.setText(getString(R.string.n3));
                    buttonLunch4Timer2.setBackgroundColor(Color.parseColor("#6750A4"));
                    timer2 = null;
                    textViewLunch4Time2.setText("00:00");
                } else {
                    buttonLunch4Timer2.setText(getString(R.string.cancel));
                    buttonLunch4Timer2.setBackgroundColor(Color.RED);
                    timer2 = new CountDownTimer(600000,1000) {
                        @Override
                        public void onTick(long l) {
                            NumberFormat f = new DecimalFormat("00");
                            long sec = l / 1000;
                            long min = sec / 60;
                            sec = sec % 60;
                            String time = f.format(min) + ":" + f.format(sec);
                            textViewLunch4Time2.setText(time);
                        }

                        @Override
                        public void onFinish() {
                            buttonLunch4Timer2.setText(getString(R.string.n3));
                            buttonLunch4Timer2.setBackgroundColor(Color.parseColor("#6750A4"));
                        }
                    };
                    timer2.start();
                }
            }
        });

        buttonLunch4Timer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (timer3 != null){
                    timer3.cancel();
                    buttonLunch4Timer3.setText(getString(R.string.n5));
                    buttonLunch4Timer3.setBackgroundColor(Color.parseColor("#6750A4"));
                    timer3 = null;
                    textViewLunch4Time3.setText("00:00");
                } else {
                    buttonLunch4Timer3.setText(getString(R.string.cancel));
                    buttonLunch4Timer3.setBackgroundColor(Color.RED);
                    timer3 = new CountDownTimer(60000,1000) {
                        @Override
                        public void onTick(long l) {
                            NumberFormat f = new DecimalFormat("00");
                            long sec = l / 1000;
                            long min = sec / 60;
                            sec = sec % 60;
                            String time = f.format(min) + ":" + f.format(sec);
                            textViewLunch4Time3.setText(time);
                        }

                        @Override
                        public void onFinish() {
                            buttonLunch4Timer3.setText(getString(R.string.n5));
                            buttonLunch4Timer3.setBackgroundColor(Color.parseColor("#6750A4"));
                        }
                    };
                    timer3.start();
                }
            }
        });

        buttonLunchBack_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LunchActivity4.this, LunchActivity.class);
                startActivity(intent);
            }
        });
    }
}