package com.example.educhild;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ArticleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);
    }
    public void backToHome(View view){
        Intent myIntent = new Intent(this, MainActivity.class);
        startActivity(myIntent);
    }
    public void backToCommunity(View view){
        Intent myIntent = new Intent(this, CommunityActivity.class);
        startActivity(myIntent);
    }
}