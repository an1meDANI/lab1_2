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

public class BreakfastActivity2 extends AppCompatActivity {
    Button buttonBreakfastBack_2, buttonBreakfast2Timer, buttonBreakfast2Timer2, buttonBreakfast2Voice;
    TextView textViewBreakfast2Time, textViewBreakfast2Time2;
    CountDownTimer timer, timer2;
    Vibrator vibrator, vibrator2;
    MediaPlayer player, player2, playerVoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast2);

        buttonBreakfastBack_2 = findViewById(R.id.buttonBreakfastBack_2);
        buttonBreakfast2Timer = findViewById(R.id.buttonBreakfast2Timer);
        buttonBreakfast2Timer2 = findViewById(R.id.buttonBreakfast2Timer2);
        buttonBreakfast2Voice = findViewById(R.id.buttonBreakfast2Voice);
        textViewBreakfast2Time = findViewById(R.id.textViewBreakfast2Time);
        textViewBreakfast2Time2 = findViewById(R.id.textViewBreakfast2Time2);
        vibrator = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
        vibrator2 = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
        player = MediaPlayer.create(this,R.raw.call);
        player2 = MediaPlayer.create(this,R.raw.call);
        playerVoice = MediaPlayer.create(this,R.raw.call);

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
                            timer = null;
                            textViewBreakfast2Time.setText("00:00");
                            player.start();
                            vibrator.vibrate(2000);
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
                            timer2 = null;
                            textViewBreakfast2Time2.setText("00:00");
                            player2.start();
                            vibrator2.vibrate(2000);
                        }
                    };
                    timer2.start();
                }
            }
        });

        final Context context = this;

        buttonBreakfast2Voice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (playerVoice.isPlaying()){
                    playerVoice.stop();
                    playerVoice.release();
                    playerVoice = MediaPlayer.create(context,R.raw.voicebreakfast_1);
                    buttonBreakfast2Voice.setText(getString(R.string.brk_voice));
                    buttonBreakfast2Voice.setBackgroundColor(Color.parseColor("#6750A4"));
                } else {
                    playerVoice.start();
                    buttonBreakfast2Voice.setText(getString(R.string.cancel));
                    buttonBreakfast2Voice.setBackgroundColor(Color.RED);
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