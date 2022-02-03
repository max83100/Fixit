package com.example.fixit.mig;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.fixit.MIG_catalog;
import com.example.fixit.R;

public class MIG350 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mig350);
    }
    public void onClick(View v) {
        switch (v.getId()) {

            case(R.id.linkmig350):
                Uri address = Uri.parse("https://drive.google.com/file/d/1m9OOw0xhFZPh3-Rl-T9zsVtCXDf3iXBc/view?usp=sharing");
                Intent openlink = new Intent(Intent.ACTION_VIEW, address);
                startActivity(openlink);
                break;
            case(R.id.webmig350):
                Uri webmig_uri = Uri.parse(
                        "https://grovers.ru/catalog/MIG-MAG-svarka/grovers_mig_mma_350/");
                Intent webmig = new Intent(Intent.ACTION_VIEW, webmig_uri);
                startActivity(webmig);
                break;
        }
    }
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), MIG_catalog.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }
}