package com.example.fixit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mig_catalog);
    }
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.mig_220c:
                Intent mig220c = new Intent(this, MIG220C.class);
                startActivity(mig220c);
                break;
            case R.id.mig_200:
                Intent mig200 = new Intent(this, MIG200.class);
                startActivity(mig200);
                break;
            case R.id.multimig_200pfc:
                Intent multimig200 = new Intent(this, MULTIMIG200PFC.class);
                startActivity(multimig200);
                break;
            case R.id.mig_200p:
                Intent mig200p = new Intent(this, MIG200P.class);
                startActivity(mig200p);
                break;
            case R.id.mig_200c:
                Intent mig200c = new Intent(this, MIG200C.class);
                startActivity(mig200c);
                break;
            case R.id.mig_250:
                Intent mig250 = new Intent(this, MIG250.class);
                startActivity(mig250);
                break;
            case R.id.mig_350_500:
                Intent mig350 = new Intent(this, MIG350.class);
                startActivity(mig350);
                break;
            case R.id.mig_295:
                Intent mig295 = new Intent(this, MIG295.class);
                startActivity(mig295);
                break;
            case R.id.mig_3154R:
                Intent mig3154r = new Intent(this, MIG315T.class);
                startActivity(mig3154r);
                break;
            case R.id.mig500w:
                Intent mig500w = new Intent(this, MIG500W.class);
                startActivity(mig500w);
                break;
            case R.id.emig160_200:
                Intent emig200 = new Intent(this, ENERGY_MIG160_200.class);
                startActivity(emig200);
                break;
        }
    }
}