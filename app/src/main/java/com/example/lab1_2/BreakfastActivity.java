package com.example.lab1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BreakfastActivity extends AppCompatActivity {
    Button buttonBreakfast, buttonBreakfast2, buttonBreakfast3, buttonBreakfastBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast);

        buttonBreakfast = findViewById(R.id.buttonBreakfast);
        buttonBreakfast2 = findViewById(R.id.buttonBreakfast2);
        buttonBreakfast3 = findViewById(R.id.buttonBreakfast3);
        buttonBreakfastBack = findViewById(R.id.buttonBreakfastBack);

        buttonBreakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BreakfastActivity.this, BreakfastActivity2.class);
                startActivity(intent);
            }
        });
        buttonBreakfast2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BreakfastActivity.this, BreakfastActivity3.class);
                startActivity(intent);
            }
        });
        buttonBreakfast3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BreakfastActivity.this, BreakfastActivity4.class);
                startActivity(intent);
            }
        });
        buttonBreakfastBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BreakfastActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}