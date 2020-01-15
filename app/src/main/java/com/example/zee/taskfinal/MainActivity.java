package com.example.zee.taskfinal;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {


    private static final String TAG = "MainActivity";
    BottomNavigationView bottomNavigationView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation_view);

        bottomNavigationView.setOnNavigationItemSelectedListener(this);

        bottomNavigationView.setSelectedItemId(R.id.home);
        Log.d(TAG, "Rach ");
    }

    home homel = new home();
    search searchl = new search();
    add addl = new add();
    like likel = new like();
    profile profilel = new profile();

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.home:
                getSupportFragmentManager().beginTransaction().replace(R.id.frame, homel).commit();
                return true;

            case R.id.search:
                getSupportFragmentManager().beginTransaction().replace(R.id.frame, searchl).commit();
                Log.d(TAG, "Reach ");
                return true;

            case R.id.add:
                getSupportFragmentManager().beginTransaction().replace(R.id.frame, addl).commit();
                return true;

            case R.id.like:
                getSupportFragmentManager().beginTransaction().replace(R.id.frame, likel).commit();
                return true;

            case R.id.profile:
                getSupportFragmentManager().beginTransaction().replace(R.id.frame, profilel).commit();
                return true;


        }

        return false;
    }


}