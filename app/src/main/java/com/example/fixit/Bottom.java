package com.example.fixit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Bottom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom);
        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.action_favorites:
                                Toast.makeText(getApplicationContext(), "1", Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.action_schedules:
                                Toast.makeText(getApplicationContext(), "2", Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.action_music:
                                Toast.makeText(getApplicationContext(), "3", Toast.LENGTH_SHORT).show();
                                break;
                        }
                        return false;
                    }
                });
    }
}