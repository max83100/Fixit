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

public class MIG_200C_parts extends AppCompatActivity implements View.OnClickListener {

    ImageView mig200c_dross_image;
    ImageView mig200p_front_board_image;
    ImageView mig200p_front_board_image2;
    ImageView mig200p_control_board_image;
    ImageView mig200с_control_board_image;
    ImageView mig200с_encoder_board_image;
    ImageView mig200с_plastic_back_image;
    ImageView mig200с_plastic_front_image;
    ImageView mig200с_invertor_board_image;
    ImageView mig200с_front_board_image;
    Button inside;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mig200_cparts);
        inside = findViewById(R.id.mig_200c_inside);
        inside.setOnClickListener(this);
        mig200c_dross_image = findViewById(R.id.mig200c_dross_image);
        mig200p_front_board_image = findViewById(R.id.mig200p_front_board_image);
        mig200p_front_board_image2 = findViewById(R.id.mig200p_front_board_image2);
        mig200p_control_board_image = findViewById(R.id.mig200p_control_board_image);
        mig200с_control_board_image = findViewById(R.id.mig200с_control_board_image);
        mig200с_encoder_board_image = findViewById(R.id.mig200с_encoder_board_image);
        mig200с_plastic_back_image = findViewById(R.id.mig200с_plastic_back_image);
        mig200с_plastic_front_image = findViewById(R.id.mig200с_plastic_front_image);
        mig200с_invertor_board_image = findViewById(R.id.mig200с_invertor_board_image);
        mig200с_front_board_image = findViewById(R.id.mig200с_front_board_image);

        downloadImage();
    }

    private void downloadImage() {
        String url3 = "https://github.com/max83100/123/blob/main/spare_parts/MIG%20200P/%D0%B4%D1%80%D0%BE%D1%81%D1%81%D0%B5%D0%BB%D1%8C%206.271.211.jpg?raw=true";
        Glide.with(this).load(url3)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig200c_dross_image);

        String url4 = "https://github.com/max83100/123/blob/main/spare_parts/MIG%20200P/%D0%BC%D0%BE%D1%80%D0%B4%D0%B0%20%D0%B2%20%D1%81%D0%B1%D0%BE%D1%80%D0%B5%205.496.445-B.jpg?raw=true";
        Glide.with(this).load(url4)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig200p_front_board_image);

        String url5 = "https://github.com/max83100/123/blob/main/spare_parts/MIG%20200P/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%BB%D0%B8%D1%86%D0%B5%D0%B2%D0%B0%D1%8F%205.496.445-B-1.jpg?raw=true";
        Glide.with(this).load(url5)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig200p_front_board_image2);

        String url6 = "https://github.com/max83100/123/blob/main/spare_parts/MIG%20200P/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D1%83%D0%BF%D1%80%D0%B0%D0%B2%D0%BB%D0%B5%D0%BD%D0%B8%D1%8F%205.496.292-E.jpg?raw=true";
        Glide.with(this).load(url6)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig200p_control_board_image);

        String url7 = "https://github.com/max83100/123/blob/main/spare_parts/MIG%20200C/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D1%83%D0%BF%D1%80%D0%B0%D0%B2%D0%BB%D0%B5%D0%BD%D0%B8%D1%8F%205.496.771-G-4.jpg?raw=true";
        Glide.with(this).load(url7)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig200с_control_board_image);

        String url8 = "https://github.com/max83100/123/blob/main/spare_parts/MIG%20200C/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D1%8D%D0%BD%D0%BA%D0%BE%D0%B4%D0%B5%D1%80%D0%BE%D0%B2%205.496.328-E-2.jpg?raw=true";
        Glide.with(this).load(url8)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig200с_encoder_board_image);

        String url9 = "https://github.com/max83100/123/blob/main/spare_parts/MIG%20200C/%D0%B7%D0%B0%D0%B4%D0%BD%D1%8F%D1%8F%20%D0%BF%D0%BB%D0%B0%D1%81%D1%82%D0%B8%D0%BA%D0%BE%D0%B2%D0%B0%D1%8F%20%D0%BF%D0%B0%D0%BD%D0%B5%D0%BB%D1%8C%208.068.925.jpg?raw=true";
        Glide.with(this).load(url9)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig200с_plastic_back_image);

        String url10 = "https://github.com/max83100/123/blob/main/spare_parts/MIG%20200C/%D0%BF%D0%B5%D1%80%D0%B5%D0%B4%D0%BD%D1%8F%D1%8F%20%D0%BF%D0%BB%D0%B0%D1%81%D1%82%D0%B8%D0%BA%D0%BE%D0%B2%D0%B0%D1%8F%20%D0%BF%D0%B0%D0%BD%D0%B5%D0%BB%D1%8C%208.069.92.jpg?raw=true";
        Glide.with(this).load(url10)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig200с_plastic_front_image);

        String url11 = "https://github.com/max83100/123/blob/main/spare_parts/MIG%20200C/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%B8%D0%BD%D0%B2%D0%B5%D1%80%D1%82%D0%BE%D1%80%D0%B0%208.066.249-B.jpg?raw=true";
        Glide.with(this).load(url11)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig200с_invertor_board_image);

        String url12 = "https://github.com/max83100/123/blob/main/spare_parts/MIG%20200C/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%B8%D0%BD%D0%B4%D0%B8%D0%BA%D0%B0%D1%86%D0%B8%D0%B8%205.496.328.jpg?raw=true";
        Glide.with(this).load(url12)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig200с_front_board_image);



    }

    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), MIG_parts.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }
    public void onClick(View v) {
        if (v.getId() == R.id.mig_200c_inside) {
            Uri address = Uri.parse(
                    "https://drive.google.com/drive/folders/1Tu8-wHh_vsrruxCSJ-PYQ_EX0jBkZkWI?usp=sharing");
            Intent openlink = new Intent(Intent.ACTION_VIEW, address);
            startActivity(openlink);
        }
    }
}