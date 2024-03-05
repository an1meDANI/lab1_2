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

public class LunchActivity2 extends AppCompatActivity {
    Button buttonLunchBack_2, buttonLunch2Timer, buttonLunch2Timer2;
    TextView textViewLunch2Time, textViewLunch2Time2;
    CountDownTimer timer, timer2;
    Vibrator vibrator, vibrator2;
    MediaPlayer player, player2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch2);

        buttonLunchBack_2 = findViewById(R.id.buttonLunchBack_2);
        buttonLunch2Timer = findViewById(R.id.buttonLunch2Timer);
        buttonLunch2Timer2 = findViewById(R.id.buttonLunch2Timer2);
        textViewLunch2Time = findViewById(R.id.textViewLunch2Time);
        textViewLunch2Time2 = findViewById(R.id.textViewLunch2Time2);
        vibrator = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
        vibrator2 = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
        player = MediaPlayer.create(this,R.raw.call);
        player2 = MediaPlayer.create(this,R.raw.call);

        buttonLunch2Timer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (timer != null){
                    timer.cancel();
                    buttonLunch2Timer.setText(getString(R.string.n6));
                    buttonLunch2Timer.setBackgroundColor(Color.parseColor("#6750A4"));
                    timer = null;
                    textViewLunch2Time.setText("00:00");
                } else {
                    buttonLunch2Timer.setText(getString(R.string.cancel));
                    buttonLunch2Timer.setBackgroundColor(Color.RED);
                    timer = new CountDownTimer(600000,1000) {
                        @Override
                        public void onTick(long l) {
                            NumberFormat f = new DecimalFormat("00");
                            long sec = l / 1000;
                            long min = sec / 60;
                            sec = sec % 60;
                            String time = f.format(min) + ":" + f.format(sec);
                            textViewLunch2Time.setText(time);
                        }

                        @Override
                        public void onFinish() {
                            buttonLunch2Timer.setText(getString(R.string.n6));
                            buttonLunch2Timer.setBackgroundColor(Color.parseColor("#6750A4"));
                            timer = null;
                            textViewLunch2Time.setText("00:00");
                            player.start();
                            vibrator.vibrate(2000);
                        }
                    };
                    timer.start();
                }
            }
        });

        buttonLunch2Timer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (timer2 != null){
                    timer2.cancel();
                    buttonLunch2Timer2.setText(getString(R.string.n9));
                    buttonLunch2Timer2.setBackgroundColor(Color.parseColor("#6750A4"));
                    timer2 = null;
                    textViewLunch2Time2.setText("00:00");
                } else {
                    buttonLunch2Timer2.setText(getString(R.string.cancel));
                    buttonLunch2Timer2.setBackgroundColor(Color.RED);
                    timer2 = new CountDownTimer(5400000,1000) {
                        @Override
                        public void onTick(long l) {
                            NumberFormat f = new DecimalFormat("00");
                            long sec = l / 1000;
                            long min = sec / 60;
                            sec = sec % 60;
                            String time = f.format(min) + ":" + f.format(sec);
                            textViewLunch2Time2.setText(time);
                        }

                        @Override
                        public void onFinish() {
                            buttonLunch2Timer2.setText(getString(R.string.n9));
                            buttonLunch2Timer2.setBackgroundColor(Color.parseColor("#6750A4"));
                            timer2 = null;
                            textViewLunch2Time2.setText("00:00");
                            player2.start();
                            vibrator2.vibrate(2000);
                        }
                    };
                    timer2.start();
                }
            }
        });

        buttonLunchBack_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LunchActivity2.this, LunchActivity.class);
                startActivity(intent);
            }
        });
    }
}