package com.example.lab1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BreakfastActivity4 extends AppCompatActivity {
    Button buttonBreakfastBack_4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast4);

        buttonBreakfastBack_4 = findViewById(R.id.buttonBreakfastBack_4);

        buttonBreakfastBack_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BreakfastActivity4.this, BreakfastActivity.class);
                startActivity(intent);
            }
        });
    }
}