package com.example.fixit.parts.arc_models;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.fixit.R;
import com.example.fixit.parts.ARC_parts;

public class ARC_160_ROL_parts extends AppCompatActivity {
    ImageView arc160_invertor_board_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arc160_rol_parts);
        arc160_invertor_board_image = findViewById(R.id.arc160_invertor_board_image);
        downloadImage();
    }
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), ARC_parts.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }

    private void downloadImage() {
        String url = "https://github.com/max83100/123/blob/main/spare_parts/ARC160%20ROLWAL/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%B8%D0%BD%D0%B2%D0%B5%D1%80%D1%82%D0%BE%D1%80%D0%B0%20DX10032.jpg?raw=true";

        Glide.with(this).load(url)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(arc160_invertor_board_image);
    }
}