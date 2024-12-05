package com.example.widgets;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        Button btnActividad1 = findViewById(R.id.btnActividad1);
        Button btnActividad2 = findViewById(R.id.btnActividad2);
        Button btnActividad3 = findViewById(R.id.btnActividad3);
        Button btnActividad4 = findViewById(R.id.btnActividad4);
        Button btnActividad5 = findViewById(R.id.btnActividad5);

        btnActividad1.setOnClickListener(view -> startActivity(new Intent(ActivityMain.this, LinearLayout.class)));
        btnActividad2.setOnClickListener(view -> startActivity(new Intent(ActivityMain.this, BoxModel.class)));
        btnActividad3.setOnClickListener(view -> startActivity(new Intent(ActivityMain.this, RelativeLayoutExample.class)));
        btnActividad4.setOnClickListener(view -> startActivity(new Intent(ActivityMain.this, Overlap.class)));
        btnActividad5.setOnClickListener(view -> startActivity(new Intent(ActivityMain.this, Imput.class)));
    }
}