package com.example.fixit.arc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.fixit.ARC_catalog;
import com.example.fixit.R;

public class ENERGY_ARC160mini extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_energy_arc160);
    }
    public void onClick(View v) {
        switch (v.getId()) {

            case(R.id.linkarc160):
                Uri address = Uri.parse(
                        "https://drive.google.com/file/d/1vZG7awgOq_30j_MSeq8avKgFiFdV4ruk/view?usp=sharing");
                Intent openlink = new Intent(Intent.ACTION_VIEW, address);
                startActivity(openlink);
                break;
            case(R.id.webarc160):
                Uri webmig_uri = Uri.parse(
                        "https://grovers.ru/catalog/MMA-svarka/mma-160-energy/");
                Intent webmig = new Intent(Intent.ACTION_VIEW, webmig_uri);
                startActivity(webmig);
                break;
        }
    }
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), ARC_catalog.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }
}