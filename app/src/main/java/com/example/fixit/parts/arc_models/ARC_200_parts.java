package com.example.fixit.parts.arc_models;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.fixit.R;
import com.example.fixit.parts.ARC_parts;

public class ARC_200_parts extends AppCompatActivity {
    ImageView arc200_invertor_board_image;
    ImageView arc200_diode_board_image;
    ImageView arc200_plastic_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arc200_parts);
        arc200_invertor_board_image = findViewById(R.id.arc200_invertor_board_image);
        arc200_diode_board_image = findViewById(R.id.arc200_diode_board_image);
        arc200_plastic_image = findViewById(R.id.arc200_plastic_image);
        downloadImage();
    }
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), ARC_parts.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }

    private void downloadImage() {
        String url = "https://github.com/max83100/123/blob/main/spare_parts/ARC220%20ROLWAL/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%B8%D0%BD%D0%B2%D0%B5%D1%80%D1%82%D0%BE%D1%80%D0%B0%20DX50087.jpg?raw=true";

        Glide.with(this).load(url)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(arc200_invertor_board_image);

        String url2 = "https://github.com/max83100/123/blob/main/spare_parts/ARC220%20ROLWAL/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%B2%D1%8B%D1%85%D0%BE%D0%B4%D0%BD%D1%8B%D1%85%20%D0%B4%D0%B8%D0%BE%D0%B4%D0%BE%D0%B2%20DX01054.jpg?raw=true";

        Glide.with(this).load(url2)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(arc200_diode_board_image);

        String url3 = "https://github.com/max83100/123/blob/main/spare_parts/ARC220%20ROLWAL/%D0%BA%D0%BE%D0%BC%D0%BF%D0%BB%D0%B5%D0%BA%D1%82%20%D0%BF%D0%BB%D0%B0%D1%81%D1%82%D0%B8%D0%BA%D0%BE%D0%B2%D1%8B%D1%85%20%D0%BF%D0%B0%D0%BD%D0%B5%D0%BB%D0%B5%D0%B9.jpg?raw=true";

        Glide.with(this).load(url3)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(arc200_plastic_image);
    }
}