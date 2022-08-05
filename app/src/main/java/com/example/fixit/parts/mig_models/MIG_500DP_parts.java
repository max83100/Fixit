package com.example.fixit.parts.mig_models;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.fixit.R;
import com.example.fixit.parts.MIG_parts;

public class MIG_500DP_parts extends AppCompatActivity {
    ImageView mig_500dp_power_image;
    ImageView mig_500dp_front_board_image;
    ImageView mig_500dp_front_board_image2;
    ImageView mig_500dp_pump_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mig500_dp_parts);

        mig_500dp_power_image = findViewById(R.id.mig_500dp_power_image);
        mig_500dp_front_board_image = findViewById(R.id.mig_500dp_front_board_image);
        mig_500dp_front_board_image2 = findViewById(R.id.mig_500dp_front_board_image2);
        mig_500dp_pump_image = findViewById(R.id.mig_500dp_pump_image);
        downloadImage();
    }

    private void downloadImage() {
        String url = "https://github.com/max83100/123/blob/main/spare_parts/MIG%20500DP/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%B1%D0%BB%D0%BE%D0%BA%D0%B0%20%D0%BF%D0%B8%D1%82%D0%B0%D0%BD%D0%B8%D1%8F%20Y13089004.jpg?raw=true";
        Glide.with(this).load(url)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig_500dp_power_image);
        String url2 = "https://github.com/max83100/123/blob/main/spare_parts/MIG%20500DP/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%BB%D0%B8%D1%86%D0%B5%D0%B2%D0%B0%D1%8F%20Y13089003.jpg?raw=true";
        Glide.with(this).load(url2)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig_500dp_front_board_image);
        String url3 = "https://github.com/max83100/123/blob/main/spare_parts/MIG%20500DP/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%BB%D0%B8%D1%86%D0%B5%D0%B2%D0%B0%D1%8F.jpg?raw=true";
        Glide.with(this).load(url3)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig_500dp_front_board_image2);
        String url4 = "https://github.com/max83100/123/blob/main/spare_parts/%D0%9C%D0%BE%D1%82%D0%BE%D1%80%D1%8B/%D0%9C%D0%BE%D1%82%D0%BE%D1%80%20220.jpg?raw=true";
        Glide.with(this).load(url4)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig_500dp_pump_image);

    }
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), MIG_parts.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }
}