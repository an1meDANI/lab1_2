package com.example.lab1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BreakfastActivity2 extends AppCompatActivity {
    Button buttonBreakfastBack_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast2);

        buttonBreakfastBack_2 = findViewById(R.id.buttonBreakfastBack_2);

        buttonBreakfastBack_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BreakfastActivity2.this, BreakfastActivity.class);
                startActivity(intent);
            }
        });
    }
}