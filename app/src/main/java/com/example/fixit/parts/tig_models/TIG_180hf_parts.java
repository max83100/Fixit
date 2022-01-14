package com.example.fixit.parts.tig_models;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.fixit.R;
import com.example.fixit.parts.TIG_parts;

public class TIG_180hf_parts extends AppCompatActivity {
    ImageView tig180_power_board_image;
    ImageView tig180_diode_board_image;
    ImageView tig180_invertor_board_image;
    ImageView tig180_hf_board_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tig180hf_parts);
        tig180_power_board_image = findViewById(R.id.tig180_power_board_image);
        tig180_hf_board_image = findViewById(R.id.tig180_hf_board_image);
        tig180_diode_board_image = findViewById(R.id.tig180_diode_board_image);
        tig180_invertor_board_image = findViewById(R.id.tig180_invertor_board_image);
        downloadImage();
    }

    private void downloadImage() {
        String url = "https://github.com/max83100/123/blob/main/spare_parts/TIG180HF%20ENERGY/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%B1%D0%BB%D0%BE%D0%BA%D0%B0%20%D0%BF%D0%B8%D1%82%D0%B0%D0%BD%D0%B8%D1%8F%20PN-PCB-Z22-A0.jpg?raw=true";
        Glide.with(this).load(url)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(tig180_power_board_image);
        String url2 = "https://github.com/max83100/123/blob/main/spare_parts/TIG180HF%20ENERGY/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%B2%D1%8B%D1%85%D0%BE%D0%B4%D0%BD%D1%8B%D1%85%20%D0%B4%D0%B8%D0%BE%D0%B4%D0%BE%D0%B2%20PN-PCB-D26-B0.jpg?raw=true";
        Glide.with(this).load(url2)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(tig180_diode_board_image);
        String url3 = "https://github.com/max83100/123/blob/main/spare_parts/TIG180HF%20ENERGY/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%B8%D0%BD%D0%B2%D0%B5%D1%80%D1%82%D0%BE%D1%80%D0%B0%20PN-PCB-M26-A1.jpg?raw=true";
        Glide.with(this).load(url3)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(tig180_invertor_board_image);
        String url4 = "https://github.com/max83100/123/blob/main/spare_parts/TIG180HF%20ENERGY/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%BE%D1%81%D1%86%D0%B8%D0%BB%D0%BB%D1%8F%D1%82%D0%BE%D1%80%D0%B0%20PN-PCB-G01-A1.jpg?raw=true";
        Glide.with(this).load(url4)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(tig180_hf_board_image);
    }
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), TIG_parts.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }
}