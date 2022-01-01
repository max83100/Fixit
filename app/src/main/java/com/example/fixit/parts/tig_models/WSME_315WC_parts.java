package com.example.fixit.parts.tig_models;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.fixit.R;
import com.example.fixit.parts.TIG_parts;

public class WSME_315WC_parts extends AppCompatActivity {

    ImageView wsme315wc_front_board_image;
    ImageView wsme315wc_power_board_image;
    ImageView wsme315wc_sec_invertor_board_image;
    ImageView wsme315wc_first_invertor_board_image;
    ImageView wsme315wc_control_board_image;
    ImageView wsme315wc_hf_board_image;
    ImageView wsme315wc_arc_board_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wsme315_wc_parts);

        wsme315wc_front_board_image = findViewById(R.id.wsme315wc_front_board_image);
        String url = "https://github.com/max83100/123/blob/main/spare_parts/WSME%20315WC/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%BB%D0%B8%D1%86%D0%B5%D0%B2%D0%B0%D1%8F%208.066.641-b.jpg?raw=true";
        Glide.with(this).load(url)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(wsme315wc_front_board_image);


        wsme315wc_power_board_image = findViewById(R.id.wsme315wc_power_board_image);
        String url2 = "https://github.com/max83100/123/blob/main/spare_parts/WSME%20315W/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%B1%D0%BB%D0%BE%D0%BA%D0%B0%20%D0%BF%D0%B8%D1%82%D0%B0%D0%BD%D0%B8%D1%8F%205.496.570-J-1.jpg?raw=true";
        Glide.with(this).load(url2)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(wsme315wc_power_board_image);

        wsme315wc_sec_invertor_board_image = findViewById(R.id.wsme315wc_sec_invertor_board_image);
        String url3 = "https://github.com/max83100/123/blob/main/spare_parts/WSME%20315W/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%B2%D1%82%D0%BE%D1%80%D0%B8%D1%87%D0%BD%D0%BE%D0%B3%D0%BE%20%D0%BF%D1%80%D0%B5%D0%BE%D0%B1%D1%80%D0%B0%D0%B7%D0%BE%D0%B2%D0%B0%D1%82%D0%B5%D0%BB%D1%8F%205.496.720-B.jpg?raw=true";
        Glide.with(this).load(url3)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(wsme315wc_sec_invertor_board_image);

        wsme315wc_first_invertor_board_image = findViewById(R.id.wsme315wc_first_invertor_board_image);
        String url4 = "https://github.com/max83100/123/blob/main/spare_parts/WSME%20315W/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%BF%D0%B5%D1%80%D0%B2%D0%B8%D1%87%D0%BD%D0%BE%D0%B3%D0%BE%20%D0%B8%D0%BD%D0%B2%D0%B5%D1%80%D1%82%D0%BE%D1%80%D0%B0%20%205.496.974-H-4.jpg?raw=true";
        Glide.with(this).load(url4)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(wsme315wc_first_invertor_board_image);


        wsme315wc_hf_board_image = findViewById(R.id.wsme315wc_hf_board_image);
        String url6 = "https://github.com/max83100/123/blob/main/spare_parts/WSME%20315W/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%BE%D1%81%D1%86%D0%B8%D0%BB%D0%BB%D1%8F%D1%82%D0%BE%D1%80%D0%B0%205.496.470-K-4.jpg?raw=true";
        Glide.with(this).load(url6)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(wsme315wc_hf_board_image);

        wsme315wc_control_board_image = findViewById(R.id.wsme315wc_control_board_image);
        String url7 = "https://github.com/max83100/123/blob/main/spare_parts/WSME%20315WC/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D1%83%D0%BF%D1%80%D0%B0%D0%B2%D0%BB%D0%B5%D0%BD%D0%B8%D1%8F%205.496.239-L-2.jpg?raw=true";
        Glide.with(this).load(url7)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(wsme315wc_control_board_image);

        wsme315wc_arc_board_image = findViewById(R.id.wsme315wc_arc_board_image);
        String url8 = "https://github.com/max83100/123/blob/main/spare_parts/WSME%20315W/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D1%81%D1%82%D0%B0%D0%B1%D0%B8%D0%BB%D0%B8%D0%B7%D0%B0%D1%86%D0%B8%D0%B8%20%D0%B4%D1%83%D0%B3%D0%B8%205.496.875-L-1.jpg?raw=true";
        Glide.with(this).load(url8)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(wsme315wc_arc_board_image);
    }
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), TIG_parts.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }
}