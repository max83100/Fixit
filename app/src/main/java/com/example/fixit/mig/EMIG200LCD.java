package com.example.fixit.mig;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.fixit.CUT_catalog;
import com.example.fixit.MIG_catalog;
import com.example.fixit.R;

public class EMIG200LCD extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emig200_lcd);
    }
    public void onClick(View v) {
        switch (v.getId()) {

            case(R.id.linkemig200lcd):
                Uri address = Uri.parse(
                        "https://drive.google.com/drive/folders/1MRxneUZMitOKb1GURnC7Rghy7XgYf5pC?usp=sharing");
                Intent openlink = new Intent(Intent.ACTION_VIEW, address);
                startActivity(openlink);
                break;
            case(R.id.webemig200lcd):
                Uri webmig160 = Uri.parse(
                        "https://grovers.ru/catalog/MIG-MAG-svarka/grovers-energy-mig-200-lcd-dual-pulse/");
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