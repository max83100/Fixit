package com.example.fixit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.fixit.arc.ARC400;
import com.example.fixit.arc.ENERGY_ARC160;
import com.example.fixit.arc.ENERGY_ARC220;

public class ARC_catalog extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arc_catalog);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){


            case R.id.arc_400:
                Intent arc400 = new Intent(this, ARC400.class);
                startActivity(arc400);
                break;
            case R.id.arc160:
                Intent arc160 = new Intent(this,ENERGY_ARC160.class);
                startActivity(arc160);
                break;
            case R.id.arc220:
                Intent arc220 = new Intent(this, ENERGY_ARC220.class);
                startActivity(arc220);
                break;
        }
    }
}