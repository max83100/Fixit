package com.example.fixit.mig;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.fixit.CUT_catalog;
import com.example.fixit.MIG_catalog;
import com.example.fixit.R;

public class ENERGY_MIG160_200 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_energy_mig160200);
    }
    public void onClick(View v) {
        switch (v.getId()) {

            case(R.id.linkmig160_200):
                Uri address = Uri.parse(
                        "https://drive.google.com/drive/folders/1YWSe31o_wTHa8SJDApiY_4glFDSc5LKV?usp=sharing");
                Intent openlink = new Intent(Intent.ACTION_VIEW, address);
                startActivity(openlink);
                break;
            case(R.id.webmig160):
                Uri webmig160 = Uri.parse(
                        "https://grovers.ru/catalog/MIG-MAG-svarka/mig-160-energy/");
                Intent intentwebmig160 = new Intent(Intent.ACTION_VIEW, webmig160);
                startActivity(intentwebmig160);
                break;
        }
    }
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), MIG_catalog.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }
}