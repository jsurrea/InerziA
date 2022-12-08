package com.example.inerzia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LessonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);
    }

    public void volver(View view){
        Intent comeback = new Intent(LessonActivity.this, HomeActivity.class);
        startActivity(comeback);
    }
    public void limpiar(View view){
        Intent comeback = new Intent(LessonActivity.this, ProfileActivity.class);
        startActivity(comeback);
    }
}