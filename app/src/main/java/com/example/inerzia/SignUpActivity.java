package com.example.inerzia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }
    public void nuevaCuenta(View view){
        Intent sesion = new Intent(SignUpActivity.this, HomeActivity.class);
        startActivity(sesion);
    }

    public void regresar(View view){
        Intent back = new Intent(SignUpActivity.this, LandingActivity.class);
        startActivity(back);
    }
}