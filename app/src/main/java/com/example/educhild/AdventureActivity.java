package com.example.educhild;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class AdventureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adventure);
    }
    public void backtToHome(View view){
        Intent myIntent = new Intent(this, MainActivity.class);
        startActivity(myIntent);
    }
    public void btnFood(View view) {
        Intent myIntetnt = new Intent (this, FoodActivity.class);
        startActivity(myIntetnt);
    }
    public void btnAlphabet(View view){
        Intent myIntent = new Intent(this, AlphabetActivity.class);
        startActivity(myIntent);
    }
}