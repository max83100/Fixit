package com.example.fixit.parts.tig_models;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.fixit.R;
import com.example.fixit.parts.TIG_parts;

public class WSME_200E_parts extends AppCompatActivity {
    ImageView wsme200e_invertor1_board_image;
    ImageView wsme200e_invertor2_board_image;
    ImageView wsme200e_front_board_image;
    ImageView wsme200e_control_board_image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wsme200_eparts);

        wsme200e_invertor1_board_image = findViewById(R.id.wsme200e_invertor1_board_image);
        String url3 = "https://github.com/max83100/123/blob/main/spare_parts/WSME%20200E/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%BF%D0%B5%D1%80%D0%B2%D0%B8%D1%87%D0%BD%D0%BE%D0%B3%D0%BE%20%D0%BF%D1%80%D0%B5%D0%BE%D0%B1%D1%80%D0%B0%D0%B7%D0%BE%D0%B2%D0%B0%D1%82%D0%B5%D0%BB%D1%8F%20W.%20496RM.328-F.jpg?raw=true";
        Glide.with(this).load(url3)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(wsme200e_invertor1_board_image);

        wsme200e_invertor2_board_image = findViewById(R.id.wsme200e_invertor2_board_image);
        String url4 = "https://github.com/max83100/123/blob/main/spare_parts/WSME%20200E/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%B2%D1%82%D0%BE%D1%80%D0%B8%D1%87%D0%BD%D0%BE%D0%B3%D0%BE%20%D0%BF%D1%80%D0%B5%D0%BE%D0%B1%D1%80%D0%B0%D0%B7%D0%BE%D0%B2%D0%B0%D1%82%D0%B5%D0%BB%D1%8F%20W.%20496RM.329-B.jpg?raw=true";
        Glide.with(this).load(url4)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(wsme200e_invertor2_board_image);

        wsme200e_front_board_image = findViewById(R.id.wsme200e_front_board_image);
        String url5 = "https://github.com/max83100/123/blob/main/spare_parts/WSME%20200E/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%BB%D0%B8%D1%86%D0%B5%D0%B2%D0%B0%D1%8F%20496RM.339-A.jpg?raw=true";
        Glide.with(this).load(url5)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(wsme200e_front_board_image);


        wsme200e_control_board_image = findViewById(R.id.wsme200e_control_board_image);
        String url7 = "https://github.com/max83100/123/blob/main/spare_parts/WSME%20200E/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D1%83%D0%BF%D1%80%D0%B0%D0%B2%D0%BB%D0%B5%D0%BD%D0%B8%D1%8F%20W.%20496RM.402-J.jpg?raw=true";
        Glide.with(this).load(url7)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(wsme200e_control_board_image);
    }
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), TIG_parts.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }
}