package com.example.fixit.mig;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.fixit.MIG_catalog;
import com.example.fixit.R;

public class COMBO200 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combo200);


    }

    public void onClick(View v) {
        switch (v.getId()) {

            case (R.id.linkcombo200):
                Uri address = Uri.parse("");
                Intent openlink = new Intent(Intent.ACTION_VIEW, address);
                startActivity(openlink);
                break;
            case (R.id.webcombo200):
                Uri webmig = Uri.parse(
                        "https://grovers.ru/catalog/gagarin-combo-200-ac-dc/");
                Intent webmig200 = new Intent(Intent.ACTION_VIEW, webmig);
                startActivity(webmig200);
                break;
            case (R.id.softcombo200):
                Uri softmig = Uri.parse(
                        "https://drive.google.com/drive/folders/1o-8VF0xKzd1tWZOX78qZ_B0ASmWjJb6g?usp=share_link");
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