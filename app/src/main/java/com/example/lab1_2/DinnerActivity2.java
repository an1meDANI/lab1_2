package com.example.lab1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DinnerActivity2 extends AppCompatActivity {
    Button buttonDinnerBack_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner2);

        buttonDinnerBack_2 = findViewById(R.id.buttonDinnerBack_2);

        buttonDinnerBack_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DinnerActivity2.this, DinnerActivity.class);
                startActivity(intent);
            }
        });
    }
}