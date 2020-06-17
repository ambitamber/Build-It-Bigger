package com.example.jokeandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static final String KEY = "joke";

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        TextView textView = findViewById(R.id.textView);
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra(KEY)){
            String joke = getIntent().getStringExtra(KEY);
            textView.setText(joke);
        }else {
            textView.setText("Error getting joke.");
        }
    }
}