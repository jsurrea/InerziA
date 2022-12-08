package com.example.inerzia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity_Test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }

    public void gotoTest(View view){
        Intent comeback = new Intent(Activity_Test.this, LeccionActivity.class);
        startActivity(comeback);
    }
}