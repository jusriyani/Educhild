package com.example.educhild;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize and assign variable
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        //set Home selected
        bottomNavigationView.setSelectedItemId(R.id.home);

        //perform ItemSelectedListener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem){
                switch (menuItem.getItemId()){
                    case R.id.home:
                        return true;
                    case R.id.adventure:
                        startActivity(new Intent(getApplicationContext(),AdventureActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });

    }
    public void kidsArea(View view){
        Intent myIntent = new Intent(this, AdventureActivity.class);
        startActivity(myIntent);
    }
    public void parentsArea(View view){
       Intent myIntent = new Intent(this, CommunityActivity.class);
       startActivity(myIntent);
    }
}