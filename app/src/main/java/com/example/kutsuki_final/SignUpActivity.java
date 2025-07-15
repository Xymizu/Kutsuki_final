package com.example.kutsuki_final;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {

    Button btnSignin2;
    Button btnAlready;
    EditText inputUsername, inputPassword, inputEmail;
    DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);

        // Inisialisasi View
        btnSignin2=findViewById(R.id.btnSignin2);
        btnAlready=findViewById(R.id.btnAlready);
        inputUsername = findViewById(R.id.inputUsernameSignUp);
        inputPassword = findViewById(R.id.inputPasswordSignUp);
        inputEmail = findViewById(R.id.inputEmailSignUp);

        // Inisialisasi DBHelper
        dbHelper = new DBHelper(this);

        btnSignin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = inputUsername.getText().toString();
                String password = inputPassword.getText().toString();
                String email = inputEmail.getText().toString();

                if(username.isEmpty() || password.isEmpty()) {
                    Toast.makeText(SignUpActivity.this, "Data tidak boleh kosong", Toast.LENGTH_SHORT).show();
                } else {
                    boolean result = dbHelper.insertUser(username, password, email);
                    if(result){
                        Toast.makeText(SignUpActivity.this, "Akun berhasil dibuat!", Toast.LENGTH_SHORT).show();
                        finish(); // Kembali ke LoginActivity
                    } else {
                        Toast.makeText(SignUpActivity.this, "Gagal mendaftar (mungkin username sudah ada)", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        btnAlready.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUpActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
