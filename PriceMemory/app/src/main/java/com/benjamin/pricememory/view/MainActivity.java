package com.benjamin.pricememory.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.benjamin.pricememory.R;
import com.benjamin.pricememory.controller.Controle;

import java.io.Console;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init() {
        //Charger la liste des articles précédemment enrégistrée
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;
        switch (item.getItemId()) {
            case R.id.menuNouveau:
                intent = new Intent(this, EditActivity.class);
                startActivity(intent);
                return true;
            case R.id.menuExportation:
                intent = new Intent(this, ExportActivity.class);
                startActivity(intent);
                return true;
            case R.id.menuImportation:
                intent = new Intent(this, ImportActivity.class);
                startActivity(intent);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}