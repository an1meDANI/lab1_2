package com.example.lab1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BreakfastActivity3 extends AppCompatActivity {
    Button buttonBreakfastBack_3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast3);

        buttonBreakfastBack_3 = findViewById(R.id.buttonBreakfastBack_3);

        buttonBreakfastBack_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BreakfastActivity3.this, BreakfastActivity.class);
                startActivity(intent);
            }
        });
    }
}