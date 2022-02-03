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


public class ENERGY_TIG200 extends AppCompatActivity implements View.OnClickListener {
ImageView tig200_ac_image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_energy_tig200);
        tig200_ac_image = findViewById(R.id.tig200_ac_image);
        String url = "https://github.com/max83100/123/blob/main/problems/Tig200_ac_problem.jpg?raw=true";
        Glide.with(this).load(url)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(tig200_ac_image);
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
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), TIG_catalog.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }
}