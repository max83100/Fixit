package com.example.fixit.mig;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.fixit.MIG_catalog;
import com.example.fixit.R;

public class MIG200C extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mig200_c);
    }
    public void onClick(View v) {
        switch (v.getId()) {

            case(R.id.linkmig200c):
                Uri address = Uri.parse("https://drive.google.com/file/d/1c5HNq3xreAFAqAV5FnZIEpjsbheMPLy6/view?usp=sharing");
                Intent openlink = new Intent(Intent.ACTION_VIEW, address);
                startActivity(openlink);
                break;
            case(R.id.webmig200c):
                Uri webmig = Uri.parse(
                        "https://grovers.ru/catalog/MIG-MAG-svarka/poluavtomat-grovers-mig-200-c/");
                Intent webmig200 = new Intent(Intent.ACTION_VIEW, webmig);
                startActivity(webmig200);
                break;
            case(R.id.softmig200c):
                Uri softmig = Uri.parse(
                        "https://drive.google.com/drive/folders/1tVvS8r2pWSsHPtIwbbP9rz6xSr_V2GEP?usp=share_link");
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