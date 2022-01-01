package com.example.fixit.parts.mig_models;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.fixit.R;
import com.example.fixit.parts.MIG_parts;

public class MULTIMIG_200_PFC_parts extends AppCompatActivity {

    ImageView multimig200_power_board_image;
    ImageView multimig200_front_board_image;
    ImageView multimig200_buttons_board_image;
    ImageView multimig200_invertor_board_image;
    ImageView multimig200_control_board_image;
    ImageView multimig200_motor_board_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multimig200_pfc_parts);

        multimig200_power_board_image = findViewById(R.id.multimig200_power_board_image);
        String url = "https://github.com/max83100/123/blob/main/spare_parts/MULTIMIG200%20DUAL%20PULS/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%B1%D0%BB%D0%BE%D0%BA%D0%B0%20%D0%BF%D0%B8%D1%82%D0%B0%D0%BD%D0%B8%D1%8F%20W.%20496RM.537-F.jpg?raw=true";
        Glide.with(this).load(url)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(multimig200_power_board_image);

        multimig200_front_board_image = findViewById(R.id.multimig200_front_board_image);
        String url2 = "https://github.com/max83100/123/blob/main/spare_parts/MULTIMIG200%20DUAL%20PULS/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%BB%D0%B8%D1%86%D0%B5%D0%B2%D0%B0%D1%8F%20WP.%20496RM.557-C-1.jpg?raw=true";
        Glide.with(this).load(url2)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(multimig200_front_board_image);

        multimig200_buttons_board_image = findViewById(R.id.multimig200_buttons_board_image);
        String url3 = "https://github.com/max83100/123/blob/main/spare_parts/MULTIMIG200%20DUAL%20PULS/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D1%80%D0%B0%D0%B7%D0%B2%D1%8F%D0%B7%D0%BA%D0%B8%20%D0%BA%D0%BD%D0%BE%D0%BF%D0%BA%D0%B8%20WP.%20496RM.555-C.jpg?raw=true";
        Glide.with(this).load(url3)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(multimig200_buttons_board_image);

        multimig200_invertor_board_image = findViewById(R.id.multimig200_invertor_board_image);
        String url4 = "https://github.com/max83100/123/blob/main/spare_parts/MULTIMIG200%20DUAL%20PULS/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D1%81%D0%B8%D0%BB%D0%BE%D0%B2%D0%B0%D1%8F%20W.%20422RM.541.jpg?raw=true";
        Glide.with(this).load(url4)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(multimig200_invertor_board_image);

        multimig200_control_board_image = findViewById(R.id.multimig200_control_board_image);
        String url5 = "https://github.com/max83100/123/blob/main/spare_parts/MULTIMIG200%20DUAL%20PULS/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D1%83%D0%BF%D1%80%D0%B0%D0%B2%D0%BB%D0%B5%D0%BD%D0%B8%D1%8F%20WP.%20496RM.519-H.jpg?raw=true";
        Glide.with(this).load(url5)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(multimig200_control_board_image);

        multimig200_motor_board_image = findViewById(R.id.multimig200_motor_board_image);
        String url6 = "https://github.com/max83100/123/blob/main/spare_parts/MULTIMIG200%20DUAL%20PULS/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D1%83%D0%BF%D1%80%D0%B0%D0%B2%D0%BB%D0%B5%D0%BD%D0%B8%D1%8F%20%D0%BC%D0%BE%D1%82%D0%BE%D1%80%D0%B0%20WP.%20496RM.516-J.jpg?raw=true";
        Glide.with(this).load(url6)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(multimig200_motor_board_image);
    }
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), MIG_parts.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }
}