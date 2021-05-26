package com.example.myapplicationfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class portfolio extends AppCompatActivity {
    TextView int1;
    TextView int2;
    TextView int3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);

        int1 = findViewById(R.id.int1);
        int2 = findViewById(R.id.int2);
        int3 = findViewById(R.id.int3);
    }
}