package com.example.fixit.menu_java;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.fixit.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Other extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navigation_other);
        bottomNavigationView.setSelectedItemId(R.id.other);

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
                                intent = new Intent(getApplicationContext(), Spare_parts.class);
                                startActivity(intent);
                                finish();
                                overridePendingTransition(0,0);
                                break;
                            case R.id.other:
                            return false;
                        }

                        return false;
                    }
                });
    }
    @Override
    public void onBackPressed() {
        int seletedItemId = bottomNavigationView.getSelectedItemId();
        if (R.id.other != seletedItemId) {
            setHomeItem(Other.this);
        } else {
            super.onBackPressed();
        }
    }

    public void setHomeItem(Activity activity) {
        bottomNavigationView.setSelectedItemId(R.id.charts);
    }
}