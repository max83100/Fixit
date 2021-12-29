package com.example.fixit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.fixit.cut.CUT100S;
import com.example.fixit.cut.CUT120;
import com.example.fixit.cut.CUT40;
import com.example.fixit.cut.CUT40COM;
import com.example.fixit.cut.CUT45P;
import com.example.fixit.cut.CUT60;
import com.example.fixit.menu_java.Bottom;

public class CUT_catalog extends AppCompatActivity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cut_catalog);
    }
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.cut_40com:
                intent = new Intent(this, CUT40COM.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0,0);
                break;
            case R.id.cut_60:
                intent = new Intent(this, CUT60.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0,0);
                break;
            case R.id.cut_40:
                intent = new Intent(this, CUT40.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0,0);
                break;
            case R.id.cut_45p:
                intent = new Intent(this, CUT45P.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0,0);
                break;
            case R.id.cut_120:
                intent = new Intent(this, CUT120.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0,0);
                break;
            case R.id.cut_100_s:
                intent = new Intent(this, CUT100S.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0,0);
                break;
        }
    }
    public void onBackPressed() {
        intent = new Intent(getApplicationContext(), Bottom.class);
        startActivity(intent);
    }
}