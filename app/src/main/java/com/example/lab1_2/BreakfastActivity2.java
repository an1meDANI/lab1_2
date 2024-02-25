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

public class BreakfastActivity2 extends AppCompatActivity {
    Button buttonBreakfastBack_2, buttonBreakfast2Timer, buttonBreakfast2Timer2;
    TextView textViewBreakfast2Time, textViewBreakfast2Time2;
    CountDownTimer timer, timer2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast2);

        buttonBreakfastBack_2 = findViewById(R.id.buttonBreakfastBack_2);
        buttonBreakfast2Timer = findViewById(R.id.buttonBreakfast2Timer);
        buttonBreakfast2Timer2 = findViewById(R.id.buttonBreakfast2Timer2);
        textViewBreakfast2Time = findViewById(R.id.textViewBreakfast2Time);
        textViewBreakfast2Time2 = findViewById(R.id.textViewBreakfast2Time2);

        buttonBreakfast2Timer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (timer != null){
                    timer.cancel();
                    buttonBreakfast2Timer.setText(getString(R.string.n6));
                    buttonBreakfast2Timer.setBackgroundColor(Color.parseColor("#6750A4"));
                    timer = null;
                    textViewBreakfast2Time.setText("00:00");
                } else {
                    buttonBreakfast2Timer.setText(getString(R.string.cancel));
                    buttonBreakfast2Timer.setBackgroundColor(Color.RED);
                    timer = new CountDownTimer(60000,1000) {
                        @Override
                        public void onTick(long l) {
                            NumberFormat f = new DecimalFormat("00");
                            long sec = l / 1000;
                            long min = sec / 60;
                            sec = sec % 60;
                            String time = f.format(min) + ":" + f.format(sec);
                            textViewBreakfast2Time.setText(time);
                        }

                        @Override
                        public void onFinish() {
                            buttonBreakfast2Timer.setText(getString(R.string.n6));
                            buttonBreakfast2Timer.setBackgroundColor(Color.parseColor("#6750A4"));
                        }
                    };
                    timer.start();
                }
            }
        });

        buttonBreakfast2Timer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (timer2 != null){
                    timer2.cancel();
                    buttonBreakfast2Timer2.setText(getString(R.string.n7));
                    buttonBreakfast2Timer2.setBackgroundColor(Color.parseColor("#6750A4"));
                    timer2 = null;
                    textViewBreakfast2Time2.setText("00:00");
                } else {
                    buttonBreakfast2Timer2.setText(getString(R.string.cancel));
                    buttonBreakfast2Timer2.setBackgroundColor(Color.RED);
                    timer2 = new CountDownTimer(600000,1000) {
                        @Override
                        public void onTick(long l) {
                            NumberFormat f = new DecimalFormat("00");
                            long sec = l / 1000;
                            long min = sec / 60;
                            sec = sec % 60;
                            String time = f.format(min) + ":" + f.format(sec);
                            textViewBreakfast2Time2.setText(time);
                        }

                        @Override
                        public void onFinish() {
                            buttonBreakfast2Timer2.setText(getString(R.string.n7));
                            buttonBreakfast2Timer2.setBackgroundColor(Color.parseColor("#6750A4"));
                        }
                    };
                    timer2.start();
                }
            }
        });

        buttonBreakfastBack_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BreakfastActivity2.this, BreakfastActivity.class);
                startActivity(intent);
            }
        });
    }
}