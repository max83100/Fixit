package com.example.fixit.parts.tig_models;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.fixit.R;
import com.example.fixit.menu_java.Spare_parts;
import com.example.fixit.parts.TIG_parts;

public class TIG_200_DC_parts extends AppCompatActivity {

    ImageView tig200dc_front_board_image;
    ImageView tig200dc_hf_board_image;
    ImageView tig200dc_invertor_board_image;
    ImageView tig200dc_control_board_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tig200_dc_parts);

        tig200dc_front_board_image = findViewById(R.id.tig200dc_front_board_image);
        String url4 = "https://github.com/max83100/123/blob/main/spare_parts/TIG%20200%20DC%20Puls%20Hanker/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%BB%D0%B8%D1%86%D0%B5%D0%B2%D0%B0%D1%8F%20W.%20496RM.164-A.jpg?raw=true";
        Glide.with(this).load(url4)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(tig200dc_front_board_image);

        tig200dc_hf_board_image = findViewById(R.id.tig200dc_hf_board_image);
        String url5 = "https://github.com/max83100/123/blob/main/spare_parts/TIG%20200%20DC%20Puls%20Hanker/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%BE%D1%81%D1%86%D0%B8%D0%BB%D0%BB%D1%8F%D1%82%D0%BE%D1%80%D0%B0%20W.%20496RM.434-C.jpg?raw=true";
        Glide.with(this).load(url5)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(tig200dc_hf_board_image);

        tig200dc_invertor_board_image = findViewById(R.id.tig200dc_invertor_board_image);
        String url6 = "https://github.com/max83100/123/blob/main/spare_parts/TIG%20200%20DC%20Puls%20Hanker/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D1%81%D0%B8%D0%BB%D0%BE%D0%B2%D0%B0%D1%8F%20W.%20422RM.405-GR.jpg?raw=true";
        Glide.with(this).load(url6)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(tig200dc_invertor_board_image);

        tig200dc_control_board_image = findViewById(R.id.tig200dc_control_board_image);
        String url7 = "https://github.com/max83100/123/blob/main/spare_parts/TIG%20200%20DC%20Puls%20Hanker/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D1%83%D0%BF%D1%80%D0%B0%D0%B2%D0%BB%D0%B5%D0%BD%D0%B8%D1%8F%20W.%20496RM.308-I.jpg?raw=true";
        Glide.with(this).load(url7)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(tig200dc_control_board_image);
    }
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), TIG_parts.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }
}