package com.example.fixit.arc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fixit.ARC_catalog;
import com.example.fixit.R;
import com.example.fixit.menu_java.Spare_parts;

public class ARC400 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arc400);

    }
    public void onClick(View v) {
        switch (v.getId()) {

            case(R.id.linkarc400):
                Uri address = Uri.parse(
                        "https://docs.google.com/document/d/19zTpcY07fnbdnmZcja8R5DKM4Lc-03Fd/edit?usp=sharing&ouid=112362355823733245811&rtpof=true&sd=true");
                Intent openlink = new Intent(Intent.ACTION_VIEW, address);
                startActivity(openlink);
                break;
            case(R.id.webarc400):
                Uri webmig_uri = Uri.parse(
                        "https://grovers.ru/catalog/MMA-svarka/svarochnyy-invertor-grovers-arc-400lt/");
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