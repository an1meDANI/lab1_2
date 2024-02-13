package com.example.lab1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DinnerActivity4 extends AppCompatActivity {
    Button buttonDinnerBack_4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner4);

        buttonDinnerBack_4 = findViewById(R.id.buttonDinnerBack_4);

        buttonDinnerBack_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DinnerActivity4.this, DinnerActivity.class);
                startActivity(intent);
            }
        });
    }
}