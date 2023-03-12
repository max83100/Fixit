package com.example.fixit.tig;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.fixit.R;
import com.example.fixit.TIG_catalog;

public class WSME200P extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wsme200_p);
    }
    public void onClick(View v) {
        switch (v.getId()) {

            case(R.id.linkwsme200p):
                Uri address = Uri.parse("https://drive.google.com/file/d/1s3T9bX_ZijwkGXZHMEPjnxFE4Xm1YrRx/view?usp=sharing");
                Intent openlink = new Intent(Intent.ACTION_VIEW, address);
                startActivity(openlink);
                break;
            case(R.id.webwsme200p):
                Uri webmig_uri = Uri.parse(
                        "https://grovers.ru/catalog/TIG-svarka/grovers_wsme200p_acdc/");
                Intent webmig = new Intent(Intent.ACTION_VIEW, webmig_uri);
                startActivity(webmig);
                break;
            case(R.id.softwsme200p):
                Uri softmig_uri = Uri.parse(
                        "https://drive.google.com/drive/folders/1E8NVEafi88R-NuRe_qqcPE7Yy_KJ3oo6?usp=share_link");
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