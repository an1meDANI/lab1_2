package com.example.lab1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LunchActivity2 extends AppCompatActivity {
    Button buttonLunchBack_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch2);

        buttonLunchBack_2 = findViewById(R.id.buttonLunchBack_2);

        buttonLunchBack_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LunchActivity2.this, LunchActivity.class);
                startActivity(intent);
            }
        });
    }
}