package com.example.inerzia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void IraPerfil(View view){
        Intent comeback = new Intent(HomeActivity.this, ProfileActivity.class);
        startActivity(comeback);
    }

    public void iraPracticar(View view){
        Intent comeback = new Intent(HomeActivity.this, Practice1Activity.class);
        startActivity(comeback);
    }
    public void iraTest(View view){
        Intent comeback = new Intent(HomeActivity.this,Activity_Test.class);
        startActivity(comeback);
    }
}