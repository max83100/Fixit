package com.example.fixit.parts.cut_models;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.fixit.R;
import com.example.fixit.parts.CUT_parts;
import com.example.fixit.parts.MIG_parts;

public class CUT_40_parts extends AppCompatActivity {
    ImageView cut40_drossel_board_image;
    ImageView cut40_drossel_board_image2;
    ImageView cut40_invertor_board_image;
    ImageView cut40_front_board_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cut40_parts);

        cut40_drossel_board_image = findViewById(R.id.cut40_drossel_board_image);
        String url = "https://github.com/max83100/123/blob/main/spare_parts/CUT%2040/%D0%B4%D1%80%D0%BE%D1%81%D1%81%D0%B5%D0%BB%D1%8C%20L.%20185RM.608-B.jpg?raw=true";
        Glide.with(this).load(url)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(cut40_drossel_board_image);

        cut40_drossel_board_image2 = findViewById(R.id.cut40_drossel_board_image2);
        String url2 = "https://github.com/max83100/123/blob/main/spare_parts/CUT%2040/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%B4%D1%80%D0%BE%D1%81%D1%81%D0%B5%D0%BB%D1%8F%205.496RM.080-C.jpg?raw=true";
        Glide.with(this).load(url2)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(cut40_drossel_board_image2);

        cut40_invertor_board_image = findViewById(R.id.cut40_invertor_board_image);
        String url3 = "https://github.com/max83100/123/blob/main/spare_parts/CUT%2040/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D1%81%D0%B8%D0%BB%D0%BE%D0%B2%D0%B0%D1%8F%20S.%20200RM.659.jpg?raw=true";
        Glide.with(this).load(url3)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(cut40_invertor_board_image);

        cut40_front_board_image = findViewById(R.id.cut40_front_board_image);
        String url4 = "https://github.com/max83100/123/blob/main/spare_parts/CUT%2040COM/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%BB%D0%B8%D1%86%D0%B5%D0%B2%D0%B0%D1%8F%20W.%20496RM.497-A.jpg?raw=true";
        Glide.with(this).load(url4)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(cut40_front_board_image);
    }
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), CUT_parts.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }
}