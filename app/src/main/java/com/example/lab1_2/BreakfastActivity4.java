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

public class BreakfastActivity4 extends AppCompatActivity {
    Button buttonBreakfastBack_4, buttonBreakfast4Timer, buttonBreakfast4Timer2, buttonBreakfast4Timer3;
    TextView textViewBreakfast4Time, textViewBreakfast4Time2, textViewBreakfast4Time3;
    CountDownTimer timer, timer2, timer3;
    Vibrator vibrator, vibrator2, vibrator3;
    MediaPlayer player, player2, player3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast4);

        buttonBreakfastBack_4 = findViewById(R.id.buttonBreakfastBack_4);
        buttonBreakfast4Timer = findViewById(R.id.buttonBreakfast4Timer);
        buttonBreakfast4Timer2 = findViewById(R.id.buttonBreakfast4Timer2);
        buttonBreakfast4Timer3 = findViewById(R.id.buttonBreakfast4Timer3);
        textViewBreakfast4Time = findViewById(R.id.textViewBreakfast4Time);
        textViewBreakfast4Time2 = findViewById(R.id.textViewBreakfast4Time2);
        textViewBreakfast4Time3 = findViewById(R.id.textViewBreakfast4Time3);
        vibrator = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
        vibrator2 = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
        vibrator3 = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
        player = MediaPlayer.create(this,R.raw.call);
        player2 = MediaPlayer.create(this,R.raw.call);
        player3 = MediaPlayer.create(this,R.raw.call);

        buttonBreakfast4Timer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (timer != null){
                    timer.cancel();
                    buttonBreakfast4Timer.setText(getString(R.string.n5_1));
                    buttonBreakfast4Timer.setBackgroundColor(Color.parseColor("#6750A4"));
                    timer = null;
                    textViewBreakfast4Time.setText("00:00");
                } else {
                    buttonBreakfast4Timer.setText(getString(R.string.cancel));
                    buttonBreakfast4Timer.setBackgroundColor(Color.RED);
                    timer = new CountDownTimer(1800000,1000) {
                        @Override
                        public void onTick(long l) {
                            NumberFormat f = new DecimalFormat("00");
                            long sec = l / 1000;
                            long min = sec / 60;
                            sec = sec % 60;
                            String time = f.format(min) + ":" + f.format(sec);
                            textViewBreakfast4Time.setText(time);
                        }

                        @Override
                        public void onFinish() {
                            buttonBreakfast4Timer.setText(getString(R.string.n5_1));
                            buttonBreakfast4Timer.setBackgroundColor(Color.parseColor("#6750A4"));
                            timer = null;
                            textViewBreakfast4Time.setText("00:00");
                            player.start();
                            vibrator.vibrate(2000);
                        }
                    };
                    timer.start();
                }
            }
        });

        buttonBreakfast4Timer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (timer2 != null){
                    timer2.cancel();
                    buttonBreakfast4Timer2.setText(getString(R.string.n5_2));
                    buttonBreakfast4Timer2.setBackgroundColor(Color.parseColor("#6750A4"));
                    timer2 = null;
                    textViewBreakfast4Time2.setText("00:00");
                } else {
                    buttonBreakfast4Timer2.setText(getString(R.string.cancel));
                    buttonBreakfast4Timer2.setBackgroundColor(Color.RED);
                    timer2 = new CountDownTimer(1200000,1000) {
                        @Override
                        public void onTick(long l) {
                            NumberFormat f = new DecimalFormat("00");
                            long sec = l / 1000;
                            long min = sec / 60;
                            sec = sec % 60;
                            String time = f.format(min) + ":" + f.format(sec);
                            textViewBreakfast4Time2.setText(time);
                        }

                        @Override
                        public void onFinish() {
                            buttonBreakfast4Timer2.setText(getString(R.string.n5_2));
                            buttonBreakfast4Timer2.setBackgroundColor(Color.parseColor("#6750A4"));
                            timer2 = null;
                            textViewBreakfast4Time2.setText("00:00");
                            player2.start();
                            vibrator2.vibrate(2000);
                        }
                    };
                    timer2.start();
                }
            }
        });

        buttonBreakfast4Timer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (timer3 != null){
                    timer3.cancel();
                    buttonBreakfast4Timer3.setText(getString(R.string.n6));
                    buttonBreakfast4Timer3.setBackgroundColor(Color.parseColor("#6750A4"));
                    timer3 = null;
                    textViewBreakfast4Time3.setText("00:00");
                } else {
                    buttonBreakfast4Timer3.setText(getString(R.string.cancel));
                    buttonBreakfast4Timer3.setBackgroundColor(Color.RED);
                    timer3 = new CountDownTimer(1800000,1000) {
                        @Override
                        public void onTick(long l) {
                            NumberFormat f = new DecimalFormat("00");
                            long sec = l / 1000;
                            long min = sec / 60;
                            sec = sec % 60;
                            String time = f.format(min) + ":" + f.format(sec);
                            textViewBreakfast4Time3.setText(time);
                        }

                        @Override
                        public void onFinish() {
                            buttonBreakfast4Timer3.setText(getString(R.string.n6));
                            buttonBreakfast4Timer3.setBackgroundColor(Color.parseColor("#6750A4"));
                            timer3 = null;
                            textViewBreakfast4Time3.setText("00:00");
                            player3.start();
                            vibrator3.vibrate(2000);
                        }
                    };
                    timer3.start();
                }
            }
        });

        buttonBreakfastBack_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BreakfastActivity4.this, BreakfastActivity.class);
                startActivity(intent);
            }
        });
    }
}