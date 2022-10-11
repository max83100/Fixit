package com.example.fixit.parts.mig_models;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fixit.R;
import com.example.fixit.parts.MIG_parts;

public class MULTIMIG_200_ROLWAL_parts extends AppCompatActivity {
    Button inside;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multimig200_rolwal);
        inside = findViewById(R.id.multimig_200rolwal_inside);
        inside.setOnClickListener(this::onClick);
    }

    public void onClick(View v) {
        if (v.getId() == R.id.multimig_200rolwal_inside) {
            Uri address = Uri.parse(
                    "https://drive.google.com/drive/folders/1jo9HjjB6gr8yhldHyIxUd65C3nBXpXui?usp=sharing");
            Intent openlink = new Intent(Intent.ACTION_VIEW, address);
            startActivity(openlink);
        }
    }
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), MIG_parts.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }
}