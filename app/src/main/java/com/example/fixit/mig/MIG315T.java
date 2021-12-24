package com.example.fixit.mig;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.fixit.R;

public class MIG315T extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mig3154_r);
    }
    public void onClick(View v) {
        switch (v.getId()) {

            case(R.id.linkmig3154r):
                Uri address = Uri.parse("https://drive.google.com/drive/folders/1hD7p60xb6QSIb4FCvxQ-ZkYuPKRQQEN-?usp=sharing");
                Intent openlink = new Intent(Intent.ACTION_VIEW, address);
                startActivity(openlink);
                break;
            case(R.id.webmig3154r):
                Uri webmig = Uri.parse(
                        "https://grovers.ru/catalog/MIG-MAG-svarka/poluavtomat-grovers-mig-315t/");
                Intent webmig200 = new Intent(Intent.ACTION_VIEW, webmig);
                startActivity(webmig200);
                break;
        }
}}