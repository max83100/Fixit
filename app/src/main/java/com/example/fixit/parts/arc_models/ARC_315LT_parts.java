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

public class ARC_315LT_parts extends AppCompatActivity {
    ImageView arc315lt_power_board_image;
    ImageView arc315lt_plastic_front_image;
    ImageView arc315lt_plastic_back_image;
    Button inside;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arc315_lt_parts);
        inside = findViewById(R.id.arc_315lt_inside);
        inside.setOnClickListener(this::onClick);

        arc315lt_power_board_image = findViewById(R.id.arc315lt_power_board_image);
        arc315lt_plastic_front_image = findViewById(R.id.arc315lt_plastic_front_image);
        arc315lt_plastic_back_image = findViewById(R.id.arc315lt_plastic_back_image);
        downloadImage();

    }
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), ARC_parts.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }
    public void onClick(View v) {
        if (v.getId() == R.id.arc_315lt_inside) {
            Uri address = Uri.parse(
                    "https://drive.google.com/drive/folders/1qyuoSZpw4uuvF4eRna0jhj7DNcEZqyeQ?usp=sharing");
            Intent openlink = new Intent(Intent.ACTION_VIEW, address);
            startActivity(openlink);
        }
    }
    public void downloadImage(){
        String url = "https://github.com/max83100/123/blob/main/spare_parts/ARC%20315LT/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%B1%D0%BB%D0%BE%D0%BA%D0%B0%20%D0%BF%D0%B8%D1%82%D0%B0%D0%BD%D0%B8%D1%8F%20W.%20496RM.397-D.jpg?raw=true";

        Glide.with(this).load(url)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(arc315lt_power_board_image);

        String url2 = "https://github.com/max83100/123/blob/main/spare_parts/ARC%20315LT/%D0%BF%D0%B5%D1%80%D0%B5%D0%B4%D0%BD%D1%8F%D1%8F%20%D0%BF%D0%BB%D0%B0%D1%81%D1%82%D0%B8%D0%BA%D0%BE%D0%B2%D0%B0%D1%8F%20%D0%BF%D0%B0%D0%BD%D0%B5%D0%BB%D1%8C%208.068.870.jpg?raw=true";

        Glide.with(this).load(url)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(arc315lt_plastic_front_image);

        String url3 = "https://github.com/max83100/123/blob/main/spare_parts/ARC%20315LT/%D0%B7%D0%B0%D0%B4%D0%BD%D1%8F%D1%8F%20%D0%BF%D0%BB%D0%B0%D1%81%D1%82%D0%B8%D0%BA%D0%BE%D0%B2%D0%B0%D1%8F%20%D0%BF%D0%B0%D0%BD%D0%B5%D0%BB%D1%8C%208.068.821.jpg?raw=true";

        Glide.with(this).load(url)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(arc315lt_plastic_back_image);

    }
}