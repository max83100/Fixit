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

public class MIG_200_parts extends AppCompatActivity {
    ImageView mig200_power_board_image;
    ImageView mig200_front_board_image;
    ImageView mig200_invertor_board_image;
    ImageView mig200_control_board_image;
    ImageView mig200_brake_mech_image;
    Button inside;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mig200_parts);
        inside = findViewById(R.id.mig_200_inside);
        inside.setOnClickListener(this::onClick);

        mig200_power_board_image = findViewById(R.id.mig200_power_board_image);
        String url = "https://github.com/max83100/123/blob/main/spare_parts/MIG%20200%20Hanker/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%B1%D0%BB%D0%BE%D0%BA%D0%B0%20%D0%BF%D0%B8%D1%82%D0%B0%D0%BD%D0%B8%D1%8F%20W.%20496RM.455-B.jpg?raw=true";
        Glide.with(this).load(url)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig200_power_board_image);

        mig200_front_board_image = findViewById(R.id.mig200_front_board_image);
        String url2 = "https://github.com/max83100/123/blob/main/spare_parts/MIG%20200%20Hanker/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%BB%D0%B8%D1%86%D0%B5%D0%B2%D0%B0%D1%8F%20W.%20496RM.704.jpg?raw=true";
        Glide.with(this).load(url2)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig200_front_board_image);

        mig200_invertor_board_image = findViewById(R.id.mig200_invertor_board_image);
        String url3 = "https://github.com/max83100/123/blob/main/spare_parts/MIG%20200%20Hanker/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D1%81%D0%B8%D0%BB%D0%BE%D0%B2%D0%B0%D1%8F%20W.%20496RM.616-E-3.jpg?raw=true";
        Glide.with(this).load(url3)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig200_invertor_board_image);

        mig200_control_board_image = findViewById(R.id.mig200_control_board_image);
        String url4 = "https://github.com/max83100/123/blob/main/spare_parts/MIG%20200/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D1%83%D0%BF%D1%80%D0%B0%D0%B2%D0%BB%D0%B5%D0%BD%D0%B8%D1%8F%209.066.996-H.jpg?raw=true";
        Glide.with(this).load(url4)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig200_control_board_image);

        mig200_brake_mech_image = findViewById(R.id.mig200_brake_mech_image);
        String url5 = "https://github.com/max83100/123/blob/main/spare_parts/MIG%20200/%D1%82%D0%BE%D1%80%D0%BC%D0%BE%D0%B7%D0%BD%D0%BE%D0%B9%20%D0%BC%D0%B5%D1%85%D0%B0%D0%BD%D0%B8%D0%B7%D0%BC.jpg?raw=true";
        Glide.with(this).load(url5)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig200_brake_mech_image);


    }
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), MIG_parts.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }

    public void onClick(View v) {
        if (v.getId() == R.id.mig_200_inside) {
            Uri address = Uri.parse(
                    "https://drive.google.com/drive/folders/1Xz152xJuc1KgT9IomgfANfPOn1WaUYa6?usp=sharing");
            Intent openlink = new Intent(Intent.ACTION_VIEW, address);
            startActivity(openlink);
        }
    }
}