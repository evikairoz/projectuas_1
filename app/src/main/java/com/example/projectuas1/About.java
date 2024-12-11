package com.example.projectuas1;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import  android.view.Menu;
import  android.view.View;
import android.widget.Button;
import  android.widget.EditText;
import  android.widget.Toast;

public class About extends AppCompatActivity {

    Button  bback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_about);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        bback = findViewById(R.id.btnback);

        bback.setOnClickListener(view ->{
            Intent intent = new Intent(About.this, MainActivity.class);
            startActivity(intent);
        });

    }
}