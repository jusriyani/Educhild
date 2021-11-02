package com.example.educhild;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CommunityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community);
    }
    public void backToHome(View view){
        Intent myIntent = new Intent(this, MainActivity.class);
        startActivity(myIntent);
    }
    public void readArticle(View view){
        Intent myIntent = new Intent(this, ArticleActivity.class);
        startActivity(myIntent);
    }
}