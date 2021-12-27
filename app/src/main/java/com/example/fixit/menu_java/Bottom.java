package com.example.fixit.menu_java;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.fixit.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Bottom extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom);
        bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.charts);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.charts:
                                return false;
                            case R.id.parts:
                                intent = new Intent(getApplicationContext(), Spare_parts.class);
                                startActivity(intent);
                                finish();
                                overridePendingTransition(0,0);
                                break;
                            case R.id.other:
                                intent = new Intent(getApplicationContext(), Other.class);
                                startActivity(intent);
                                finish();
                                overridePendingTransition(0,0);
                                break;
                        }
                        return false;
                    }
                });
    }
    @Override
    public void onBackPressed() {


            super.onBackPressed();

    }

    public void setHomeItem(Activity activity) {
        bottomNavigationView.setSelectedItemId(R.id.charts);
    }












}