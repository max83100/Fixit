package com.example.fixit.parts.cut_models;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.fixit.R;
import com.example.fixit.parts.CUT_parts;

public class CUT_40_com_parts extends AppCompatActivity {
    ImageView cut40com_drossel_board_image;
    ImageView cut40com_drossel_board_image2;
    ImageView cut40com_invertor_board_image;
    ImageView cut40com_front_board_image;
    ImageView cut40com_comp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cut40_com_parts);
        cut40com_drossel_board_image = findViewById(R.id.cut40com_drossel_board_image);
        cut40com_drossel_board_image2 = findViewById(R.id.cut40com_drossel_board_image2);
        cut40com_invertor_board_image = findViewById(R.id.cut40com_invertor_board_image);
        cut40com_front_board_image = findViewById(R.id.cut40com_front_board_image);
        cut40com_comp = findViewById(R.id.cut40com_comp_image);

        downloadImage();
    }

    private void downloadImage() {

        String url = "https://github.com/max83100/123/blob/main/spare_parts/CUT%2040/%D0%B4%D1%80%D0%BE%D1%81%D1%81%D0%B5%D0%BB%D1%8C%20L.%20185RM.608-B.jpg?raw=true";
        Glide.with(this).load(url)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(cut40com_drossel_board_image);


        String url2 = "https://github.com/max83100/123/blob/main/spare_parts/CUT%2040/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%B4%D1%80%D0%BE%D1%81%D1%81%D0%B5%D0%BB%D1%8F%205.496RM.080-C.jpg?raw=true";
        Glide.with(this).load(url2)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(cut40com_drossel_board_image2);


        String url3 = "https://github.com/max83100/123/blob/main/spare_parts/CUT%2040/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D1%81%D0%B8%D0%BB%D0%BE%D0%B2%D0%B0%D1%8F%20S.%20200RM.659.jpg?raw=true";
        Glide.with(this).load(url3)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(cut40com_invertor_board_image);


        String url4 = "https://github.com/max83100/123/blob/main/spare_parts/CUT%2040COM/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%BB%D0%B8%D1%86%D0%B5%D0%B2%D0%B0%D1%8F%20W.%20496RM.497-A.jpg?raw=true";
        Glide.with(this).load(url4)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(cut40com_front_board_image);


        String url5 = "https://github.com/max83100/123/blob/main/spare_parts/CUT%2040COM/%D0%BA%D0%BE%D0%BC%D0%BF%D1%80%D0%B5%D1%81%D1%81%D0%BE%D1%80%207.721.060.jpg?raw=true";
        Glide.with(this).load(url5)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(cut40com_comp);
    }

    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), CUT_parts.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }
}