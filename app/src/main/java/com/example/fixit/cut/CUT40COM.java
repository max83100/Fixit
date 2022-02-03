package com.example.fixit.cut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.fixit.CUT_catalog;
import com.example.fixit.R;

public class CUT40COM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cut40_com);
    }
    public void onClick(View v) {
        switch (v.getId()) {

            case(R.id.linkcut40com):
                Uri address = Uri.parse(
                        "https://drive.google.com/file/d/1fX963_q7j3d9-ANBTpPKoc7Rp1ttShg1/view?usp=sharing");
                Intent openlink = new Intent(Intent.ACTION_VIEW, address);
                startActivity(openlink);
                break;
            case(R.id.webcut40com):
                Uri webmig_uri = Uri.parse(
                        "https://grovers.ru/catalog/vozdushno-plazmennaya-rezka/cut-40kompressor/");
                Intent webmig = new Intent(Intent.ACTION_VIEW, webmig_uri);
                startActivity(webmig);
                break;
        }
    }
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), CUT_catalog.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }
}