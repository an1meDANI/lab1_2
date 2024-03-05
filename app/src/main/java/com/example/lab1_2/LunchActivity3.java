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

public class LunchActivity3 extends AppCompatActivity {
    Button buttonLunchBack_3, buttonLunch3Timer, buttonLunch3Timer2, buttonLunch3Timer3, buttonLunch3Timer4;
    TextView textViewLunch3Time, textViewLunch3Time2, textViewLunch3Time3, textViewLunch3Time4;
    CountDownTimer timer, timer2, timer3, timer4;
    Vibrator vibrator, vibrator2, vibrator3, vibrator4;
    MediaPlayer player, player2, player3, player4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch3);

        buttonLunchBack_3 = findViewById(R.id.buttonLunchBack_3);
        buttonLunch3Timer = findViewById(R.id.buttonLunch3Timer);
        buttonLunch3Timer2 = findViewById(R.id.buttonLunch3Timer2);
        buttonLunch3Timer3 = findViewById(R.id.buttonLunch3Timer3);
        buttonLunch3Timer4 = findViewById(R.id.buttonLunch3Timer4);
        textViewLunch3Time = findViewById(R.id.textViewLunch3Time);
        textViewLunch3Time2 = findViewById(R.id.textViewLunch3Time2);
        textViewLunch3Time3 = findViewById(R.id.textViewLunch3Time3);
        textViewLunch3Time4 = findViewById(R.id.textViewLunch3Time4);
        vibrator = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
        vibrator2 = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
        vibrator3 = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
        vibrator4 = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
        player = MediaPlayer.create(this,R.raw.call);
        player2 = MediaPlayer.create(this,R.raw.call);
        player3 = MediaPlayer.create(this,R.raw.call);
        player4 = MediaPlayer.create(this,R.raw.call);

        buttonLunch3Timer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (timer != null){
                    timer.cancel();
                    buttonLunch3Timer.setText(getString(R.string.n1));
                    buttonLunch3Timer.setBackgroundColor(Color.parseColor("#6750A4"));
                    timer = null;
                    textViewLunch3Time.setText("00:00");
                } else {
                    buttonLunch3Timer.setText(getString(R.string.cancel));
                    buttonLunch3Timer.setBackgroundColor(Color.RED);
                    timer = new CountDownTimer(1800000,1000) {
                        @Override
                        public void onTick(long l) {
                            NumberFormat f = new DecimalFormat("00");
                            long sec = l / 1000;
                            long min = sec / 60;
                            sec = sec % 60;
                            String time = f.format(min) + ":" + f.format(sec);
                            textViewLunch3Time.setText(time);
                        }

                        @Override
                        public void onFinish() {
                            buttonLunch3Timer.setText(getString(R.string.n1));
                            buttonLunch3Timer.setBackgroundColor(Color.parseColor("#6750A4"));
                            timer = null;
                            textViewLunch3Time.setText("00:00");
                            player.start();
                            vibrator.vibrate(2000);
                        }
                    };
                    timer.start();
                }
            }
        });

        buttonLunch3Timer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (timer2 != null){
                    timer2.cancel();
                    buttonLunch3Timer2.setText(getString(R.string.n2));
                    buttonLunch3Timer2.setBackgroundColor(Color.parseColor("#6750A4"));
                    timer2 = null;
                    textViewLunch3Time2.setText("00:00");
                } else {
                    buttonLunch3Timer2.setText(getString(R.string.cancel));
                    buttonLunch3Timer2.setBackgroundColor(Color.RED);
                    timer2 = new CountDownTimer(1200000,1000) {
                        @Override
                        public void onTick(long l) {
                            NumberFormat f = new DecimalFormat("00");
                            long sec = l / 1000;
                            long min = sec / 60;
                            sec = sec % 60;
                            String time = f.format(min) + ":" + f.format(sec);
                            textViewLunch3Time2.setText(time);
                        }

                        @Override
                        public void onFinish() {
                            buttonLunch3Timer2.setText(getString(R.string.n2));
                            buttonLunch3Timer2.setBackgroundColor(Color.parseColor("#6750A4"));
                            timer2 = null;
                            textViewLunch3Time2.setText("00:00");
                            player2.start();
                            vibrator2.vibrate(2000);
                        }
                    };
                    timer2.start();
                }
            }
        });

        buttonLunch3Timer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (timer3 != null){
                    timer3.cancel();
                    buttonLunch3Timer3.setText(getString(R.string.n3));
                    buttonLunch3Timer3.setBackgroundColor(Color.parseColor("#6750A4"));
                    timer3 = null;
                    textViewLunch3Time3.setText("00:00");
                } else {
                    buttonLunch3Timer3.setText(getString(R.string.cancel));
                    buttonLunch3Timer3.setBackgroundColor(Color.RED);
                    timer3 = new CountDownTimer(180000,1000) {
                        @Override
                        public void onTick(long l) {
                            NumberFormat f = new DecimalFormat("00");
                            long sec = l / 1000;
                            long min = sec / 60;
                            sec = sec % 60;
                            String time = f.format(min) + ":" + f.format(sec);
                            textViewLunch3Time3.setText(time);
                        }

                        @Override
                        public void onFinish() {
                            buttonLunch3Timer3.setText(getString(R.string.n3));
                            buttonLunch3Timer3.setBackgroundColor(Color.parseColor("#6750A4"));
                            timer3 = null;
                            textViewLunch3Time3.setText("00:00");
                            player3.start();
                            vibrator3.vibrate(2000);
                        }
                    };
                    timer3.start();
                }
            }
        });

        buttonLunch3Timer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (timer4 != null){
                    timer4.cancel();
                    buttonLunch3Timer4.setText(getString(R.string.n4));
                    buttonLunch3Timer4.setBackgroundColor(Color.parseColor("#6750A4"));
                    timer4 = null;
                    textViewLunch3Time4.setText("00:00");
                } else {
                    buttonLunch3Timer4.setText(getString(R.string.cancel));
                    buttonLunch3Timer4.setBackgroundColor(Color.RED);
                    timer4 = new CountDownTimer(120000,1000) {
                        @Override
                        public void onTick(long l) {
                            NumberFormat f = new DecimalFormat("00");
                            long sec = l / 1000;
                            long min = sec / 60;
                            sec = sec % 60;
                            String time = f.format(min) + ":" + f.format(sec);
                            textViewLunch3Time4.setText(time);
                        }

                        @Override
                        public void onFinish() {
                            buttonLunch3Timer4.setText(getString(R.string.n4));
                            buttonLunch3Timer4.setBackgroundColor(Color.parseColor("#6750A4"));
                            timer4 = null;
                            textViewLunch3Time4.setText("00:00");
                            player4.start();
                            vibrator4.vibrate(2000);
                        }
                    };
                    timer4.start();
                }
            }
        });

        buttonLunchBack_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LunchActivity3.this, LunchActivity.class);
                startActivity(intent);
            }
        });
    }
}