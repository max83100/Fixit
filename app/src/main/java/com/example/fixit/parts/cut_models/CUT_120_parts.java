package com.example.fixit.parts.cut_models;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.fixit.R;
import com.example.fixit.parts.CUT_parts;

public class CUT_120_parts extends AppCompatActivity {
    ImageView cut120_driver_board_image;
    ImageView cut120_arc_board_image;
    ImageView cut120_control_board_image;
    Button inside;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cut120_parts);
        inside = findViewById(R.id.cut_120_inside);
        inside.setOnClickListener(this::onClick);

        cut120_driver_board_image = findViewById(R.id.cut120_driver_board_image);
        String url = "https://github.com/max83100/123/blob/main/spare_parts/CUT%20120/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%B4%D1%80%D0%B0%D0%B9%D0%B2%D0%B5%D1%80%D0%B0%20LG-GN-A1.jpg?raw=true";
        Glide.with(this).load(url)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(cut120_driver_board_image);

        cut120_arc_board_image = findViewById(R.id.cut120_arc_board_image);
        String url2 = "https://github.com/max83100/123/blob/main/spare_parts/CUT%20120/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D1%80%D0%BE%D0%B7%D0%B6%D0%B8%D0%B3%D0%B0%20%D0%B4%D1%83%D0%B3%D0%B8%20LG-SG-WH-A5.jpg?raw=true";
        Glide.with(this).load(url2)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(cut120_arc_board_image);

        cut120_control_board_image = findViewById(R.id.cut120_control_board_image);
        String url3 = "https://github.com/max83100/123/blob/main/spare_parts/CUT%20120/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D1%83%D0%BF%D0%B0%D1%80%D0%B2%D0%BB%D0%B5%D0%BD%D0%B8%D1%8F%20LG-GD-A0.jpg?raw=true";
        Glide.with(this).load(url3)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(cut120_control_board_image);

    }
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), CUT_parts.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }
    public void onClick(View v) {
        if (v.getId() == R.id.cut_120_inside) {
            Uri address = Uri.parse(
                    "https://drive.google.com/drive/folders/17iNN5Pklb5UlOd9451HFZLLSTfEOQs2E?usp=sharing");
            Intent openlink = new Intent(Intent.ACTION_VIEW, address);
            startActivity(openlink);
        }
    }
}