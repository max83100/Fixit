package com.example.fixit.parts.cut_models;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.fixit.R;
import com.example.fixit.parts.CUT_parts;

public class CUT_100_parts extends AppCompatActivity {
    ImageView cut100_diode_board_image;
    ImageView cut100_hf_board_image;
    ImageView cut100_invertor_board_image;
    ImageView cut100_tranzistor_board_image;
    ImageView cut100_control_board_image;
    Button inside;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cut100_parts);
        inside = findViewById(R.id.cut_100_inside);
        inside.setOnClickListener(this::onClick);

        cut100_diode_board_image = findViewById(R.id.cut100_diode_board_image);
        String url = "https://github.com/max83100/123/blob/main/spare_parts/CUT%20100/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%B2%D1%8B%D1%85%D0%BE%D0%B4%D0%BD%D1%8B%D1%85%20%D0%B4%D0%B8%D0%BE%D0%B4%D0%BE%D0%B2%205.496.904-I-1.jpg?raw=true";
        Glide.with(this).load(url)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(cut100_diode_board_image);

        cut100_hf_board_image = findViewById(R.id.cut100_hf_board_image);
        String url2 = "https://github.com/max83100/123/blob/main/spare_parts/CUT%20100/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%BE%D1%81%D1%86%D0%B8%D0%BB%D0%BB%D1%8F%D1%82%D0%BE%D1%80%D0%B0%205.496.472.jpg?raw=true";
        Glide.with(this).load(url2)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(cut100_hf_board_image);

        cut100_invertor_board_image = findViewById(R.id.cut100_invertor_board_image);
        String url3 = "https://github.com/max83100/123/blob/main/spare_parts/CUT%20100/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%BF%D0%B5%D1%80%D0%B2%D0%B8%D1%87%D0%BD%D0%BE%D0%B3%D0%BE%20%D0%BF%D1%80%D0%B5%D0%BE%D0%B1%D1%80%D0%B0%D0%B7%D0%BE%D0%B2%D0%B0%D1%82%D0%B5%D0%BB%D1%8F%205.496.685-B-1.jpg?raw=true";
        Glide.with(this).load(url3)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(cut100_invertor_board_image);

        cut100_tranzistor_board_image = findViewById(R.id.cut100_tranzistor_board_image);
        String url4 = "https://github.com/max83100/123/blob/main/spare_parts/CUT%20100/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D1%82%D1%80%D0%B0%D0%BD%D0%B7%D0%B8%D1%81%D1%82%D0%BE%D1%80%D0%BE%D0%B2%205.496.914-B.jpg?raw=true";
        Glide.with(this).load(url4)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(cut100_tranzistor_board_image);

        cut100_control_board_image = findViewById(R.id.cut100_control_board_image);
        String url5 = "https://github.com/max83100/123/blob/main/spare_parts/CUT%20100/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D1%83%D0%BF%D0%B0%D1%80%D0%B2%D0%BB%D0%B5%D0%BD%D0%B8%D1%8F%205.496.228-D.jpg?raw=true";
        Glide.with(this).load(url5)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(cut100_control_board_image);
    }
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), CUT_parts.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }

    public void onClick(View v) {
        if (v.getId() == R.id.cut_100_inside) {
            Uri address = Uri.parse(
                    "https://drive.google.com/drive/folders/1RfauCR_72fEsa-hUzpCgtWtjKzKqtUtH?usp=sharing");
            Intent openlink = new Intent(Intent.ACTION_VIEW, address);
            startActivity(openlink);
        }
    }
}