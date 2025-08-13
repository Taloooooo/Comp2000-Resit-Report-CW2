package com.example.comp2000resit_reportcw2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity6 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main6);

        Button button3 = findViewById(R.id.button5);
        button3.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity6.this, MainActivity.class);
            startActivity(intent);
        });
    }
}