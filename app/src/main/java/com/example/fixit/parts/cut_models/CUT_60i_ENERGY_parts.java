package com.example.fixit.parts.cut_models;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fixit.R;
import com.example.fixit.parts.CUT_parts;

public class CUT_60i_ENERGY_parts extends AppCompatActivity {
    Button inside;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cut60i_energy_parts);

        inside = findViewById(R.id.cut60i_rolwal_inside);
        inside.setOnClickListener(this::onClick);
    }
    public void onClick(View v) {
        if (v.getId() == R.id.cut60i_rolwal_inside) {
            Uri address = Uri.parse(
                    "https://drive.google.com/drive/folders/19-NJmUi8y9hiHVCbrl8xLwdKhVgWg3yf?usp=sharing");
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