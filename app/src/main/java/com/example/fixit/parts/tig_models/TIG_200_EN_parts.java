package com.example.fixit.parts.tig_models;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.fixit.R;
import com.example.fixit.parts.TIG_parts;

public class TIG_200_EN_parts extends AppCompatActivity {
    ImageView tig200_handle_board_image;
    ImageView tig200dc_invertor_board_image;
    ImageView tig200dc_control_board_image;
    Button inside;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tig200_en_parts);
        inside = findViewById(R.id.tig_200_inside);
        inside.setOnClickListener(this::onClick);

        tig200_handle_board_image = findViewById(R.id.tig200_handle_board_image);
        String url5 = "https://github.com/max83100/123/blob/main/spare_parts/TIG%20200%20Energy/%D1%80%D1%83%D1%87%D0%BA%D0%B0.jpg?raw=true";
        Glide.with(this).load(url5)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(tig200_handle_board_image);


    }
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), TIG_parts.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }

    public void onClick(View v) {
        if (v.getId() == R.id.tig_200_inside) {
            Uri address = Uri.parse(
                    "https://drive.google.com/drive/folders/1UQYLRKoBFHGmBauMijcraAwKdjDSYMit?usp=sharing");
            Intent openlink = new Intent(Intent.ACTION_VIEW, address);
            startActivity(openlink);
        }
    }
}