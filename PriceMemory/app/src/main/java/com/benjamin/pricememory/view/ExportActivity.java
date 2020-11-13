package com.benjamin.pricememory.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.benjamin.pricememory.R;

public class ExportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_export);

        Button annuler = findViewById(R.id.exportAnnuler);
        annuler.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ExportActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button exporter = findViewById(R.id.exporter);
        exporter.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(ExportActivity.this, "En cours de développement", Toast.LENGTH_SHORT).show();
            }
        });
    }
}