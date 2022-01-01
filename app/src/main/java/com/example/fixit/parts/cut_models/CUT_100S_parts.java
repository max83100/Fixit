package com.example.fixit.parts.cut_models;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.fixit.R;
import com.example.fixit.parts.CUT_parts;

public class CUT_100S_parts extends AppCompatActivity {
    ImageView cut100s_tranzistor_board_image;
    ImageView cut100s_control_board_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cut100_sparts);

        cut100s_tranzistor_board_image = findViewById(R.id.cut100s_tranzistor_board_image);
        String url = "https://github.com/max83100/123/blob/main/spare_parts/CUT%20100S/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%205.496.466-C.jpg?raw=true";
        Glide.with(this).load(url)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(cut100s_tranzistor_board_image);

        cut100s_control_board_image = findViewById(R.id.cut100s_control_board_image);
        String url2 = "https://github.com/max83100/123/blob/main/spare_parts/CUT%20100S/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D1%83%D0%BF%D1%80%D0%B0%D0%B2%D0%BB%D0%B5%D0%BD%D0%B8%D1%8F%205.496.948-C-3.jpg?raw=true";
        Glide.with(this).load(url2)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(cut100s_control_board_image);
    }
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), CUT_parts.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }
}