package com.example.lab1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonMain, buttonMain2, buttonMain3, buttonMainBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonMain = findViewById(R.id.buttonMain);
        buttonMain2 = findViewById(R.id.buttonMain2);
        buttonMain3 = findViewById(R.id.buttonMain3);
        buttonMainBack = findViewById(R.id.buttonMainBack);

        buttonMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BreakfastActivity.class);
                startActivity(intent);
            }
        });
        buttonMain2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LunchActivity.class);
                startActivity(intent);
            }
        });
        buttonMain3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DinnerActivity.class);
                startActivity(intent);
            }
        });
        buttonMainBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LanguageActivity.class);
                startActivity(intent);
            }
        });
    }
}