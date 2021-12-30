package com.example.fixit.parts.arc_models;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.fixit.R;

public class ARC_315LT_parts extends AppCompatActivity {
    ImageView arc315lt_power_board_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arc315_lt_parts);

        arc315lt_power_board_image = findViewById(R.id.arc315lt_power_board_image);
        String url4 = "https://github.com/max83100/123/blob/main/spare_parts/ARC%20315LT/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%B1%D0%BB%D0%BE%D0%BA%D0%B0%20%D0%BF%D0%B8%D1%82%D0%B0%D0%BD%D0%B8%D1%8F%20W.%20496RM.397-D.jpg?raw=true";

        Glide.with(this).load(url4)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(arc315lt_power_board_image);
    }
}