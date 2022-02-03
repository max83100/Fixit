package com.example.fixit.cut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.fixit.ARC_catalog;
import com.example.fixit.CUT_catalog;
import com.example.fixit.R;

public class CUT40 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cut40);
    }
    public void onClick(View v) {
        switch (v.getId()) {

            case(R.id.linkcut40):
                Uri address = Uri.parse(
                        "https://drive.google.com/drive/folders/1wz2hB4feIlhlU7SZbnL5Cn2H8XyEZzun?usp=sharing");
                Intent openlink = new Intent(Intent.ACTION_VIEW, address);
                startActivity(openlink);
                break;
            case(R.id.webcut40):
                Uri webmig_uri = Uri.parse(
                        "https://grovers.ru/catalog/vozdushno-plazmennaya-rezka/grovers_cut40/");
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