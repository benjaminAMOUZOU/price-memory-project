package com.benjamin.pricememory.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.benjamin.pricememory.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init(){
        //Charger la liste des articles précédemment enrégistrée
    }
}