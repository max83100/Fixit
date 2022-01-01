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

public class MIG_160Energy_parts extends AppCompatActivity {
    ImageView mig160_europlug_image;
    ImageView mig160_polarity_pin_image;
    Button inside;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mig160_energy_parts);
        inside = findViewById(R.id.mig_160_inside);
        inside.setOnClickListener(this::onClick);

        mig160_europlug_image = findViewById(R.id.mig160_europlug_image);
        String url = "https://github.com/max83100/123/blob/main/spare_parts/ENERGY%20MIG%20160/%D0%B5%D0%B2%D1%80%D0%BE%D1%80%D0%B0%D0%B7%D1%8A%D1%91%D0%BC.jpg?raw=true";
        Glide.with(this).load(url)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig160_europlug_image);

        mig160_polarity_pin_image = findViewById(R.id.mig160_polarity_pin_image);
        String url2 = "https://github.com/max83100/123/blob/main/spare_parts/ENERGY%20MIG%20160/%D1%88%D1%82%D1%8B%D1%80%D1%8C%20%D1%81%D0%BC%D0%B5%D0%BD%D1%8B%20%D0%BF%D0%BE%D0%BB%D1%8F%D1%80%D0%BD%D0%BE%D1%81%D1%82%D0%B8.jpg?raw=true";
        Glide.with(this).load(url2)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig160_polarity_pin_image);
    }
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), MIG_parts.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }

    public void onClick(View v) {
        if (v.getId() == R.id.mig_160_inside) {
            Uri address = Uri.parse(
                    "https://drive.google.com/drive/folders/1GQwkQwhTL0DCultY7IYLgkafPrT9cNI1?usp=sharing");
            Intent openlink = new Intent(Intent.ACTION_VIEW, address);
            startActivity(openlink);
        }
    }
}