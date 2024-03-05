package com.example.lab1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class BreakfastActivity3 extends AppCompatActivity {
    Button buttonBreakfastBack_3, buttonBreakfast3Timer, buttonBreakfast3Timer2;
    TextView textViewBreakfast3Time, textViewBreakfast3Time2;
    CountDownTimer timer, timer2;
    Vibrator vibrator, vibrator2;
    MediaPlayer player, player2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast3);

        buttonBreakfastBack_3 = findViewById(R.id.buttonBreakfastBack_3);
        buttonBreakfast3Timer = findViewById(R.id.buttonBreakfast3Timer);
        buttonBreakfast3Timer2 = findViewById(R.id.buttonBreakfast3Timer2);
        textViewBreakfast3Time = findViewById(R.id.textViewBreakfast3Time);
        textViewBreakfast3Time2 = findViewById(R.id.textViewBreakfast3Time2);
        vibrator = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
        vibrator2 = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
        player = MediaPlayer.create(this,R.raw.call);
        player2 = MediaPlayer.create(this,R.raw.call);

        buttonBreakfast3Timer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (timer != null){
                    timer.cancel();
                    buttonBreakfast3Timer.setText(getString(R.string.n2));
                    buttonBreakfast3Timer.setBackgroundColor(Color.parseColor("#6750A4"));
                    timer = null;
                    textViewBreakfast3Time.setText("00:00");
                } else {
                    buttonBreakfast3Timer.setText(getString(R.string.cancel));
                    buttonBreakfast3Timer.setBackgroundColor(Color.RED);
                    timer = new CountDownTimer(600000,1000) {
                        @Override
                        public void onTick(long l) {
                            NumberFormat f = new DecimalFormat("00");
                            long sec = l / 1000;
                            long min = sec / 60;
                            sec = sec % 60;
                            String time = f.format(min) + ":" + f.format(sec);
                            textViewBreakfast3Time.setText(time);
                        }

                        @Override
                        public void onFinish() {
                            buttonBreakfast3Timer.setText(getString(R.string.n2));
                            buttonBreakfast3Timer.setBackgroundColor(Color.parseColor("#6750A4"));
                            timer = null;
                            textViewBreakfast3Time.setText("00:00");
                            player.start();
                            vibrator.vibrate(2000);
                        }
                    };
                    timer.start();
                }
            }
        });

        buttonBreakfast3Timer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (timer2 != null){
                    timer2.cancel();
                    buttonBreakfast3Timer2.setText(getString(R.string.n4));
                    buttonBreakfast3Timer2.setBackgroundColor(Color.parseColor("#6750A4"));
                    timer2 = null;
                    textViewBreakfast3Time2.setText("00:00");
                } else {
                    buttonBreakfast3Timer2.setText(getString(R.string.cancel));
                    buttonBreakfast3Timer2.setBackgroundColor(Color.RED);
                    timer2 = new CountDownTimer(1200000,1000) {
                        @Override
                        public void onTick(long l) {
                            NumberFormat f = new DecimalFormat("00");
                            long sec = l / 1000;
                            long min = sec / 60;
                            sec = sec % 60;
                            String time = f.format(min) + ":" + f.format(sec);
                            textViewBreakfast3Time2.setText(time);
                        }

                        @Override
                        public void onFinish() {
                            buttonBreakfast3Timer2.setText(getString(R.string.n4));
                            buttonBreakfast3Timer2.setBackgroundColor(Color.parseColor("#6750A4"));
                            timer2 = null;
                            textViewBreakfast3Time2.setText("00:00");
                            player2.start();
                            vibrator2.vibrate(2000);
                        }
                    };
                    timer2.start();
                }
            }
        });

        buttonBreakfastBack_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BreakfastActivity3.this, BreakfastActivity.class);
                startActivity(intent);
            }
        });
    }
}