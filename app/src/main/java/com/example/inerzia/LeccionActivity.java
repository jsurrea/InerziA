package com.example.inerzia;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LeccionActivity extends AppCompatActivity {

    Button btnP;
    Button btnH;
    Button btnL;
    Button btnV;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leccion);
        btnP = findViewById(R.id.btnPerfil);
        btnH = findViewById(R.id.btnHome);
        btnL = findViewById(R.id.btnPrueba);
        btnV = findViewById(R.id.btnVolver);

        btnV.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LeccionActivity.this,HomeActivity.class);
                startActivity(intent);
            }
        });
        btnP.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LeccionActivity.this,ProfileActivity.class);
                startActivity(intent);
            }
        });
        btnH.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LeccionActivity.this,HomeActivity.class);
                startActivity(intent);
            }
        });
        btnL.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LeccionActivity.this,PruebaActivity.class);
                startActivity(intent);
            }
        });
    }
}