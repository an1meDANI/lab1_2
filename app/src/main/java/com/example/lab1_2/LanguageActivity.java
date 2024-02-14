package com.example.lab1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Locale;

public class LanguageActivity extends AppCompatActivity {
    Button buttonLanguage, buttonLanguage2, buttonLanguage3, buttonLanguageBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);

        buttonLanguage = findViewById(R.id.buttonLanguage);
        buttonLanguage2 = findViewById(R.id.buttonLanguage2);
        buttonLanguage3 = findViewById(R.id.buttonLanguage3);
        buttonLanguageBack = findViewById(R.id.buttonLanguageBack);

        buttonLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setLanguage("ru-rRU");
            }
        });
        buttonLanguage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setLanguage("en-rUS");
            }
        });
        buttonLanguage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setLanguage("ja");
            }
        });
        buttonLanguageBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LanguageActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
    private void setLanguage(String languageCode){
        Resources resources = this.getResources();
        Configuration configuration = resources.getConfiguration();
        Locale locale = new Locale(languageCode);
        Locale.setDefault(locale);
        configuration.setLocale(locale);
        resources.updateConfiguration(configuration,resources.getDisplayMetrics());

        Intent intent = new Intent(LanguageActivity.this,MainActivity.class);
        startActivity(intent);
    }
}