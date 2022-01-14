package com.example.fixit.menu_java;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.fixit.R;
import com.example.fixit.parts.ARC_parts;
import com.example.fixit.parts.CUT_parts;
import com.example.fixit.parts.MIG_parts;
import com.example.fixit.parts.TIG_parts;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Spare_parts extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    Intent intent;
    ListView listView;
    ArrayAdapter<String> adapter;
    String[] names = { "TIG серия", "MIG серия", "ARC серия", "CUT серия" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spare_parts);
        listView = findViewById(R.id.category_parts_list);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),
                R.layout.list_row, R.id.list_row_text, names);

        // присваиваем адаптер списку
        listView.setAdapter(adapter);
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
                                overridePendingTransition(0, 0);
                                break;
                            case R.id.parts:
                                return false;
                            case R.id.other:
                                intent = new Intent(getApplicationContext(), Other.class);
                                startActivity(intent);
                                finish();
                                overridePendingTransition(0, 0);
                                break;
                        }
                        return false;
                    }
                });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        intent = new Intent(getApplicationContext(), TIG_parts.class);
                        startActivity(intent);
                        finish();
                        overridePendingTransition(0, 0);
                        break;
                    case 1:
                        intent = new Intent(getApplicationContext(), MIG_parts.class);
                        startActivity(intent);
                        finish();
                        overridePendingTransition(0, 0);
                        break;
                    case 2:
                        intent = new Intent(getApplicationContext(), ARC_parts.class);
                        startActivity(intent);
                        finish();
                        overridePendingTransition(0, 0);
                        break;
                    case 3:
                        intent = new Intent(getApplicationContext(), CUT_parts.class);
                        startActivity(intent);
                        finish();
                        overridePendingTransition(0, 0);
                        break;
                }
            }
        });
    }
    public void onBackPressed() {
        intent = new Intent(getApplicationContext(), Bottom.class);
        startActivity(intent);
    }


}