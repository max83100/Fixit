package com.example.fixit.tig;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.fixit.R;

public class TIG200_DC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tig200_dc);
    }
    public void onClick(View v) {
        switch (v.getId()) {

            case(R.id.linktig200dc):
                Uri address = Uri.parse(
                        "https://drive.google.com/drive/folders/1tmAoHt01lBk3s803exPc1_bX6f-LsyJ3?usp=sharing");
                Intent openlink = new Intent(Intent.ACTION_VIEW, address);
                startActivity(openlink);
                break;
            case(R.id.webtig200dc):
                Uri webmig_uri = Uri.parse(
                        "https://grovers.ru/catalog/TIG-svarka/grovers-tig-200-dc-pulse/");
                Intent webmig = new Intent(Intent.ACTION_VIEW, webmig_uri);
                startActivity(webmig);
                break;
        }
    }
}