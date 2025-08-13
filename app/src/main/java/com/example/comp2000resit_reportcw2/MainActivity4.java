package com.example.comp2000resit_reportcw2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.activity.EdgeToEdge;

public class MainActivity4 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main4);

        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity4.this, MainActivity.class);
            startActivity(intent);
        });
    }
}