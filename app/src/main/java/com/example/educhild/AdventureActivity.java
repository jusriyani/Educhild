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
    public void btnNumber(View view){
        Intent myIntent = new Intent(this, NumberActivity.class);
        startActivity(myIntent);
    }
    public void btnAnimal(View view){
        Intent myIntent = new Intent(this, AnimalActivity.class);
        startActivity(myIntent);
    }
    public void btnBody(View view){
        Intent myIntent = new Intent(this, BodyActivity.class);
        startActivity(myIntent);
    }
    public void btnColor(View view){
        Intent myIntent = new Intent(this, ColorsActivity.class);
        startActivity(myIntent);
    }
    public void btnQuiz(View view){
        Intent myIntent = new Intent(this, QuizActivity.class);
        startActivity(myIntent);
    }
}