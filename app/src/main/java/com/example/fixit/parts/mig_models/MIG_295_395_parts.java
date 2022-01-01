package com.example.fixit.parts.mig_models;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.fixit.R;
import com.example.fixit.parts.MIG_parts;

public class MIG_295_395_parts extends AppCompatActivity {
    ImageView mig295_control_board_image;
    ImageView mig295_europlug_image;
    ImageView mig295_plastic_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mig295395_parts);

        mig295_control_board_image = findViewById(R.id.mig295_control_board_image);
        String url = "https://github.com/max83100/123/blob/main/spare_parts/MIG295-395/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D1%83%D0%BF%D1%80%D0%B0%D0%B2%D0%BB%D0%B5%D0%BD%D0%B8%D1%8F%20B01043037.jpg?raw=true";
        Glide.with(this).load(url)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig295_control_board_image);

        mig295_europlug_image = findViewById(R.id.mig295_europlug_image);
        String url2 = "https://github.com/max83100/123/blob/main/spare_parts/MIG295-395/%D0%B5%D0%B2%D1%80%D0%BE%D1%80%D0%B0%D0%B7%D1%8A%D1%91%D0%BC.jpg?raw=true";
        Glide.with(this).load(url2)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig295_europlug_image);

        mig295_plastic_image = findViewById(R.id.mig295_plastic_image);
        String url3 = "https://github.com/max83100/123/blob/main/spare_parts/MIG295-395/%D0%BF%D0%BB%D0%B0%D1%81%D1%82%D0%B8%D0%BA%20%D0%BF%D0%B0%D0%BD%D0%B5%D0%BB%D1%8C%20%D0%B4%D0%BB%D1%8F%20%D0%B5%D0%B2%D1%80%D0%BE%D1%80%D0%B0%D0%B7%D1%8A%D1%91%D0%BC%D0%B0.jpg?raw=true";
        Glide.with(this).load(url3)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig295_plastic_image);
    }
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), MIG_parts.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }
}