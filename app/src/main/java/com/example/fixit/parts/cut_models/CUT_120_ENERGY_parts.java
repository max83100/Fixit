package com.example.fixit.parts.cut_models;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fixit.R;
import com.example.fixit.parts.CUT_parts;

public class CUT_120_ENERGY_parts extends AppCompatActivity {
    Button inside;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cut120_energy_parts);

        inside = findViewById(R.id.cut120_rolwal_inside);
        inside.setOnClickListener(this::onClick);
    }
    public void onClick(View v) {
        if (v.getId() == R.id.cut120_rolwal_inside) {
            Uri address = Uri.parse(
                    "https://drive.google.com/drive/folders/12mDSGWXCBOd2W5PnSwGHalysT37Rfbqo?usp=sharing");
            Intent openlink = new Intent(Intent.ACTION_VIEW, address);
            startActivity(openlink);
        }
    }
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), CUT_parts.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }
}