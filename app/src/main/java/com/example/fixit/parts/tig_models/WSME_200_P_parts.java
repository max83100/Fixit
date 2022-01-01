package com.example.fixit.parts.tig_models;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.fixit.R;
import com.example.fixit.parts.TIG_parts;

public class WSME_200_P_parts extends AppCompatActivity {
    ImageView wsme200p_dross_image;
    ImageView wsme200p_front_board_image;
    ImageView wsme200p_buttons_board_image;
    ImageView wsme200p_control_board_image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wsme200_pparts);

        wsme200p_dross_image = findViewById(R.id.wsme200p_dross_image);
        String url = "https://github.com/max83100/123/blob/main/spare_parts/WSME%20200P/%D0%B4%D1%80%D0%BE%D1%81%D1%81%D0%B5%D0%BB%D1%8C%206.190.100-A.jpg?raw=true";
        Glide.with(this).load(url)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(wsme200p_dross_image);

        wsme200p_front_board_image = findViewById(R.id.wsme200p_front_board_image);
        String url3 = "https://github.com/max83100/123/blob/main/spare_parts/WSME%20200P/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%BB%D0%B8%D1%86%D0%B5%D0%B2%D0%B0%D1%8F%20%205.496.318-A.jpg?raw=true";
        Glide.with(this).load(url3)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(wsme200p_front_board_image);

        wsme200p_buttons_board_image = findViewById(R.id.wsme200p_buttons_board_image);
        String url4 = "https://github.com/max83100/123/blob/main/spare_parts/WSME%20200P/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D1%80%D0%B0%D0%B7%D0%B2%D1%8F%D0%B7%D0%BA%D0%B8%20%D0%BA%D0%BD%D0%BE%D0%BF%D0%BA%D0%B8%205.496.821-D.jpg?raw=true";
        Glide.with(this).load(url4)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(wsme200p_buttons_board_image);

        wsme200p_control_board_image = findViewById(R.id.wsme200p_control_board_image);
        String url5 = "https://github.com/max83100/123/blob/main/spare_parts/WSME%20200P/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D1%83%D0%BF%D1%80%D0%B0%D0%B2%D0%BB%D0%B5%D0%BD%D0%B8%D1%8F%205.496.824-B.jpg?raw=true";
        Glide.with(this).load(url5)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(wsme200p_control_board_image);


    }
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), TIG_parts.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }
}