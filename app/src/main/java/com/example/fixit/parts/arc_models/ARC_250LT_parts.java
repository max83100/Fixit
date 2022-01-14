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

public class ARC_250LT_parts extends AppCompatActivity {
    ImageView arc250lt_front_board_image;
    ImageView arc250lt_invertor_board_image;
    Button inside;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arc250_lt_parts);
        arc250lt_front_board_image = findViewById(R.id.arc250lt_front_board_image);
        arc250lt_invertor_board_image = findViewById(R.id.arc250lt_invertor_board_image);
        inside = findViewById(R.id.arc250lt_inside);
        inside.setOnClickListener(this::onClick);

        downloadImage();
    }

    private void downloadImage() {
        String url = "https://github.com/max83100/123/blob/main/spare_parts/ARC%20250LT/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%BB%D0%B8%D1%86%D0%B5%D0%B2%D0%B0%D1%8F%20W.%20496RM.388-G.jpg?raw=true";
        Glide.with(this).load(url)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(arc250lt_front_board_image);
        String url2 = "https://github.com/max83100/123/blob/main/spare_parts/ARC%20250LT/%D1%81%D0%B8%D0%BB%D0%BE%D0%B2%D0%B0%D1%8F%20%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20W.422RM.210.jpg?raw=true";
        Glide.with(this).load(url2)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(arc250lt_invertor_board_image);

    }

    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), ARC_parts.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }
    private void onClick(View v) {
        if (v.getId() == R.id.arc250lt_inside) {
            Uri address = Uri.parse(
                    "https://drive.google.com/drive/folders/1X8DTALKqOsbkJTOu4LtNDTGFHQsJMVp7?usp=sharing");
            Intent openlink = new Intent(Intent.ACTION_VIEW, address);
            startActivity(openlink);
        }
    }
}