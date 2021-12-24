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

public class CUT_catalog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cut_catalog);
    }
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.cut_40com:
                Intent cut40com = new Intent(this, CUT40COM.class);
                startActivity(cut40com);
                break;
            case R.id.cut_60:
                Intent cut60 = new Intent(this, CUT60.class);
                startActivity(cut60);
                break;
            case R.id.cut_40:
                Intent cut40 = new Intent(this, CUT40.class);
                startActivity(cut40);
                break;
            case R.id.cut_45p:
                Intent cut45 = new Intent(this, CUT45P.class);
                startActivity(cut45);
                break;
            case R.id.cut_120:
                Intent cut120 = new Intent(this, CUT120.class);
                startActivity(cut120);
                break;
            case R.id.cut_100_s:
                Intent cut100 = new Intent(this, CUT100S.class);
                startActivity(cut100);
                break;
        }
    }
}