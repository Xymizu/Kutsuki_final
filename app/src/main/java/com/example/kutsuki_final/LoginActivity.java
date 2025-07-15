package com.example.kutsuki_final;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    Button btnLogin2;
    Button btnDontHave;
    EditText inputUsername, inputPassword, inputEmail;
    DBHelper dbHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        // Inisialisasi DBHelper
        dbHelper = new DBHelper(this);

        // Inisialisasi view
        btnLogin2 = findViewById(R.id.btnLogin2);
        btnDontHave = findViewById(R.id.btnDontHave);
        inputUsername = findViewById(R.id.inputUsernameLogin);
        inputPassword = findViewById(R.id.inputPasswordLogin);

        // Login Event
        btnLogin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = inputUsername.getText().toString();
                String password = inputPassword.getText().toString();

                boolean login = dbHelper.checkLogin(username, password);

                if(login){
                    Toast.makeText(LoginActivity.this, "Login berhasil! Halo " + username + "!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this, HomepageActivity.class);

                    SharedPreferences prefs = getSharedPreferences("user_prefs", MODE_PRIVATE);
                    SharedPreferences.Editor editor = prefs.edit();
                    editor.putString("username", username);
                    editor.apply();

                    startActivity(intent);

                } else {
                    Toast.makeText(LoginActivity.this, "Username atau password salah", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnDontHave.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
                    startActivity(intent);
                }
        });


    }
}
