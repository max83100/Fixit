package com.example.fixit.menu_java;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.fixit.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Spare_parts extends AppCompatActivity{
    BottomNavigationView bottomNavigationView;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spare_parts);
        bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navigation_parts);
        bottomNavigationView.setSelectedItemId(R.id.parts);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.charts:
                                intent = new Intent(getApplicationContext(), Bottom.class);
                                startActivity(intent);
                                finish();
                                overridePendingTransition(0,0);
                                break;
                            case R.id.parts:
                                return false;
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
        int seletedItemId = bottomNavigationView.getSelectedItemId();
        if (R.id.parts != seletedItemId) {
            setHomeItem(Spare_parts.this);
        } else {
            super.onBackPressed();
        }
    }

    public void setHomeItem(Activity activity) {
        bottomNavigationView.setSelectedItemId(R.id.charts);
    }
}