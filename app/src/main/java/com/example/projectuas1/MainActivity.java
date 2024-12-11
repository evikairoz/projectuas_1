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

public class MainActivity extends AppCompatActivity {

    Button blist, babout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        blist = findViewById(R.id.btnlist);
        babout = findViewById(R.id.btnabout);

        // Navigasi ke List
        blist.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, List_Skincare.class);
            startActivity(intent);
        });

        babout.setOnClickListener(view ->{
            Intent intent = new Intent(MainActivity.this, About.class);
            startActivity(intent);
        });



    }
}
