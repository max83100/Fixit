package com.example.fixit.menu_java;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.fixit.ARC_catalog;
import com.example.fixit.CUT_catalog;
import com.example.fixit.MIG_catalog;
import com.example.fixit.R;
import com.example.fixit.TIG_catalog;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Bottom extends AppCompatActivity implements View.OnClickListener {
    BottomNavigationView bottomNavigationView;
    Intent intent;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
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
                            case R.id.menu:
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
    private int count = 0;
    @Override
    public void onBackPressed() {
        count++;
        if(count == 2){
            moveTaskToBack(true);
        }


    }

    public void setHomeItem(Activity activity) {
        bottomNavigationView.setSelectedItemId(R.id.charts);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.mig_image:
                intent = new Intent(getApplicationContext(), MIG_catalog.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0,0);
                break;
            case R.id.arc_image:
                intent = new Intent(getApplicationContext(), ARC_catalog.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0,0);
                break;
            case R.id.cut_image:
                intent = new Intent(getApplicationContext(), CUT_catalog.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0,0);
                break;
            case R.id.tig_image:
                intent = new Intent(getApplicationContext(), TIG_catalog.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0,0);
                break;
        }   }
}