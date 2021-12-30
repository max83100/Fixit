package com.example.fixit.parts.arc_models;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.fixit.R;

public class ARC_160_PFC_parts extends AppCompatActivity {
    ImageView acr160_pfc_control_board_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arc160_pfc_parts);
        acr160_pfc_control_board_image = findViewById(R.id.acr160_pfc_control_board_image);
        String url = "https://github.com/max83100/123/blob/main/spare_parts/ARC%20160%20PFC/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D1%83%D0%BF%D1%80%D0%B0%D0%B2%D0%BB%D0%B5%D0%BD%D0%B8%D1%8F%20W.%20496RM.195-1.jpg?raw=true";

        Glide.with(this).load(url)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(acr160_pfc_control_board_image);
    }
}