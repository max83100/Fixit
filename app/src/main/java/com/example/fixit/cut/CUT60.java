package com.example.fixit.cut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.fixit.R;

public class CUT60 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cut60);
    }
    public void onClick(View v) {
        switch (v.getId()) {

            case(R.id.linkcut60):
                Uri address = Uri.parse(
                        "https://drive.google.com/file/d/1pBb7tD4pVc9IYr9qv6H4CqZS5M0bCqCC/view?usp=sharing");
                Intent openlink = new Intent(Intent.ACTION_VIEW, address);
                startActivity(openlink);
                break;
            case(R.id.webcut60):
                Uri webmig_uri = Uri.parse(
                        "https://grovers.ru/catalog/vozdushno-plazmennaya-rezka/grovers-cut-60-1/");
                Intent webmig = new Intent(Intent.ACTION_VIEW, webmig_uri);
                startActivity(webmig);
                break;
        }
    }
}