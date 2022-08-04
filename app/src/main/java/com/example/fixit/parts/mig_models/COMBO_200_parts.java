package com.example.fixit.parts.mig_models;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.fixit.R;
import com.example.fixit.parts.MIG_parts;
import com.example.fixit.parts.TIG_parts;

public class COMBO_200_parts extends AppCompatActivity {
    ImageView mig220c_dross_image;
    ImageView mig220c_polarity_image;
    ImageView combo_200_front_board_image;
    ImageView combo_200_front_board_image2;
    ImageView mig220c_hf_board_image;
    ImageView mig220c_buttons_board_image;
    ImageView combo_200_control_board_image;
    ImageView combo_200_invertor_board_image;
    ImageView combo_200_invertor_board_image2;
    ImageView combo_200_invertor_board_image3;
    ImageView combo_200_invertor_board_image4;
    ImageView mig220c_plastic_front_image;
    ImageView mig220c_plastic_back_image;
    ImageView mig220c_mech_image;
    Button inside;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combo200_parts);
        mig220c_dross_image = findViewById(R.id.mig220c_dross_image);
        mig220c_polarity_image = findViewById(R.id.mig220c_polarity_image);
        combo_200_front_board_image = findViewById(R.id.combo_200_front_board_image);
        combo_200_front_board_image2 = findViewById(R.id.combo_200_front_board_image2);
        mig220c_hf_board_image = findViewById(R.id.mig220c_hf_board_image);
        mig220c_buttons_board_image = findViewById(R.id.mig220c_buttons_board_image);
        combo_200_control_board_image = findViewById(R.id.combo_200_control_board_image);
        combo_200_invertor_board_image = findViewById(R.id.combo_200_invertor_board_image);
        combo_200_invertor_board_image2 = findViewById(R.id.combo_200_invertor_board_image2);
        combo_200_invertor_board_image3 = findViewById(R.id.combo_200_invertor_board_image3);
        combo_200_invertor_board_image4 = findViewById(R.id.combo_200_invertor_board_image4);
        mig220c_plastic_front_image = findViewById(R.id.mig220c_plastic_front_image);
        mig220c_plastic_back_image = findViewById(R.id.mig220c_plastic_back_image);
        mig220c_mech_image = findViewById(R.id.mig220c_mech_image);
        downloadImage();
    }

    private void downloadImage() {
        String url = "https://github.com/max83100/123/blob/main/spare_parts/WSME%20200P/%D0%B4%D1%80%D0%BE%D1%81%D1%81%D0%B5%D0%BB%D1%8C%206.190.100-A.jpg?raw=true";
        Glide.with(this).load(url)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig220c_dross_image);

        String url2 = "https://github.com/max83100/123/blob/main/spare_parts/MIG%20220C/%D0%BF%D0%B5%D1%80%D0%B5%D0%BA%D0%BB%D1%8E%D1%87%D0%B0%D1%82%D0%B5%D0%BB%D1%8C%20%D0%BF%D0%BE%D0%BB%D1%8F%D1%80%D0%BD%D0%BE%D1%81%D1%82%D0%B8%207.203.046.jpg?raw=true";
        Glide.with(this).load(url2)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig220c_polarity_image);

        String url3 = "https://github.com/max83100/123/blob/main/spare_parts/COMBO%20200/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%BB%D0%B8%D1%86%D0%B5%D0%B2%D0%B0%D1%8F%205.122.153.jpg?raw=true";
        Glide.with(this).load(url3)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(combo_200_front_board_image);

        String url4 = "https://github.com/max83100/123/blob/main/spare_parts/MIG%20220C/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%BE%D1%81%D1%86%D0%B8%D0%BB%D0%BB%D1%8F%D1%82%D0%BE%D1%80%D0%B0%205.496.470-K.jpg?raw=true";
        Glide.with(this).load(url4)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig220c_hf_board_image);

        String url5 = "https://github.com/max83100/123/blob/main/spare_parts/MIG%20220C/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D1%80%D0%B0%D0%B7%D0%B2%D1%8F%D0%B7%D0%BA%D0%B8%205.496.489-B.jpg?raw=true";
        Glide.with(this).load(url5)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig220c_buttons_board_image);

        String url6 = "https://github.com/max83100/123/blob/main/spare_parts/COMBO%20200/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D1%83%D0%BF%D0%B0%D1%80%D0%B2%D0%BB%D0%B5%D0%BD%D0%B8%D1%8F%205.496.599-F-1.jpg?raw=true";
        Glide.with(this).load(url6)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(combo_200_control_board_image);

        String url7 = "https://github.com/max83100/123/blob/main/spare_parts/COMBO%20200/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D1%81%D0%B8%D0%BB%D0%BE%D0%B2%D0%B0%D1%8F.jpg?raw=true";
        Glide.with(this).load(url7)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(combo_200_invertor_board_image);

        String url8 = "https://github.com/max83100/123/blob/main/spare_parts/MIG%20220C/%D0%BF%D0%B5%D1%80%D0%B5%D0%B4%D0%BD%D1%8F%D1%8F%20%D0%BF%D0%BB%D0%B0%D1%81%D1%82%D0%B8%D0%BA%D0%BE%D0%B2%D0%B0%D1%8F%20%D0%BF%D0%B0%D0%BD%D0%B5%D0%BB%D1%8C%208.069.925-B.jpg?raw=true";
        Glide.with(this).load(url8)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig220c_plastic_front_image);

        String url9 = "https://github.com/max83100/123/blob/main/spare_parts/MIG%20220C/%D0%B7%D0%B0%D0%B4%D0%BD%D1%8F%D1%8F%20%D0%BF%D0%BB%D0%B0%D1%81%D1%82%D0%B8%D0%BA%D0%BE%D0%B2%D0%B0%D1%8F%20%D0%BF%D0%B0%D0%BD%D0%B5%D0%BB%D1%8C%208.068.926.jpg?raw=true";
        Glide.with(this).load(url9)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig220c_plastic_back_image);

        String url10 = "https://github.com/max83100/123/blob/main/spare_parts/MIG%20220C/%D0%BC%D0%B5%D1%85%D0%B0%D0%BD%D0%B8%D0%B7%D0%BC%20%D0%BF%D0%BE%D0%B4%D0%B0%D1%87%D0%B8%207.710.303.jpg?raw=true";
        Glide.with(this).load(url10)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig220c_mech_image);
        String url11 = "https://github.com/max83100/123/blob/main/spare_parts/COMBO%20200/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%BB%D0%B8%D1%86%D0%B5%D0%B2%D0%B0%D1%8F.jpg?raw=true";
        Glide.with(this).load(url11)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(combo_200_front_board_image2);
        String url12 = "https://github.com/max83100/123/blob/main/spare_parts/COMBO%20200/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D1%81%D0%B8%D0%BB%D0%BE%D0%B2%D0%B0%D1%8F%202.jpg?raw=true";
        Glide.with(this).load(url12)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(combo_200_invertor_board_image2);
        String url13 = "https://github.com/max83100/123/blob/main/spare_parts/COMBO%20200/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D1%81%D0%B8%D0%BB%D0%BE%D0%B2%D0%B0%D1%8F%203.jpg?raw=true";
        Glide.with(this).load(url13)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(combo_200_invertor_board_image3);
        String url14 = "https://github.com/max83100/123/blob/main/spare_parts/COMBO%20200/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D1%81%D0%B8%D0%BB%D0%BE%D0%B2%D0%B0%D1%8F%204.jpg?raw=true";
        Glide.with(this).load(url14)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(combo_200_invertor_board_image4);



    }

    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), MIG_parts.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }
}