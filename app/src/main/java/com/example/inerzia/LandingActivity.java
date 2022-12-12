package com.example.inerzia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class LandingActivity extends AppCompatActivity {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_landing);
//    }

//    public void navegar(View view){
//
//        Intent miIntent=null;
//
//        switch (view.getId()){
//            case R.id.btnIniciarSesion:
//                miIntent=new Intent(LandingActivity.this, SignInActivity.class);
//                break;
//
//            case R.id.btnCrearCuenta:
//                miIntent=new Intent(LandingActivity.this, SignUpActivity.class);
//                break;
//        }
//        startActivity(miIntent);
//    }

    //public class LandingActivity extends AppCompatActivity {

    Button btnSigni;
    Button btnSignu;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
        btnSigni = findViewById(R.id.btnIniciarSesion);
        btnSignu = findViewById(R.id.btnCrearCuenta);

        btnSigni.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LandingActivity.this,SignInActivity.class);
                startActivity(intent);
            }
        });

        btnSignu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LandingActivity.this,SignUpActivity.class);
                startActivity(intent);
            }
        });
        inicializarBD();

    }

    public void  inicializarBD(){
        FirebaseApp.initializeApp(this);
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();
        Toast.makeText(this, " Base de datos iniciada", Toast.LENGTH_SHORT).show();
    }


}