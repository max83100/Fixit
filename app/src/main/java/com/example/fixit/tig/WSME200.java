package com.example.fixit.tig;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.fixit.R;
import com.example.fixit.TIG_catalog;

public class WSME200 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wsme200);
    }
    public void onClick(View v) {
        switch (v.getId()) {

            case(R.id.webwsme200):
                Uri webmig_uri = Uri.parse(
                        "https://grovers.ru/catalog/TIG-svarka/svarochnyy_invertor_grovers_wsme_200_ac_dc_pulsed_tig/");
                Intent webmig = new Intent(Intent.ACTION_VIEW, webmig_uri);
                startActivity(webmig);
                break;
            case(R.id.softwsme200):
                Uri softmig_uri = Uri.parse(
                        "https://drive.google.com/drive/folders/12xREMxvdvIXqYKvMkTdwRtPzUeWdpAGg?usp=share_link");
                Intent softmig = new Intent(Intent.ACTION_VIEW, softmig_uri);
                startActivity(softmig);
                break;

        }

    }
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), TIG_catalog.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }
}