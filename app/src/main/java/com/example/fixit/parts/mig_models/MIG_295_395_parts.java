package com.example.fixit.parts.mig_models;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.fixit.R;
import com.example.fixit.parts.MIG_parts;

public class MIG_295_395_parts extends AppCompatActivity {
    ImageView mig295_control_board_image;
    ImageView mig295_europlug_image;
    ImageView mig295_plastic_image;
    ImageView mig295_rectifilter_image;
    ImageView mig295_valve_image;
    ImageView mig295_mech_image;
    ImageView mig295_switch_image;
    ImageView mig295_switch2_image;
    ImageView mig295_transform_image;
    Button inside;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mig295395_parts);
        mig295_control_board_image = findViewById(R.id.mig295_control_board_image);
        mig295_europlug_image = findViewById(R.id.mig295_europlug_image);
        mig295_plastic_image = findViewById(R.id.mig295_plastic_image);
        mig295_rectifilter_image = findViewById(R.id.mig295_rectifilter_image);
        mig295_valve_image = findViewById(R.id.mig295_valve_image);
        mig295_mech_image = findViewById(R.id.mig295_mech_image);
        mig295_switch_image = findViewById(R.id.mig295_switch_image);
        mig295_switch2_image = findViewById(R.id.mig295_switch2_image);
        mig295_transform_image = findViewById(R.id.mig295_transform_image);
        inside = findViewById(R.id.mig295_inside);
        inside.setOnClickListener(this::onClick);

        downloadImage();
    }

    private void downloadImage() {
        String url = "https://github.com/max83100/123/blob/main/spare_parts/MIG295-395/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D1%83%D0%BF%D1%80%D0%B0%D0%B2%D0%BB%D0%B5%D0%BD%D0%B8%D1%8F%20B01043037.jpg?raw=true";
        Glide.with(this).load(url)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig295_control_board_image);
        String url2 = "https://github.com/max83100/123/blob/main/spare_parts/MIG295-395/%D0%B5%D0%B2%D1%80%D0%BE%D1%80%D0%B0%D0%B7%D1%8A%D1%91%D0%BC.jpg?raw=true";
        Glide.with(this).load(url2)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig295_europlug_image);
        String url3 = "https://github.com/max83100/123/blob/main/spare_parts/MIG295-395/%D0%BF%D0%BB%D0%B0%D1%81%D1%82%D0%B8%D0%BA%20%D0%BF%D0%B0%D0%BD%D0%B5%D0%BB%D1%8C%20%D0%B4%D0%BB%D1%8F%20%D0%B5%D0%B2%D1%80%D0%BE%D1%80%D0%B0%D0%B7%D1%8A%D1%91%D0%BC%D0%B0.jpg?raw=true";
        Glide.with(this).load(url3)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig295_plastic_image);
        String url4 = "https://github.com/max83100/123/blob/main/spare_parts/MIG295-395/%D0%B4%D0%B8%D0%BE%D0%B4%D0%BD%D1%8B%D0%B9%20%D0%BC%D0%BE%D1%81%D1%82%20Y04070014.jpg?raw=true";
        Glide.with(this).load(url4)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig295_rectifilter_image);
        String url5 = "https://github.com/max83100/123/blob/main/spare_parts/MIG295-395/%D0%BA%D0%BB%D0%B0%D0%BF%D0%B0%D0%BD%20YG2T-2.jpg?raw=true";
        Glide.with(this).load(url5)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig295_valve_image);
        String url6 = "https://github.com/max83100/123/blob/main/spare_parts/MIG295-395/%D0%BC%D0%B5%D1%85%D0%B0%D0%BD%D0%B8%D0%B7%D0%BC%20%D0%BF%D0%BE%D0%B4%D0%B0%D1%87%D0%B8%20Y22030014.jpg?raw=true";
        Glide.with(this).load(url6)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig295_mech_image);
        String url7 = "https://github.com/max83100/123/blob/main/spare_parts/%D0%9F%D0%B0%D0%BA%D0%B5%D1%82%D0%BD%D1%8B%D0%B5%20%D0%BF%D0%B5%D1%80%D0%B5%D0%BA%D0%BB%D1%8E%D1%87%D0%B0%D1%82%D0%B5%D0%BB%D0%B8/KDHC-32-3%203%D0%BF%D0%BE%D0%BB.jpg?raw=true";
        Glide.with(this).load(url7)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig295_switch_image);
        String url8 = "https://github.com/max83100/123/blob/main/spare_parts/%D0%9F%D0%B0%D0%BA%D0%B5%D1%82%D0%BD%D1%8B%D0%B5%20%D0%BF%D0%B5%D1%80%D0%B5%D0%BA%D0%BB%D1%8E%D1%87%D0%B0%D1%82%D0%B5%D0%BB%D0%B8/KDHC32-3%2010%20%D0%BF%D0%BE%D0%BB%D0%BE%D0%B6.jpg?raw=true";
        Glide.with(this).load(url8)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig295_switch2_image);
        String url9 = "https://github.com/max83100/123/blob/main/spare_parts/TRANSFORMATOR/XFYP-A1752.jpg?raw=true";
        Glide.with(this).load(url9)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig295_transform_image);


    }

    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), MIG_parts.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }
    public void onClick(View v) {
        if (v.getId() == R.id.mig295_inside) {
            Uri address = Uri.parse(
                    "https://drive.google.com/drive/folders/1t2QWZWwbgCv-QErniKytbtpFl4ztsqzh?usp=sharing");
            Intent openlink = new Intent(Intent.ACTION_VIEW, address);
            startActivity(openlink);
        }
    }
}