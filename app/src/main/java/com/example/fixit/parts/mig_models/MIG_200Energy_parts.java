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

public class MIG_200Energy_parts extends AppCompatActivity {
    ImageView mig200en_europlug_image;
    ImageView mig200en_polarity_pin_image;
    ImageView mig200en_invertor_board_image;
    ImageView mig200en_front_board_image;
    ImageView mig200en_plastic_image;
    ImageView mig200en_control_board_image;
    ImageView mig200en_mech_image;
    ImageView mig200en_fan_image;
    Button inside;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mig200_energy_parts);
        mig200en_europlug_image = findViewById(R.id.mig200en_europlug_image);
        mig200en_polarity_pin_image = findViewById(R.id.mig200en_polarity_pin_image);
        mig200en_invertor_board_image = findViewById(R.id.mig200en_invertor_board_image);
        mig200en_front_board_image = findViewById(R.id.mig200en_front_board_image);
        mig200en_plastic_image = findViewById(R.id.mig200en_plastic_image);
        mig200en_control_board_image = findViewById(R.id.mig200en_control_board_image);
        mig200en_mech_image = findViewById(R.id.mig200en_mech_image);
        mig200en_fan_image = findViewById(R.id.mig200en_fan_image);
        inside = findViewById(R.id.mig200en_inside);
        inside.setOnClickListener(this::onClick);
        downloadImage();
    }

    private void downloadImage() {
        String url = "https://github.com/max83100/123/blob/main/spare_parts/ENERGY%20MIG%20160/%D0%B5%D0%B2%D1%80%D0%BE%D1%80%D0%B0%D0%B7%D1%8A%D1%91%D0%BC.jpg?raw=true";
        Glide.with(this).load(url)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig200en_europlug_image);

        String url2 = "https://github.com/max83100/123/blob/main/spare_parts/ENERGY%20MIG%20160/%D1%88%D1%82%D1%8B%D1%80%D1%8C%20%D1%81%D0%BC%D0%B5%D0%BD%D1%8B%20%D0%BF%D0%BE%D0%BB%D1%8F%D1%80%D0%BD%D0%BE%D1%81%D1%82%D0%B8.jpg?raw=true";
        Glide.with(this).load(url2)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig200en_polarity_pin_image);

        String url3 = "https://github.com/max83100/123/blob/main/spare_parts/MIG200%20ROLWAL/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%B8%D0%BD%D0%B2%D0%B5%D1%80%D1%82%D0%BE%D1%80%D0%B0%20DX50009.jpg?raw=true";
        Glide.with(this).load(url3)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig200en_invertor_board_image);

        String url4 = "https://github.com/max83100/123/blob/main/spare_parts/MIG200%20ROLWAL/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%B8%D0%BD%D0%B4%D0%B8%D0%BA%D0%B0%D1%86%D0%B8%D0%B8%20DX01577.jpg?raw=true";
        Glide.with(this).load(url4)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig200en_front_board_image);

        String url5 = "https://github.com/max83100/123/blob/main/spare_parts/MIG160%20ROLWAL/%D0%BA%D0%BE%D0%BC%D0%BF%D0%BB%D0%B5%D0%BA%D1%82%20%D0%BF%D0%BB%D0%B0%D1%81%D1%82%D0%B8%D0%BA%D0%BE%D0%B2%D1%8B%D1%85%20%D0%BF%D0%B0%D0%BD%D0%B5%D0%BB%D0%B5%D0%B9.jpg?raw=true";
        Glide.with(this).load(url5)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig200en_plastic_image);

        String url6 = "https://github.com/max83100/123/blob/main/spare_parts/MIG200%20ROLWAL/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D1%83%D0%BF%D1%80%D0%B0%D0%B2%D0%BB%D0%B5%D0%BD%D0%B8%D1%8F%20DX01577.jpg?raw=true";
        Glide.with(this).load(url6)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig200en_control_board_image);
        String url7 = "https://github.com/max83100/123/blob/main/spare_parts/%D0%9C%D0%B5%D1%85%D0%B0%D0%BD%D0%B8%D0%B7%D0%BC%D1%8B%20%D0%BF%D0%BE%D0%B4%D0%B0%D1%87%D0%B8/6ca60856-c599-4f8f-b371-433e931044cc.jpg?raw=true";
        Glide.with(this).load(url7)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig200en_mech_image);
        String url8 = "https://github.com/max83100/123/blob/main/spare_parts/%D0%B2%D0%B5%D0%BD%D1%82%D0%B8%D0%BB%D1%8F%D1%82%D0%BE%D1%80%D1%8B/NMB-MAT.jpg?raw=true";
        Glide.with(this).load(url8)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig200en_fan_image);
    }

    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), MIG_parts.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }

    public void onClick(View v) {
        if (v.getId() == R.id.mig200en_inside) {
            Uri address = Uri.parse(
                    "https://drive.google.com/drive/folders/1LslKbvTAuCkhyxRwMu19pvQ9q7OTohs8?usp=sharing");
            Intent openlink = new Intent(Intent.ACTION_VIEW, address);
            startActivity(openlink);
        }
    }
}