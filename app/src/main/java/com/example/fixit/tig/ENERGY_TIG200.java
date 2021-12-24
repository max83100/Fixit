package com.example.fixit.tig;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.fixit.R;


public class ENERGY_TIG200 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_energy_tig200);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case(R.id.linktig200):
                Uri address = Uri.parse(
                        "https://drive.google.com/drive/folders/1-VCRhcgVREeL6y1ppCPPP4zERuJ9UbCW?usp=sharing");
                Intent openlink = new Intent(Intent.ACTION_VIEW, address);
                startActivity(openlink);
                break;
            case(R.id.webtig200):
                Uri webmig_uri = Uri.parse(
                        "https://grovers.ru/catalog/TIG-svarka/grovers-energy-tig200-ac-dc-double-pulse/");
                Intent webmig = new Intent(Intent.ACTION_VIEW, webmig_uri);
                startActivity(webmig);
                break;
        }
    }
}