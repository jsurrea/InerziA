package com.example.inerzia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LeccionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leccion);
    }

    public void home(View view){
        Intent comeback = new Intent(LeccionActivity.this, HomeActivity.class);
        startActivity(comeback);
    }

    public void perfil(View view){
        Intent comeback = new Intent(LeccionActivity.this, ProfileActivity.class);
        startActivity(comeback);
    }




}