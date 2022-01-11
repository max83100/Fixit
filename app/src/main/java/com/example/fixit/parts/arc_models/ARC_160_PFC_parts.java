package com.example.fixit.parts.arc_models;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.fixit.R;
import com.example.fixit.parts.ARC_parts;
import com.example.fixit.parts.CUT_parts;

public class ARC_160_PFC_parts extends AppCompatActivity implements View.OnClickListener {
    ImageView acr160_pfc_control_board_image;
    ImageView arc160_pfc_plastic_image;
    Button inside;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arc160_pfc_parts);
        acr160_pfc_control_board_image = findViewById(R.id.acr160_pfc_control_board_image);
        arc160_pfc_plastic_image = findViewById(R.id.arc160_pfc_plastic_image);
        inside = findViewById(R.id.arc_160_pfc_inside);
        inside.setOnClickListener(this);
        downloadImage();

    }
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), ARC_parts.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.arc_160_pfc_inside){
            Uri address = Uri.parse(
                    "https://drive.google.com/drive/folders/1WKjrFgmKe_-OZiPIsZLVPGZgHCg_7KrR?usp=sharing");
            Intent openlink = new Intent(Intent.ACTION_VIEW, address);
            startActivity(openlink);
        }
    }
    public void downloadImage(){
        String url = "https://github.com/max83100/123/blob/main/spare_parts/ARC%20160%20PFC/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D1%83%D0%BF%D1%80%D0%B0%D0%B2%D0%BB%D0%B5%D0%BD%D0%B8%D1%8F%20W.%20496RM.195-1.jpg?raw=true";

        Glide.with(this).load(url)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(acr160_pfc_control_board_image);


        String url2 = "https://github.com/max83100/123/blob/main/spare_parts/ARC%20160%20PFC/%D0%BF%D0%BB%D0%B0%D1%81%D1%82%D0%B8%D0%BA%D0%BE%D0%B2%D1%8B%D0%B5%20%D0%BF%D0%B0%D0%BD%D0%B5%D0%BB%D0%B8%208.068.011.jpg?raw=true";

        Glide.with(this).load(url2)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(arc160_pfc_plastic_image);

    }
}