package com.example.fixit.menu_java;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.fixit.R;
import com.example.fixit.menu_java.new_list_service.New_Services;
import com.example.fixit.menu_java.send_mail.Feedback;
import com.example.fixit.menu_java.send_mail.SendMail;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Other extends AppCompatActivity implements View.OnClickListener {
    BottomNavigationView bottomNavigationView;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
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
        intent = new Intent(getApplicationContext(), Bottom.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.info_but:
                intent = new Intent(getApplicationContext(), Info.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0,0);
                break;
            case R.id.service_but:
                intent = new Intent(getApplicationContext(), New_Services.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0,0);
                break;
            case R.id.contacts_but:
                intent = new Intent(getApplicationContext(), Contacts.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0,0);
                break;
            case R.id.order_but:
                intent = new Intent(getApplicationContext(), Order_for_repair.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0,0);
                break;
            case R.id.mail_but:
                intent = new Intent(getApplicationContext(), Feedback.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0,0);
                break;

        }
    }
}