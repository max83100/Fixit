package com.example.fixit.parts.arc_models;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.fixit.R;
import com.example.fixit.parts.ARC_parts;

public class ARC_400_parts extends AppCompatActivity {
    ImageView arc400_power_board_image;
    ImageView arc400_invertor_board_image;
    ImageView arc400_transform_image;
    Button inside;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arc400_parts);
        arc400_power_board_image = findViewById(R.id.arc400_power_board_image);
        arc400_invertor_board_image = findViewById(R.id.arc400_invertor_board_image);
        arc400_transform_image = findViewById(R.id.arc400_transform_image);
        inside = findViewById(R.id.arc400_inside);
        inside.setOnClickListener(this::onClick);

        downloadImage();
    }

    private void downloadImage() {
        String url = "https://github.com/max83100/123/blob/main/spare_parts/ARC%20400/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%B1%D0%BB%D0%BE%D0%BA%20%D0%BF%D0%B8%D1%82%D0%B0%D0%BD%D0%B8%D1%8F%20W.%20496RM.279.jpg?raw=true";
        Glide.with(this).load(url)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(arc400_power_board_image);
        String url2 = "https://github.com/max83100/123/blob/main/spare_parts/ARC%20400/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D1%81%D0%B8%D0%BB%D0%BE%D0%B2%D0%B0%D1%8F%205.497RM.210.jpg?raw=true";
        Glide.with(this).load(url2)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(arc400_invertor_board_image);
        String url3 = "https://github.com/max83100/123/blob/main/spare_parts/TRANSFORMATOR/YFYP-A1610.jpg?raw=true";
        Glide.with(this).load(url3)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(arc400_transform_image);
    }

    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), ARC_parts.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }

    private void onClick(View v) {
        if (v.getId() == R.id.arc400_inside) {
            Uri address = Uri.parse(
                    "https://drive.google.com/drive/folders/16j-VfyRTii3zvu9YtKJDb8xIrygEsafJ?usp=sharing");
            Intent openlink = new Intent(Intent.ACTION_VIEW, address);
            startActivity(openlink);
        }
    }
}