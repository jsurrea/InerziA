package com.example.inerzia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    @Override
    public  boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_profile,menu);
        return super.onCreateOptionsMenu(menu);
    }
    public void aPerfil(View view){
        Intent comeback = new Intent(ProfileActivity.this, ProfileActivity.class);
        startActivity(comeback);
    }
    public void aHome(View view){
        Intent comeback = new Intent(ProfileActivity.this, HomeActivity.class);
        startActivity(comeback);
    }
    public void aPracticar(View view){
        Intent comeback = new Intent(ProfileActivity.this, Practice1Activity.class);
        startActivity(comeback);
    }

}