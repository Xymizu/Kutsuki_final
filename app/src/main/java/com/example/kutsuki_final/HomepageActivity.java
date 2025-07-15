package com.example.kutsuki_final;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class HomepageActivity extends AppCompatActivity {
    TextView txtUsername;
    CardView card1,card2,card3,card4,card5,card6;
    ImageView chart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        card1 = findViewById(R.id.card1);
        card2 = findViewById(R.id.card2);
        card3 = findViewById(R.id.card3);
        card4 = findViewById(R.id.card4);
        card5 = findViewById(R.id.card5);
        card6 = findViewById(R.id.card6);
        chart = findViewById(R.id.chart);

        txtUsername = findViewById(R.id.textView100);
        SharedPreferences prefs = getSharedPreferences("user_prefs", MODE_PRIVATE);
        String username = prefs.getString("username", "Guest");
        txtUsername.setText(username);


        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomepageActivity.this, Item1Activity.class);
                startActivity(intent);
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomepageActivity.this, Item2Activity.class);
                startActivity(intent);
            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomepageActivity.this, Item3Activity.class);
                startActivity(intent);
            }
        });

        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomepageActivity.this, Item4Activity.class);
                startActivity(intent);
            }
        });

        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomepageActivity.this, Item5Activity.class);
                startActivity(intent);
            }
        });

        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomepageActivity.this, Item6Activity.class);
                startActivity(intent);
            }
        });


        chart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomepageActivity.this, ChartActivity.class);
                startActivity(intent);
            }
        });
        }

    }