package com.example.inerzia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ProfileActivity extends AppCompatActivity {


    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        inicializarBD();
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

    public void  inicializarBD(){
        FirebaseApp.initializeApp(this);
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();
        Toast.makeText(this, " Base de datos iniciada", Toast.LENGTH_SHORT).show();
    }


}