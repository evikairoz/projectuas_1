package com.example.projectuas1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;


public class List_Skincare extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list_skincare);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

// Inisialisasi Listview
        ListView lvdata = findViewById(R.id.lvskincare);

        // buat list daftarnya
        ArrayList <String> daftarskincare = new ArrayList<>();
        daftarskincare.add("Serum");
        daftarskincare.add("Moisturizer");
        daftarskincare.add("Facial wash");
        daftarskincare.add("Sunscreen");
        daftarskincare.add("Peeling Gel");
        daftarskincare.add("Body Lotion");



        // buat adapter untuk menghubungkan data listview
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, daftarskincare
        );
        // menghubungkan listview ke adapter
        lvdata.setAdapter(adapter);

        lvdata.setOnItemClickListener((parent, view, position, id) ->{
            String namaSkincare = daftarskincare.get(position);
            Toast.makeText(List_Skincare.this, "Anda Memilih " + namaSkincare, Toast.LENGTH_SHORT).show();

            if ("Serum".equals(namaSkincare)) {
                Toast.makeText(List_Skincare.this, "Anda memilih " +namaSkincare, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(List_Skincare.this, DetailList0.class);
                startActivity(intent);

            } else if ("Moisturizer".equals(namaSkincare)) {
                Toast.makeText(List_Skincare.this, "Anda memilih " +namaSkincare, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(List_Skincare.this, DetailList1.class);
                startActivity(intent);
            }
            else if ("Facial wash".equals(namaSkincare)) {
                Toast.makeText(List_Skincare.this, "Anda memilih " +namaSkincare, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(List_Skincare.this, DetailList2.class);
                startActivity(intent);
            }
            else if ("Sunscreen".equals(namaSkincare)) {
                Toast.makeText(List_Skincare.this, "Anda memilih " +namaSkincare, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(List_Skincare.this, DetailList3.class);
                startActivity(intent);
            }
            else if ("Peeling Gel".equals(namaSkincare)) {
                Toast.makeText(List_Skincare.this, "Anda memilih " +namaSkincare, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(List_Skincare.this, DetailList4.class);
                startActivity(intent);
            }
            else if ("Body Lotion".equals(namaSkincare)) {
                Toast.makeText(List_Skincare.this, "Anda memilih " +namaSkincare, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(List_Skincare.this, DetailList5.class);
                startActivity(intent);
            }
        });
    }
}