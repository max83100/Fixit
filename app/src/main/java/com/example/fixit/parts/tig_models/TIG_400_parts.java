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

public class TIG_400_parts extends AppCompatActivity {
    ImageView tig400_driver_board_image;
    ImageView tig400_front_board_image;
    ImageView tig400_hf_board_image;
    ImageView tig400_invertor_board_image;
    ImageView tig400_control_board_image;
    ImageView tig400_filter_board_image;
    ImageView tig400_roll_image;
    ImageView tig400_front_plastic_image;
    Button inside;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tig400_parts);
        inside = findViewById(R.id.tig_400_inside);
        inside.setOnClickListener(this::onClick);
        tig400_driver_board_image = findViewById(R.id.tig400_driver_board_image);
        tig400_roll_image = findViewById(R.id.tig400_roll_image);
        tig400_front_board_image = findViewById(R.id.tig400_front_board_image);
        tig400_hf_board_image = findViewById(R.id.tig400_hf_board_image);
        tig400_invertor_board_image = findViewById(R.id.tig400_invertor_board_image);
        tig400_control_board_image = findViewById(R.id.tig400_control_board_image);
        tig400_filter_board_image = findViewById(R.id.tig400_filter_board_image);
        tig400_front_plastic_image = findViewById(R.id.tig400_front_plastic_image);


        downloadImage();
    }

    private void downloadImage() {
        String url = "https://github.com/max83100/123/blob/main/spare_parts/TIG%20400/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%B4%D1%80%D0%B0%D0%B9%D0%B2%D0%B5%D1%80%D0%B0%20W.%20496RM.408-C.jpg?raw=true";
        Glide.with(this).load(url)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(tig400_driver_board_image);
        String url2 = "https://github.com/max83100/123/blob/main/spare_parts/TIG%20400/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%BB%D0%B8%D1%86%D0%B5%D0%B2%D0%B0%D1%8F%20W.%20496RM.420-B.jpg?raw=true";
        Glide.with(this).load(url2)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(tig400_front_board_image);
        String url3 = "https://github.com/max83100/123/blob/main/spare_parts/TIG%20400/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%BE%D1%81%D1%86%D0%B8%D0%BB%D0%BB%D1%8F%D1%82%D0%BE%D1%80%D0%B0%20W.%20496RM.247-C.jpg?raw=true";
        Glide.with(this).load(url3)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(tig400_hf_board_image);
        String url4 = "https://github.com/max83100/123/blob/main/spare_parts/TIG%20400/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D1%81%D0%B8%D0%BB%D0%BE%D0%B2%D0%B0%D1%8F%20W.%20423RM.407.jpg?raw=true";
        Glide.with(this).load(url4)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(tig400_invertor_board_image);
        String url5 = "https://github.com/max83100/123/blob/main/spare_parts/TIG%20400/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D1%83%D0%BF%D1%80%D0%B0%D0%B2%D0%BB%D0%B5%D0%BD%D0%B8%D1%8F%20WP.%20496RM.312-E-1.jpg?raw=true";
        Glide.with(this).load(url5)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(tig400_control_board_image);
        String url6 = "https://github.com/max83100/123/blob/main/spare_parts/TIG%20400/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D1%84%D0%B8%D0%BB%D1%8C%D1%82%D1%80%D0%BE%D0%B2%20W.%20496RM.450.jpg?raw=true";
        Glide.with(this).load(url6)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(tig400_filter_board_image);
        String url7 = "https://github.com/max83100/123/blob/main/spare_parts/TIG%20400/%D0%BA%D0%BE%D0%BB%D0%B5%D1%81%D0%BE%20%D0%B7%D0%B0%D0%B4%D0%BD%D0%B5%D0%B5.jpg?raw=true";
        Glide.with(this).load(url7)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(tig400_roll_image);
        String url8 = "https://github.com/max83100/123/blob/main/spare_parts/TIG%20400/%D0%BF%D0%B5%D1%80%D0%B5%D0%B4%D0%BD%D1%8F%D1%8F%20%D0%BF%D0%BB%D0%B0%D1%81%D1%82%D0%B8%D0%BA%D0%BE%D0%B2%D0%B0%D1%8F%20%D0%BF%D0%B0%D0%BD%D0%B5%D0%BB%D1%8C%208.069.975.jpg?raw=true";
        Glide.with(this).load(url8)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(tig400_front_plastic_image);

    }

    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), TIG_parts.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }
    public void onClick(View v) {
        if (v.getId() == R.id.tig_400_inside) {
            Uri address = Uri.parse(
                    "https://drive.google.com/drive/folders/1U8xg_5p321A5rQ8P08NqsF4NM4aoNVnW?usp=sharing");
            Intent openlink = new Intent(Intent.ACTION_VIEW, address);
            startActivity(openlink);
        }
    }
}