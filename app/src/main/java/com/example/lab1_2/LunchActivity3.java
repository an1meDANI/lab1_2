package com.example.lab1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LunchActivity3 extends AppCompatActivity {
    Button buttonLunchBack_3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch3);

        buttonLunchBack_3 = findViewById(R.id.buttonLunchBack_3);

        buttonLunchBack_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LunchActivity3.this, LunchActivity.class);
                startActivity(intent);
            }
        });
    }
}