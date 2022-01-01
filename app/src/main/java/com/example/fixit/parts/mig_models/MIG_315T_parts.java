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

public class MIG_315T_parts extends AppCompatActivity {
    ImageView mig250t_power_board_image;
    ImageView mig250t_europlug_image;
    ImageView mig250t_invertor_board_image;
    ImageView mig315t_power_board_image;
    ImageView mig315t_front_board_image;
    ImageView mig315t_diode_board_image;
    ImageView mig315t_invertor_board_image;
    ImageView mig315t_trans_image;
    Button inside;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mig315_tparts);
        inside = findViewById(R.id.mig_315t_inside);
        inside.setOnClickListener(this::onClick);

        mig250t_power_board_image = findViewById(R.id.mig250t_power_board_image);
        String url = "https://github.com/max83100/123/blob/main/spare_parts/MIG%20250T/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%B1%D0%BB%D0%BE%D0%BA%D0%B0%20%D0%BF%D0%B8%D1%82%D0%B0%D0%BD%D0%B8%D1%8F%20W.%20496RM.344-C.jpg?raw=true";
        Glide.with(this).load(url)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig250t_power_board_image);

        mig250t_europlug_image = findViewById(R.id.mig250t_europlug_image);
        String url2 = "https://github.com/max83100/123/blob/main/spare_parts/MIG%20250T/%D0%B5%D0%B2%D1%80%D0%BE%D1%80%D0%B0%D0%B7%D1%8A%D1%91%D0%BC.jpg?raw=true";
        Glide.with(this).load(url2)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig250t_europlug_image);

        mig250t_invertor_board_image = findViewById(R.id.mig250t_invertor_board_image);
        String url3 = "https://github.com/max83100/123/blob/main/spare_parts/MIG%20250T/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D1%81%D0%B8%D0%BB%D0%BE%D0%B2%D0%B0%D1%8F%20W.%20496RM.210-DE.jpg?raw=true";
        Glide.with(this).load(url3)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig250t_invertor_board_image);

        mig315t_power_board_image = findViewById(R.id.mig315t_power_board_image);
        String url4 = "https://github.com/max83100/123/blob/main/spare_parts/MIG%20315T/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%B1%D0%BB%D0%BE%D0%BA%D0%B0%20%D0%BF%D0%B8%D1%82%D0%B0%D0%BD%D0%B8%D1%8F%205.496RM.110-A.jpg?raw=true";
        Glide.with(this).load(url4)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig315t_power_board_image);

        mig315t_front_board_image = findViewById(R.id.mig315t_front_board_image);
        String url5 = "https://github.com/max83100/123/blob/main/spare_parts/MIG%20315T/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%BB%D0%B8%D1%86%D0%B5%D0%B2%D0%B0%D1%8F%205.496RM.058-D-3.jpg?raw=true";
        Glide.with(this).load(url5)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig315t_front_board_image);

        mig315t_diode_board_image = findViewById(R.id.mig315t_diode_board_image);
        String url6 = "https://github.com/max83100/123/blob/main/spare_parts/MIG%20315T/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D1%81%20%D0%B4%D0%B8%D0%BE%D0%B4%D0%B0%D0%BC%D0%B8%20W.%20423RM.210-DE.jpg?raw=true";
        Glide.with(this).load(url6)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig315t_diode_board_image);

        mig315t_invertor_board_image = findViewById(R.id.mig315t_invertor_board_image);
        String url7 = "https://github.com/max83100/123/blob/main/spare_parts/MIG%20315T/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D1%81%D0%B8%D0%BB%D0%BE%D0%B2%D0%B0%D1%8F%20W.%20422RM.103.jpg?raw=true";
        Glide.with(this).load(url7)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig315t_invertor_board_image);

        mig315t_trans_image = findViewById(R.id.mig315t_trans_image);
        String url8 = "https://github.com/max83100/123/blob/main/spare_parts/MIG%20315T/%D1%82%D1%80%D0%B0%D0%BD%D1%81%D1%84%D0%BE%D1%80%D0%BC%D0%B0%D1%82%D0%BE%D1%80%206.185RM.208.jpg?raw=true";
        Glide.with(this).load(url8)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig315t_trans_image);
    }
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), MIG_parts.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }
    public void onClick(View v) {
        if (v.getId() == R.id.mig_315t_inside) {
            Uri address = Uri.parse(
                    "https://drive.google.com/drive/folders/1MIw-uQepZtT5k96M9TvNDtN-KWAOUdZr?usp=sharing");
            Intent openlink = new Intent(Intent.ACTION_VIEW, address);
            startActivity(openlink);
        }
    }
}