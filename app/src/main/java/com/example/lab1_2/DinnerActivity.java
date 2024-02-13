package com.example.lab1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DinnerActivity extends AppCompatActivity {
    Button buttonDinner, buttonDinner2, buttonDinner3, buttonDinnerBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner);

        buttonDinner = findViewById(R.id.buttonDinner);
        buttonDinner2 = findViewById(R.id.buttonDinner2);
        buttonDinner3 = findViewById(R.id.buttonDinner3);
        buttonDinnerBack = findViewById(R.id.buttonDinnerBack);

        buttonDinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DinnerActivity.this, DinnerActivity2.class);
                startActivity(intent);
            }
        });
        buttonDinner2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DinnerActivity.this, DinnerActivity3.class);
                startActivity(intent);
            }
        });
        buttonDinner3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DinnerActivity.this, DinnerActivity4.class);
                startActivity(intent);
            }
        });
        buttonDinnerBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DinnerActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}