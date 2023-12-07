package com.example.fixit.arc;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fixit.ARC_catalog;
import com.example.fixit.R;

public class ENERGY_ARC200 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.example_for_machine_without_problem);

    }
    public void onClick(View v) {
        switch (v.getId()) {

            case(R.id.soft_example):
                Uri address = Uri.parse(
                        "");
                Intent openlink = new Intent(Intent.ACTION_VIEW, address);
                startActivity(openlink);
                break;
            case(R.id.web_example):
                Uri webmig_uri = Uri.parse(
                        "https://grovers.ru/catalog/MMA-svarka/grovers-energy-arc-200-novinka/");
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
