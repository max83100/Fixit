package com.example.fixit.mig;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fixit.R;

public class MIG200 extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mig200);


    }
    public void onClick(View v) {
        switch (v.getId()) {
            case(R.id.webmig200):
                Uri webmig = Uri.parse(
                        "https://grovers.ru/catalog/MIG-MAG-svarka/poluavtomat-grovers-mig-200-p/");
                Intent webmig200 = new Intent(Intent.ACTION_VIEW, webmig);
                startActivity(webmig200);
                break;
        }
    }
}