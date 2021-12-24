package com.example.fixit.arc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.fixit.R;

public class ENERGY_ARC220 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_energy_arc220);
    }
    public void onClick(View v) {
        switch (v.getId()) {

            case(R.id.linkarc220):
                Uri address = Uri.parse(
                        "https://drive.google.com/drive/folders/12e19LHVTWMeCBQpJHJS271Cantf9SJJ0?usp=sharing");
                Intent openlink = new Intent(Intent.ACTION_VIEW, address);
                startActivity(openlink);
                break;
            case(R.id.webarc220):
                Uri webmig_uri = Uri.parse(
                        "https://grovers.ru/catalog/MMA-svarka/grovers-energy-arc220/");
                Intent webmig = new Intent(Intent.ACTION_VIEW, webmig_uri);
                startActivity(webmig);
                break;
        }
    }
}