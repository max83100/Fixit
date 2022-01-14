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

public class MMA_200G_parts extends AppCompatActivity {
    ImageView mma200g_invertor_board_image;
    ImageView mma200g_front_board_image;
    ImageView mma200g_control_board_image;
    ImageView mma200g_plastic_front_image;
    Button inside;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mma200_gparts);
        inside = findViewById(R.id.mma_200g_inside);
        inside.setOnClickListener(this::onClick);
        mma200g_invertor_board_image = findViewById(R.id.mma200g_invertor_board_image);
        mma200g_front_board_image = findViewById(R.id.mma200g_front_board_image);
        mma200g_control_board_image = findViewById(R.id.mma200g_control_board_image);
        mma200g_plastic_front_image = findViewById(R.id.mma200g_plastic_front_image);

        downloadImage();
    }

    private void downloadImage() {
        String url = "https://github.com/max83100/123/blob/main/spare_parts/MMA%20200G%20Hanker/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D1%81%D0%B8%D0%BB%D0%BE%D0%B2%D0%B0%D1%8F%205.496RM.139.jpg?raw=true";
        Glide.with(this).load(url)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mma200g_invertor_board_image);
        String url2 = "https://github.com/max83100/123/blob/main/spare_parts/MMA%20200G%20Hanker/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%BB%D0%B8%D1%86%D0%B5%D0%B2%D0%B0%D1%8F%205.496RM.089-A.jpg?raw=true";
        Glide.with(this).load(url2)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mma200g_front_board_image);
        String url3 = "https://github.com/max83100/123/blob/main/spare_parts/MMA%20200G%20Hanker/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D1%83%D0%BF%D1%80%D0%B0%D0%B2%D0%BB%D0%B5%D0%BD%D0%B8%D1%8F%20W.%20496RM.088-C-6.jpg?raw=true";
        Glide.with(this).load(url3)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mma200g_control_board_image);
        String url4 = "https://github.com/max83100/123/blob/main/spare_parts/MMA%20200G%20Hanker/%D0%BF%D0%B5%D1%80%D0%B5%D0%B4%D0%BD%D1%8F%D1%8F%20%D0%BF%D0%BB%D0%B0%D1%81%D1%82%D0%B8%D0%BA%D0%BE%D0%B2%D0%B0%D1%8F%20%D0%BF%D0%B0%D0%BD%D0%B5%D0%BB%D1%8C.jpg?raw=true";
        Glide.with(this).load(url4)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mma200g_plastic_front_image);

    }

    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), ARC_parts.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }

    public void onClick(View v) {
        if (v.getId() == R.id.mma_200g_inside) {
            Uri address = Uri.parse(
                    "https://drive.google.com/drive/folders/1WQ3846u__YDuP6xFRoUpXxiAFd_tkXCs?usp=sharing");
            Intent openlink = new Intent(Intent.ACTION_VIEW, address);
            startActivity(openlink);
        }
    }
}