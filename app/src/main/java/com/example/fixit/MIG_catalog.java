package com.example.fixit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.fixit.menu_java.Bottom;
import com.example.fixit.mig.COMBO200;
import com.example.fixit.mig.ENERGY_MIG160_200;
import com.example.fixit.mig.MIG200;
import com.example.fixit.mig.MIG200C;
import com.example.fixit.mig.MIG200P;
import com.example.fixit.mig.MIG220C;
import com.example.fixit.mig.MIG250;
import com.example.fixit.mig.MIG295;
import com.example.fixit.mig.MIG315T;
import com.example.fixit.mig.MIG350;
import com.example.fixit.mig.MIG500W;
import com.example.fixit.mig.MULTIMIG200PFC;

public class MIG_catalog extends AppCompatActivity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mig_catalog);
    }
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.mig_220c:
                intent = new Intent(this, MIG220C.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0,0);
                break;
            case R.id.mig_200:
                intent = new Intent(this, MIG200.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0,0);
                break;
            case R.id.multimig_200pfc:
                intent = new Intent(this, MULTIMIG200PFC.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0,0);
                break;
            case R.id.mig_200p:
                intent = new Intent(this, MIG200P.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0,0);
                break;
            case R.id.mig_200c:
                intent = new Intent(this, MIG200C.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0,0);
                break;
            case R.id.mig_250:
                intent = new Intent(this, MIG250.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0,0);
                break;
            case R.id.mig_350_500:
                intent = new Intent(this, MIG350.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0,0);
                break;
            case R.id.mig_295:
                 intent = new Intent(this, MIG295.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0,0);
                break;
            case R.id.mig_3154R:
                intent = new Intent(this, MIG315T.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0,0);
                break;
            case R.id.mig500w:
                intent = new Intent(this, MIG500W.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0,0);
                break;
            case R.id.emig160_200:
                intent = new Intent(this, ENERGY_MIG160_200.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0,0);
                break;
            case R.id.combo200:
                intent = new Intent(this, COMBO200.class);
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