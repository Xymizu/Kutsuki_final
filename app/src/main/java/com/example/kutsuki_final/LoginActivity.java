package com.example.kutsuki_final;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    Button btnLogin2;
    Button btnDontHave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        btnLogin2 = findViewById(R.id.btnLogin2);
        btnDontHave = findViewById(R.id.btnDontHave);

        btnLogin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, HomepageActivity.class);
                startActivity(intent);
            }
        });
        btnDontHave.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(LoginActivity.this, SigninActivity.class);
                    startActivity(intent);
                }
        });
}
}
