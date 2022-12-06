package com.example.inerzia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }
    public void InicioSesion(View view){
        Intent start = new Intent(SignInActivity.this, HomeActivity.class);
        startActivity(start);
    }

    public void back(View view){
        Intent comeback = new Intent(SignInActivity.this, LandingActivity.class);
        startActivity(comeback);
    }
}