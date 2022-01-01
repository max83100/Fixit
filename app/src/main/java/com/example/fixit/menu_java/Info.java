package com.example.fixit.menu_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.fixit.R;

public class Info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
    }
    public void onBackPressed() {
         Intent intent = new Intent(getApplicationContext(), Other.class);
        startActivity(intent);
    }
}