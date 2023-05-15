package com.example.fixit.mig;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.fixit.MIG_catalog;
import com.example.fixit.R;

public class MIG220E extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mig220_e);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case (R.id.linkmig220e):
                Uri address = Uri.parse("https://drive.google.com/drive/folders/15W3hfBkSBiakwN1g2nZ_1Hhd0v-V6wQn?usp=share_link");
                Intent openlink = new Intent(Intent.ACTION_VIEW, address);
                startActivity(openlink);
                break;
            case (R.id.webmig220e):
                Uri webmig = Uri.parse(
                        "https://grovers.ru/catalog/MIG-MAG-svarka/grovers-mig-220e-ac-dc/");
                Intent webmig200 = new Intent(Intent.ACTION_VIEW, webmig);
                startActivity(webmig200);
                break;
            case (R.id.softmig220e):
                Uri softmig = Uri.parse(
                        "");
                Intent softmig200 = new Intent(Intent.ACTION_VIEW, softmig);
                startActivity(softmig200);
                break;
        }
    }
        public void onBackPressed() {
            Intent intent = new Intent(getApplicationContext(), MIG_catalog.class);
            startActivity(intent);
            overridePendingTransition(0,0);
        }
    }
}