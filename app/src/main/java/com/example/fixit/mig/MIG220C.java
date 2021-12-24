package com.example.fixit.mig;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.fixit.R;

public class MIG220C extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mig220_c);
    }
    public void onClick(View v) {
        switch (v.getId()) {

            case(R.id.linkmig220c):
                Uri address = Uri.parse("https://drive.google.com/drive/folders/1FJTFwekIJb2HlzLt4CTd79uB3iAYyUrt?usp=sharing");
                Intent openlink = new Intent(Intent.ACTION_VIEW, address);
                startActivity(openlink);
                break;
            case(R.id.webmig220c):
                Uri webmig = Uri.parse(
                        "https://grovers.ru/catalog/pioner-2020-mig220c-acdc/grovers_mig_220s_ac_dc_/");
                Intent webmig200 = new Intent(Intent.ACTION_VIEW, webmig);
                startActivity(webmig200);
                break;
        }
    }
}