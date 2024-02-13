package com.example.lab1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LunchActivity extends AppCompatActivity {
    Button buttonLunch, buttonLunch2, buttonLunch3, buttonLunchBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch);

        buttonLunch = findViewById(R.id.buttonLunch);
        buttonLunch2 = findViewById(R.id.buttonLunch2);
        buttonLunch3 = findViewById(R.id.buttonLunch3);
        buttonLunchBack = findViewById(R.id.buttonLunchBack);

        buttonLunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LunchActivity.this, LunchActivity2.class);
                startActivity(intent);
            }
        });
        buttonLunch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LunchActivity.this, LunchActivity3.class);
                startActivity(intent);
            }
        });
        buttonLunch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LunchActivity.this, LunchActivity4.class);
                startActivity(intent);
            }
        });
        buttonLunchBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LunchActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}