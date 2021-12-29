package com.example.fixit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.fixit.menu_java.Bottom;
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
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tig_catalog);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.wsme_200:
                intent = new Intent(this, WSME200.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0,0);
                break;
            case R.id.wsme_200w:
               intent = new Intent(this, WSME200W.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0,0);
                break;
            case R.id.wsme_200e:
                intent = new Intent(this, WSME200E.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0,0);
                break;
            case R.id.wsme_200p:
                intent = new Intent(this, WSME200P.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0,0);
                break;
            case R.id.etig180:
                intent = new Intent(this, ENERGY_TIG180.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0,0);
                break;
            case R.id.wsme_315wc:
                intent = new Intent(this, WSME315WC.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0,0);
                break;
            case R.id.wsme_315w:
                intent = new Intent(this, WSME315W.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0,0);
                break;
            case R.id.etig_200:
                intent = new Intent(this, ENERGY_TIG200.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0,0);
                break;
            case R.id.tig_200dc:
                intent = new Intent(this, TIG200_DC.class);
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