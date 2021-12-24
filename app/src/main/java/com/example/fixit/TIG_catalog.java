package com.example.fixit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.fixit.tig.ENERGY_TIG180;
import com.example.fixit.tig.ENERGY_TIG200;
import com.example.fixit.tig.TIG200_DC;
import com.example.fixit.tig.WSME200;
import com.example.fixit.tig.WSME200E;
import com.example.fixit.tig.WSME200P;
import com.example.fixit.tig.WSME200W;
import com.example.fixit.tig.WSME315W;
import com.example.fixit.tig.WSME315WC;

public class TIG_catalog extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tig_catalog);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.wsme_200:
                Intent wsme200 = new Intent(this, WSME200.class);
                startActivity(wsme200);
                break;
            case R.id.wsme_200w:
                Intent wsme200w = new Intent(this, WSME200W.class);
                startActivity(wsme200w);
                break;
            case R.id.wsme_200e:
                Intent wsme200e = new Intent(this, WSME200E.class);
                startActivity(wsme200e);
                break;
            case R.id.wsme_200p:
                Intent wsme200p = new Intent(this, WSME200P.class);
                startActivity(wsme200p);
                break;
            case R.id.etig180:
                Intent etig180 = new Intent(this, ENERGY_TIG180.class);
                startActivity(etig180);
                break;
            case R.id.wsme_315wc:
                Intent wsme315wc = new Intent(this, WSME315WC.class);
                startActivity(wsme315wc);
                break;
            case R.id.wsme_315w:
                Intent wsme315w = new Intent(this, WSME315W.class);
                startActivity(wsme315w);
                break;
            case R.id.etig_200:
                Intent etig200 = new Intent(this, ENERGY_TIG200.class);
                startActivity(etig200);
                break;
            case R.id.tig_200dc:
                Intent tig200 = new Intent(this, TIG200_DC.class);
                startActivity(tig200);
                break;
        }
    }
}