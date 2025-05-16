package com.example.kutsuki_final;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SigninActivity extends AppCompatActivity {

    Button btnSignin2;
    Button btnAlready;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);

        btnSignin2=findViewById(R.id.btnSignin2);
        btnAlready=findViewById(R.id.btnAlready);

        btnSignin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SigninActivity.this, HomepageActivity.class);
                startActivity(intent);
            }
        });

        btnAlready.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SigninActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
