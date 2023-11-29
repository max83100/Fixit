package com.example.fixit.arc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.fixit.ARC_catalog;
import com.example.fixit.R;

public class MMA200TEC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mma200_tec);
    }
    public void onClick(View v) {
        switch (v.getId()) {

            case(R.id.linkmma200tec):
                Uri address = Uri.parse(
                        "https://drive.google.com/drive/u/2/folders/1ONXPXs7FI8ymlY07p_FtZtPH6u87x5Dr");
                Intent openlink = new Intent(Intent.ACTION_VIEW, address);
                startActivity(openlink);
                break;
            case(R.id.webmma200tec):
                Uri webmig_uri = Uri.parse(
                        "https://grovers.ru/catalog/MMA-svarka/grovers-energy-mma-200tec/");
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