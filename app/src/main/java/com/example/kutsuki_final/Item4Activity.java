package com.example.kutsuki_final;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Item4Activity extends AppCompatActivity {
    Button btnChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item4);
        btnChart = findViewById(R.id.btnChart);
        btnChart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Kode untuk menampilkan Toast
                Toast.makeText(Item4Activity.this, "Item added to cart!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
