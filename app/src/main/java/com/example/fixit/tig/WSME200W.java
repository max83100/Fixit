package com.example.fixit.tig;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.fixit.R;

public class WSME200W extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wsme200_w);
    }
    public void onClick(View v) {
        switch (v.getId()) {

            case(R.id.webwsme200w):
                Uri webmig_uri = Uri.parse(
                        "https://grovers.ru/catalog/TIG-svarka/grovers_wsme200w_acdc_pulse/");
                Intent webmig = new Intent(Intent.ACTION_VIEW, webmig_uri);
                startActivity(webmig);
                break;

        }

    }
}