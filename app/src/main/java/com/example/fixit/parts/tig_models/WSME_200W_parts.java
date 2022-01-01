package com.example.fixit.parts.tig_models;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.fixit.R;
import com.example.fixit.parts.TIG_parts;

public class WSME_200W_parts extends AppCompatActivity {
    ImageView wsme200w_front_board_image;
    ImageView wsme200w_power_board_image;
    ImageView wsme200w_sec_invertor_board_image;
    ImageView wsme200w_first_invertor_board_image;
    ImageView wsme200w_control_board_image;
    ImageView wsme200w_hf_board_image;
    Button inside;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wsme200_wparts);
        inside = findViewById(R.id.wsme_200w_inside);
        inside.setOnClickListener(this::onClick);

        wsme200w_front_board_image = findViewById(R.id.wsme200w_front_board_image);
        String url = "https://github.com/max83100/123/blob/main/spare_parts/WSME%20200W/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%BB%D0%B8%D1%86%D0%B5%D0%B2%D0%B0%D1%8F%205.069.507.jpg?raw=true";
        Glide.with(this).load(url)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(wsme200w_front_board_image);


        wsme200w_power_board_image = findViewById(R.id.wsme200w_power_board_image);
        String url2 = "https://github.com/max83100/123/blob/main/spare_parts/WSME%20200/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%B1%D0%BB%D0%BE%D0%BA%D0%B0%20%D0%BF%D0%B8%D1%82%D0%B0%D0%BD%D0%B8%D1%8F%205.496.526-R-1.jpg?raw=true";
        Glide.with(this).load(url2)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(wsme200w_power_board_image);

        wsme200w_sec_invertor_board_image = findViewById(R.id.wsme200w_sec_invertor_board_image);
        String url3 = "https://github.com/max83100/123/blob/main/spare_parts/WSME%20200/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%B2%D1%82%D0%BE%D1%80%D0%B8%D1%87%D0%BD%D0%BE%D0%B3%D0%BE%20%D0%B8%D0%BD%D0%B2%D0%B5%D1%80%D1%82%D0%BE%D1%80%D0%B0%205.496.674-C.jpg?raw=true";
        Glide.with(this).load(url3)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(wsme200w_sec_invertor_board_image);

        wsme200w_first_invertor_board_image = findViewById(R.id.wsme200w_first_invertor_board_image);
        String url4 = "https://github.com/max83100/123/blob/main/spare_parts/WSME%20200/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%BF%D0%B5%D1%80%D0%B2%D0%B8%D1%87%D0%BD%D0%BE%D0%B3%D0%BE%20%D0%B8%D0%BD%D0%B2%D0%B5%D1%80%D1%82%D0%BE%D1%80%D0%B0%205.496.527-D-2.jpg?raw=true";
        Glide.with(this).load(url4)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(wsme200w_first_invertor_board_image);


        wsme200w_hf_board_image = findViewById(R.id.wsme200w_hf_board_image);
        String url6 = "https://github.com/max83100/123/blob/main/spare_parts/WSME%20200/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%BE%D1%81%D1%86%D0%B8%D0%BB%D0%BB%D1%8F%D1%82%D0%BE%D1%80%D0%B0%205.496.373-H.jpg?raw=true";
        Glide.with(this).load(url6)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(wsme200w_hf_board_image);

        wsme200w_control_board_image = findViewById(R.id.wsme200w_control_board_image);
        String url7 = "https://github.com/max83100/123/blob/main/spare_parts/WSME%20200W/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D1%83%D0%BF%D1%80%D0%B0%D0%B2%D0%BB%D0%B5%D0%BD%D0%B8%D1%8F%208.066.547-%D0%A1.jpg?raw=true";
        Glide.with(this).load(url7)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(wsme200w_control_board_image);


    }
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), TIG_parts.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }

    public void onClick(View v) {
        if (v.getId() == R.id.wsme_200w_inside) {
            Uri address = Uri.parse(
                    "https://drive.google.com/drive/folders/1i8Fez7-kW3PdNZlfFMqU3M-BYu8cYzVp?usp=sharing");
            Intent openlink = new Intent(Intent.ACTION_VIEW, address);
            startActivity(openlink);
        }
    }
}