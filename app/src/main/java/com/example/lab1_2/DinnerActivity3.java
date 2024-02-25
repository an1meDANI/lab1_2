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

public class DinnerActivity3 extends AppCompatActivity {
    Button buttonDinnerBack_3, buttonDinner3Timer, buttonDinner3Timer2, buttonDinner3Timer3, buttonDinner3Timer4;
    TextView textViewDinner3Time, textViewDinner3Time2, textViewDinner3Time3, textViewDinner3Time4;
    CountDownTimer timer, timer2, timer3, timer4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner3);

        buttonDinnerBack_3 = findViewById(R.id.buttonDinnerBack_3);
        buttonDinner3Timer = findViewById(R.id.buttonDinner3Timer);
        buttonDinner3Timer2 = findViewById(R.id.buttonDinner3Timer2);
        buttonDinner3Timer3 = findViewById(R.id.buttonDinner3Timer3);
        buttonDinner3Timer4 = findViewById(R.id.buttonDinner3Timer4);
        textViewDinner3Time = findViewById(R.id.textViewDinner3Time);
        textViewDinner3Time2 = findViewById(R.id.textViewDinner3Time2);
        textViewDinner3Time3 = findViewById(R.id.textViewDinner3Time3);
        textViewDinner3Time4 = findViewById(R.id.textViewDinner3Time4);

        buttonDinner3Timer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (timer != null){
                    timer.cancel();
                    buttonDinner3Timer.setText(getString(R.string.n2));
                    buttonDinner3Timer.setBackgroundColor(Color.parseColor("#6750A4"));
                    timer = null;
                    textViewDinner3Time.setText("00:00");
                } else {
                    buttonDinner3Timer.setText(getString(R.string.cancel));
                    buttonDinner3Timer.setBackgroundColor(Color.RED);
                    timer = new CountDownTimer(300000,1000) {
                        @Override
                        public void onTick(long l) {
                            NumberFormat f = new DecimalFormat("00");
                            long sec = l / 1000;
                            long min = sec / 60;
                            sec = sec % 60;
                            String time = f.format(min) + ":" + f.format(sec);
                            textViewDinner3Time.setText(time);
                        }

                        @Override
                        public void onFinish() {
                            buttonDinner3Timer.setText(getString(R.string.n2));
                            buttonDinner3Timer.setBackgroundColor(Color.parseColor("#6750A4"));
                        }
                    };
                    timer.start();
                }
            }
        });

        buttonDinner3Timer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (timer2 != null){
                    timer2.cancel();
                    buttonDinner3Timer2.setText(getString(R.string.n4));
                    buttonDinner3Timer2.setBackgroundColor(Color.parseColor("#6750A4"));
                    timer2 = null;
                    textViewDinner3Time2.setText("00:00");
                } else {
                    buttonDinner3Timer2.setText(getString(R.string.cancel));
                    buttonDinner3Timer2.setBackgroundColor(Color.RED);
                    timer2 = new CountDownTimer(600000,1000) {
                        @Override
                        public void onTick(long l) {
                            NumberFormat f = new DecimalFormat("00");
                            long sec = l / 1000;
                            long min = sec / 60;
                            sec = sec % 60;
                            String time = f.format(min) + ":" + f.format(sec);
                            textViewDinner3Time2.setText(time);
                        }

                        @Override
                        public void onFinish() {
                            buttonDinner3Timer2.setText(getString(R.string.n4));
                            buttonDinner3Timer2.setBackgroundColor(Color.parseColor("#6750A4"));
                        }
                    };
                    timer2.start();
                }
            }
        });

        buttonDinner3Timer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (timer3 != null){
                    timer3.cancel();
                    buttonDinner3Timer3.setText(getString(R.string.n13_1));
                    buttonDinner3Timer3.setBackgroundColor(Color.parseColor("#6750A4"));
                    timer3 = null;
                    textViewDinner3Time3.setText("00:00");
                } else {
                    buttonDinner3Timer3.setText(getString(R.string.cancel));
                    buttonDinner3Timer3.setBackgroundColor(Color.RED);
                    timer3 = new CountDownTimer(2100000,1000) {
                        @Override
                        public void onTick(long l) {
                            NumberFormat f = new DecimalFormat("00");
                            long sec = l / 1000;
                            long min = sec / 60;
                            sec = sec % 60;
                            String time = f.format(min) + ":" + f.format(sec);
                            textViewDinner3Time3.setText(time);
                        }

                        @Override
                        public void onFinish() {
                            buttonDinner3Timer3.setText(getString(R.string.n13_1));
                            buttonDinner3Timer3.setBackgroundColor(Color.parseColor("#6750A4"));
                        }
                    };
                    timer3.start();
                }
            }
        });

        buttonDinner3Timer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (timer4 != null){
                    timer4.cancel();
                    buttonDinner3Timer4.setText(getString(R.string.n13_2));
                    buttonDinner3Timer4.setBackgroundColor(Color.parseColor("#6750A4"));
                    timer4 = null;
                    textViewDinner3Time4.setText("00:00");
                } else {
                    buttonDinner3Timer4.setText(getString(R.string.cancel));
                    buttonDinner3Timer4.setBackgroundColor(Color.RED);
                    timer4 = new CountDownTimer(600000,1000) {
                        @Override
                        public void onTick(long l) {
                            NumberFormat f = new DecimalFormat("00");
                            long sec = l / 1000;
                            long min = sec / 60;
                            sec = sec % 60;
                            String time = f.format(min) + ":" + f.format(sec);
                            textViewDinner3Time4.setText(time);
                        }

                        @Override
                        public void onFinish() {
                            buttonDinner3Timer4.setText(getString(R.string.n13_2));
                            buttonDinner3Timer4.setBackgroundColor(Color.parseColor("#6750A4"));
                        }
                    };
                    timer4.start();
                }
            }
        });

        buttonDinnerBack_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DinnerActivity3.this, DinnerActivity.class);
                startActivity(intent);
            }
        });
    }
}