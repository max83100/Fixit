package com.example.fixit.tig;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.fixit.R;
import com.example.fixit.TIG_catalog;

public class WSME200W extends AppCompatActivity implements View.OnClickListener {
    ImageView front_problem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wsme200_w);
        preload();
    }
    public void onClick(View v) {
        switch (v.getId()) {

            case(R.id.webwsme200w):
                Uri webmig_uri = Uri.parse(
                        "https://grovers.ru/catalog/TIG-svarka/grovers_wsme200w_acdc_pulse/");
                Intent webmig = new Intent(Intent.ACTION_VIEW, webmig_uri);
                startActivity(webmig);
                break;

        }


    }

    private void preload() {
        front_problem = findViewById(R.id.wsme200_front_problem);
        String url = "https://github.com/max83100/123/blob/main/problems/wsme%20200w%20front%20problem.jpg?raw=true";
        Glide.with(this).load(url)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(front_problem);
    }

    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), TIG_catalog.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }
}