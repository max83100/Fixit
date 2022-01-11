
package com.example.fixit.parts.cut_models;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.fixit.R;
import com.example.fixit.parts.CUT_parts;

public class CUT_45P_parts extends AppCompatActivity {
    ImageView cut45_invertor_board_image;
    ImageView cut45_plastic_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cut45_pparts);
        cut45_invertor_board_image = findViewById(R.id.cut45_invertor_board_image);
        cut45_plastic_image = findViewById(R.id.cut45_plastic_image);
        downloadImage();
    }
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), CUT_parts.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }

    private void downloadImage() {
        String url = "https://github.com/max83100/123/blob/main/spare_parts/CUT45%20ROLWAL/%D0%BF%D0%BB%D0%B0%D1%82%D0%B0%20%D0%B8%D0%BD%D0%B2%D0%B5%D1%80%D1%82%D0%BE%D1%80%D0%B0%20H16-A2.jpg?raw=true";
        Glide.with(this).load(url)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(cut45_invertor_board_image);


        String url2 = "https://github.com/max83100/123/blob/main/spare_parts/CUT45%20ROLWAL/%D0%BA%D0%BE%D0%BC%D0%BF%D0%BB%D0%B5%D0%BA%D1%82%20%D0%BF%D0%BB%D0%B0%D1%81%D1%82%D0%B8%D0%BA%D0%BE%D0%B2%D1%8B%D1%85%20%D0%BF%D0%B0%D0%BD%D0%B5%D0%BB%D0%B5%D0%B9.jpg?raw=true";
        Glide.with(this).load(url2)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(cut45_plastic_image);
    }
}