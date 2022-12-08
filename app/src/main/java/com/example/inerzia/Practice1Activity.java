package com.example.inerzia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Practice1Activity extends AppCompatActivity {

    Button btnU1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice1);
        btnU1 = findViewById(R.id.button);

        btnU1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Practice1Activity.this,LessonActivity.class);
                startActivity(intent);
            }
        });
    }
}