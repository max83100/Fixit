package com.example.fixit.mig;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.fixit.MIG_catalog;
import com.example.fixit.R;

public class MIG200 extends AppCompatActivity implements View.OnClickListener {
ImageView torch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mig200);
        torch = findViewById(R.id.torch_problem);
        String hf = "https://github.com/max83100/123/blob/main/problems/Mig200_torch_dont_work.jpg?raw=true";

        Glide.with(this).load(hf)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(torch);


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
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), MIG_catalog.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }
}