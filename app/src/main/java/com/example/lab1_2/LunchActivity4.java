package com.example.lab1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LunchActivity4 extends AppCompatActivity {
    Button buttonLunchBack_4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch4);

        buttonLunchBack_4 = findViewById(R.id.buttonLunchBack_4);

        buttonLunchBack_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LunchActivity4.this, LunchActivity.class);
                startActivity(intent);
            }
        });
    }
}