package com.example.fixit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.fixit.arc.ARC250_315LT;
import com.example.fixit.arc.ARC400;
import com.example.fixit.arc.ARC400LT;
import com.example.fixit.arc.ENERGY_ARC160;
import com.example.fixit.arc.ENERGY_ARC160mini;
import com.example.fixit.arc.ENERGY_ARC200;
import com.example.fixit.arc.ENERGY_ARC220;
import com.example.fixit.arc.MMA200G;
import com.example.fixit.arc.MMA200TEC;
import com.example.fixit.menu_java.Bottom;

public class ARC_catalog extends AppCompatActivity implements View.OnClickListener{
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arc_catalog);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){


            case R.id.arc_400:
                intent = new Intent(this, ARC400.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0,0);
                break;
            case R.id.arc160mini:
                intent = new Intent(this, ENERGY_ARC160mini.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0,0);
                break;
            case R.id.arc220:
                 intent = new Intent(this, ENERGY_ARC220.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0,0);
                break;
            case R.id.mma200tec:
                intent = new Intent(this, MMA200TEC.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0,0);
                break;
            case R.id.mma200g:
                intent = new Intent(this, MMA200G.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0,0);
                break;
            case R.id.earc_200:
                intent = new Intent(this, ENERGY_ARC200.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0,0);
                break;
            case R.id.earc160:
                intent = new Intent(this, ENERGY_ARC160.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0,0);
                break;
            case R.id.arc_250lt:
                intent = new Intent(this, ARC250_315LT.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0,0);
                break;
            case R.id.arc_400lt:
                intent = new Intent(this, ARC400LT.class);
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