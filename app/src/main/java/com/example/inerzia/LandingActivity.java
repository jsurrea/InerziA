package com.example.inerzia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LandingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
    }

    public void navegar(View view){

        Intent miIntent=null;

        switch (view.getId()){
            case R.id.btnIniciarSesion:
                miIntent=new Intent(LandingActivity.this, SignInActivity.class);
                break;

            case R.id.btnCrearCuenta:
                miIntent=new Intent(LandingActivity.this, SignUpActivity.class);
                break;
        }
        startActivity(miIntent);
    }

}