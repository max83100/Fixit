package com.example.fixit.tig;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.fixit.MIG_catalog;
import com.example.fixit.R;
import com.example.fixit.TIG_catalog;

public class ENERGY_TIG180 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_energy_tig180);



    }
    public void onClick(View v) {
        switch (v.getId()) {

            case(R.id.linktig180):
                Uri address = Uri.parse(
                        "https://drive.google.com/file/d/1KXoXrjbqq2TRqrxj_oeK1z9gyrR4HpF_/view?usp=sharing");
                Intent openlink = new Intent(Intent.ACTION_VIEW, address);
                startActivity(openlink);
                break;
            case(R.id.webtig180):
                Uri webmig_uri = Uri.parse(
                        "https://grovers.ru/catalog/TIG-svarka/energy-tig-mma180hf/");
                Intent webmig = new Intent(Intent.ACTION_VIEW, webmig_uri);
                startActivity(webmig);
                break;

        }
    }
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), TIG_catalog.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }
}