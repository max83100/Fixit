package com.example.fixit.parts.mig_models;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.fixit.R;
import com.example.fixit.parts.MIG_parts;
import com.example.fixit.parts.TIG_parts;

public class MIG350_500_parts extends AppCompatActivity {

    ImageView mig350_500_plastic_image;
    Button inside;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mig350500_parts);
        inside = findViewById(R.id.mig_500_inside);
        inside.setOnClickListener(this::onClick);

        mig350_500_plastic_image = findViewById(R.id.mig350_500_plastic_image);
        String url8 = "https://github.com/max83100/123/blob/main/spare_parts/MIG%20350%20-%20500/%D0%BF%D0%BB%D0%B0%D1%81%D1%82%D0%B8%D0%BA%20%D0%BF%D0%B0%D0%BD%D0%B5%D0%BB%D1%8C%20%D0%B4%D0%BB%D1%8F%20%D0%B5%D0%B2%D1%80%D0%BE%D1%80%D0%B0%D0%B7%D1%8A%D1%91%D0%BC%D0%B0.jpg?raw=true";
        Glide.with(this).load(url8)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig350_500_plastic_image);
    }
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), MIG_parts.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }
    public void onClick(View v) {
        if (v.getId() == R.id.mig_500_inside) {
            Uri address = Uri.parse(
                    "https://drive.google.com/drive/folders/13ELtjaaKb8XXNIQFahJYqAOW-aoYrH5_?usp=sharing");
            Intent openlink = new Intent(Intent.ACTION_VIEW, address);
            startActivity(openlink);
        }
    }
}