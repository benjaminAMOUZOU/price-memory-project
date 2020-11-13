package com.benjamin.pricememory.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.benjamin.pricememory.R;

public class ImportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_import);

        Button annuler = findViewById(R.id.importAnnuler);
        annuler.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ImportActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button importer = findViewById(R.id.importer);
        importer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(ImportActivity.this, "En cours de développement", Toast.LENGTH_SHORT).show();
            }
        });
    }
}