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

public class MMA_200_TEC_Rolwal extends AppCompatActivity {
    ImageView mma200tec_invertor_board_image;
    ImageView mma200tec_front_board_image;
    Button inside;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mma200_tec_rolwal);
        inside = findViewById(R.id.mma200tec_inside);
        inside.setOnClickListener(this::onClick);
        mma200tec_invertor_board_image = findViewById(R.id.mma200tec_invertor_board_image);
        mma200tec_front_board_image = findViewById(R.id.mma200tec_front_board_image);
        downloadImage();
    }

    private void onClick(View v) {
        if (v.getId() == R.id.arc160_inside) {
            Uri address = Uri.parse(
                    "https://drive.google.com/drive/folders/1LGbm2zZTga1AK8sO2XecQnGPmCrqDE-B?usp=sharing");
            Intent openlink = new Intent(Intent.ACTION_VIEW, address);
            startActivity(openlink);
        }
    }

    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), ARC_parts.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }

    private void downloadImage() {
        String url = "https://github.com/max83100/123/blob/main/spare_parts/MMA%20200%20TEC/%D1%81%D0%B8%D0%BB%D0%B0%20DX%2010212.jpg?raw=true";
        Glide.with(this).load(url)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mma200tec_invertor_board_image);
        String url2 = "https://github.com/max83100/123/blob/main/spare_parts/MMA%20200%20TEC/%D0%BB%D0%B8%D1%86%D0%BE%20DP%2003665.jpg?raw=true";
        Glide.with(this).load(url2)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mma200tec_front_board_image);
    }
}