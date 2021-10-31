package com.example.educhild;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ChildNameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_name);
    }

    public void backtToOnboarding(View view){
        Intent myIntent = new Intent(this, OnboardingActivity.class);
        startActivity(myIntent);
    }

    public void nextToAvatar(View view){
        Intent myIntent = new Intent(this, AvatarActivity.class);
        startActivity(myIntent);
    }
}