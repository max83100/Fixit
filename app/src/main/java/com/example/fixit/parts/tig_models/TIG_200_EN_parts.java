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

public class TIG_200_EN_parts extends AppCompatActivity {
    ImageView tig200_handle_board_image;
    ImageView tig200_stick_image;
    ImageView tig200_secound_invertor_image;
    ImageView tig200_plastic_image;
    ImageView tig200_first_invertor_image;
    ImageView tig200_driver_first_invertor_image;
    ImageView tig200_front_board_image;
    ImageView tig200_hf_board_image;
    ImageView tig200_control_board_image;
    Button inside;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tig200_en_parts);
        inside = findViewById(R.id.tig_200_inside);
        inside.setOnClickListener(this::onClick);
        tig200_handle_board_image = findViewById(R.id.tig200_handle_board_image);
        tig200_plastic_image = findViewById(R.id.tig200_plastic_image);
        tig200_stick_image = findViewById(R.id.tig200_stick_image);
        tig200_secound_invertor_image = findViewById(R.id.tig200_secound_invertor_image);
        tig200_first_invertor_image = findViewById(R.id.tig200_first_invertor_image);
        tig200_driver_first_invertor_image = findViewById(R.id.tig200_driver_first_invertor_image);
        tig200_front_board_image = findViewById(R.id.tig200_front_board_image);
        tig200_hf_board_image = findViewById(R.id.tig200_hf_board_image);
        tig200_control_board_image = findViewById(R.id.tig200_control_board_image);


        downloadImage();


    }

    private void downloadImage() {
        String url = "https://github.com/max83100/123/blob/main/spare_parts/TIG%20200%20Energy/%D1%80%D1%83%D1%87%D0%BA%D0%B0.jpg?raw=true";
        Glide.with(this).load(url)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(tig200_handle_board_image);

        String url2 = "https://github.com/max83100/123/blob/main/spare_parts/TIG%20200%20Energy/%D0%BA%D0%BE%D0%BC%D0%BF%D0%BB%D0%B5%D0%BA%D1%82%20%D0%BF%D0%BB%D0%B0%D1%81%D1%82%D0%B8%D0%BA%D0%BE%D0%B2%D1%8B%D1%85%20%D0%BF%D0%B0%D0%BD%D0%B5%D0%BB%D0%B5%D0%B9.jpg?raw=true";
        Glide.with(this).load(url2)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(tig200_plastic_image);

        String url3 = "https://github.com/max83100/123/blob/main/spare_parts/TIG%20200%20Energy/%D0%BD%D0%B0%D0%BA%D0%BB%D0%B5%D0%B9%D0%BA%D0%B0%20%D0%BD%D0%B0%20%D0%BF%D0%B0%D0%BD%D0%B5%D0%BB%D1%8C.jpg?raw=true";
        Glide.with(this).load(url3)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(tig200_stick_image);

        String url4 = "https://github.com/max83100/123/blob/main/spare_parts/TIG%20200%20Energy/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%B2%D1%82%D0%BE%D1%80%D0%B8%D1%87%D0%BD%D0%BE%D0%B3%D0%BE%20%D0%B8%D0%BD%D0%B2%D0%B5%D1%80%D1%82%D0%BE%D1%80%D0%B0%20DX50025.jpg?raw=true";
        Glide.with(this).load(url4)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(tig200_secound_invertor_image);

        String url5 = "https://github.com/max83100/123/blob/main/spare_parts/TIG%20200%20Energy/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%BF%D0%B5%D1%80%D0%B2%D0%B8%D1%87%D0%BD%D0%BE%D0%B3%D0%BE%20%D0%B8%D0%BD%D0%B2%D0%B5%D1%80%D1%82%D0%BE%D1%80%D0%B0%20DX50026.jpg?raw=true";
        Glide.with(this).load(url5)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(tig200_first_invertor_image);

        String url6 = "https://github.com/max83100/123/blob/main/spare_parts/TIG%20200%20Energy/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%B4%D1%80%D0%B0%D0%B9%D0%B2%D0%B5%D1%80%D0%B0%20%D0%BF%D0%B5%D1%80%D0%B2%D0%B8%D1%87%D0%BD%D0%BE%D0%B3%D0%BE%20%D0%B8%D0%BD%D0%B2%D0%B5%D1%80%D1%82%D0%BE%D1%80%D0%B0%20DP03210.jpg?raw=true";
        Glide.with(this).load(url6)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(tig200_driver_first_invertor_image);

        String url7 = "https://github.com/max83100/123/blob/main/spare_parts/TIG%20200%20Energy/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%B8%D0%BD%D0%B4%D0%B8%D0%BA%D0%B0%D1%86%D0%B8%D0%B8%20DP03208.jpg?raw=true";
        Glide.with(this).load(url7)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(tig200_front_board_image);

        String url8 = "https://github.com/max83100/123/blob/main/spare_parts/TIG%20200%20Energy/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%BE%D1%81%D1%86%D0%B8%D0%BB%D0%BB%D1%8F%D1%82%D0%BE%D1%80%D0%B0%20DX01580.jpg?raw=true";
        Glide.with(this).load(url6)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(tig200_hf_board_image);

        String url9 = "https://github.com/max83100/123/blob/main/spare_parts/TIG%20200%20Energy/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D1%83%D0%BF%D1%80%D0%B0%D0%B2%D0%BB%D0%B5%D0%BD%D0%B8%D1%8F%20DX00011.jpg?raw=true";
        Glide.with(this).load(url7)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(tig200_control_board_image);


    }

    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), TIG_parts.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }

    public void onClick(View v) {
        if (v.getId() == R.id.tig_200_inside) {
            Uri address = Uri.parse(
                    "https://drive.google.com/drive/folders/1UQYLRKoBFHGmBauMijcraAwKdjDSYMit?usp=sharing");
            Intent openlink = new Intent(Intent.ACTION_VIEW, address);
            startActivity(openlink);
        }
    }
}