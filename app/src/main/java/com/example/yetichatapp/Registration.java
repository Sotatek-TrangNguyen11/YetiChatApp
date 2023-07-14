package com.example.yetichatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Button button;
        EditText userName, email, password, rePassword;
        TextView loginbut;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        getSupportActionBar().hide();

        button = findViewById(R.id.signupbutton);
        userName = findViewById(R.id.rgusername);
        email = findViewById(R.id.rgemail);
        password = findViewById(R.id.rgpassword);
        rePassword = findViewById(R.id.rgrepassword);
        loginbut = findViewById(R.id.loginbut);

        loginbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Registration.this, Login.class);
                startActivity(intent);
                finish();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String UserName = userName.getText().toString();
                String Email = email.getText().toString();
                String Pass = password.getText().toString();
                String RePass = rePassword.getText().toString();

                // Gửi api đến server

                Intent intent = new Intent(Registration.this, Login.class);
                startActivity(intent);
                finish();
            }
        });
    }
}