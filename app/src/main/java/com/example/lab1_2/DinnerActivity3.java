package com.example.lab1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DinnerActivity3 extends AppCompatActivity {
    Button buttonDinnerBack_3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner3);

        buttonDinnerBack_3 = findViewById(R.id.buttonDinnerBack_3);

        buttonDinnerBack_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DinnerActivity3.this, DinnerActivity.class);
                startActivity(intent);
            }
        });
    }
}