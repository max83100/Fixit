package com.example.fixit.parts.mig_models;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.fixit.R;
import com.example.fixit.parts.MIG_parts;

public class MIG220E_parts extends AppCompatActivity {

    ImageView mig220e_front_board_image;
    ImageView mig220e_front_board_image2;
    ImageView mig220e_control_board_image1;
    ImageView mig220e_control_board_image2;
    ImageView mig220e_invertor_board_image;
    ImageView mig220e_invertor_board_image2;
    ImageView mig220e_invertor_board_image3;
    ImageView mig220e_invertor_board_image4;
    ImageView mig220e_invertor_board_image5;
    ImageView mig220e_invertor_board_image6;

    Button inside;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mig220_eparts);

        inside = findViewById(R.id.mig_500_inside);
        inside.setOnClickListener(this::onClick);

        mig220e_front_board_image = findViewById(R.id.mig220e_front_board_image);
        mig220e_front_board_image2 = findViewById(R.id.mig220e_front_board_image2);
        mig220e_control_board_image1 = findViewById(R.id.mig220e_control_board_image1);
        mig220e_control_board_image2 = findViewById(R.id.mig220e_control_board_image2);
        mig220e_invertor_board_image = findViewById(R.id.mig220e_invertor_board_image);
        mig220e_invertor_board_image2 = findViewById(R.id.mig220e_invertor_board_image2);
        mig220e_invertor_board_image3 = findViewById(R.id.mig220e_invertor_board_image3);
        mig220e_invertor_board_image4 = findViewById(R.id.mig220e_invertor_board_image4);
        mig220e_invertor_board_image5 = findViewById(R.id.mig220e_invertor_board_image5);
        mig220e_invertor_board_image6 = findViewById(R.id.mig220e_invertor_board_image6);
        downloadImage();
    }
    private void downloadImage() {


        String url3 = "https://github.com/max83100/123/blob/main/spare_parts/MIG%20220E/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%BB%D0%B8%D1%86%D0%B5%D0%B2%D0%B0%D1%8F%201.jpg?raw=true";
        Glide.with(this).load(url3)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig220e_front_board_image);

        String url6 = "https://github.com/max83100/123/blob/main/spare_parts/MIG%20220E/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D1%83%D0%BF%D1%80%D0%B0%D0%B2%D0%BB%D0%B5%D0%BD%D0%B8%D1%8F1.jpg?raw=true";
        Glide.with(this).load(url6)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig220e_control_board_image1);

        String url8 = "https://github.com/max83100/123/blob/main/spare_parts/MIG%20220E/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D1%83%D0%BF%D1%80%D0%B0%D0%B2%D0%BB%D0%B5%D0%BD%D0%B8%D1%8F%202.jpg?raw=true";
        Glide.with(this).load(url6)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig220e_control_board_image2);


        String url11 = "https://github.com/max83100/123/blob/main/spare_parts/MIG%20220E/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%BB%D0%B8%D1%86%D0%B5%D0%B2%D0%B0%D1%8F%202.jpg?raw=true";
        Glide.with(this).load(url11)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig220e_front_board_image2);




        String url7 = "https://github.com/max83100/123/blob/main/spare_parts/MIG%20220E/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%B8%D0%BD%D0%B2%D0%B5%D1%80%D1%82%D0%BE%D1%80%D0%B0%201.jpg?raw=true";
        Glide.with(this).load(url7)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig220e_invertor_board_image);

        String url12 = "https://github.com/max83100/123/blob/main/spare_parts/MIG%20220E/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%B8%D0%BD%D0%B2%D0%B5%D1%80%D1%82%D0%BE%D1%80%D0%B0%202.jpg?raw=true";
        Glide.with(this).load(url12)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig220e_invertor_board_image2);
        String url13 = "https://github.com/max83100/123/blob/main/spare_parts/MIG%20220E/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%B8%D0%BD%D0%B2%D0%B5%D1%80%D1%82%D0%BE%D1%80%D0%B0%203.jpg?raw=true";
        Glide.with(this).load(url13)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig220e_invertor_board_image3);
        String url14 = "https://github.com/max83100/123/blob/main/spare_parts/MIG%20220E/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%B8%D0%BD%D0%B2%D0%B5%D1%80%D1%82%D0%BE%D1%80%D0%B0%204.jpg?raw=true";
        Glide.with(this).load(url14)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig220e_invertor_board_image4);
        String url1 = "https://github.com/max83100/123/blob/main/spare_parts/MIG%20220E/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%B8%D0%BD%D0%B2%D0%B5%D1%80%D1%82%D0%BE%D1%80%D0%B0%205.jpg?raw=true";
        Glide.with(this).load(url1)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig220e_invertor_board_image5);
        String url2 = "https://github.com/max83100/123/blob/main/spare_parts/MIG%20220E/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%B8%D0%BD%D0%B2%D0%B5%D1%80%D1%82%D0%BE%D1%80%D0%B0%206.jpg?raw=true";
        Glide.with(this).load(url2)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig220e_invertor_board_image6);



    }

    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), MIG_parts.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }

    public void onClick(View v) {
        if (v.getId() == R.id.mig_500_inside) {
            Uri address = Uri.parse(
                    "https://drive.google.com/drive/folders/15W3hfBkSBiakwN1g2nZ_1Hhd0v-V6wQn?usp=share_link");
            Intent openlink = new Intent(Intent.ACTION_VIEW, address);
            startActivity(openlink);
        }
    }
}