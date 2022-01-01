package com.example.fixit.parts.cut_models;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.fixit.R;
import com.example.fixit.parts.CUT_parts;

public class CUT_60_parts extends AppCompatActivity {
    ImageView cut60_power_board_image;
    ImageView cut60_front_board_image;
    ImageView cut60_invertor_board_image;
    ImageView cut60_control_board_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cut60_parts);

        cut60_power_board_image = findViewById(R.id.cut60_power_board_image);
        String url = "https://github.com/max83100/123/blob/main/spare_parts/CUT%2060/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%B1%D0%BB%D0%BE%D0%BA%D0%B0%20%D0%BF%D0%B8%D1%82%D0%B0%D0%BD%D0%B8%D1%8F.jpg?raw=true";
        Glide.with(this).load(url)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(cut60_power_board_image);

        cut60_front_board_image = findViewById(R.id.cut60_front_board_image);
        String url2 = "https://github.com/max83100/123/blob/main/spare_parts/CUT%2060/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%BB%D0%B8%D1%86%D0%B5%D0%B2%D0%B0%D1%8F%20W.496RM.230.jpg?raw=true";
        Glide.with(this).load(url2)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(cut60_front_board_image);

        cut60_invertor_board_image = findViewById(R.id.cut60_invertor_board_image);
        String url3 = "https://github.com/max83100/123/blob/main/spare_parts/CUT%2060/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D1%81%D0%B8%D0%BB%D0%BE%D0%B2%D0%B0%D1%8F%20W.%20422RM.668.jpg?raw=true";
        Glide.with(this).load(url3)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(cut60_invertor_board_image);

        cut60_control_board_image = findViewById(R.id.cut60_control_board_image);
        String url4 = "https://github.com/max83100/123/blob/main/spare_parts/CUT%2060/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D1%83%D0%BF%D1%80%D0%B0%D0%B2%D0%BB%D0%B5%D0%BD%D0%B8%D1%8F%20W.%20496.124-B-3.jpg?raw=true";
        Glide.with(this).load(url4)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(cut60_control_board_image);
    }
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), CUT_parts.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }
}