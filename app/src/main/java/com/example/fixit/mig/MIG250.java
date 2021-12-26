package com.example.fixit.mig;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.fixit.R;

public class MIG250 extends AppCompatActivity {
    ImageView mig250_motor_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mig250);
        mig250_motor_image = findViewById(R.id.mig250_motor_image);
        String url = "https://github.com/max83100/123/blob/main/Mig315_4R_motor_problem.jpg?raw=true";
        Glide.with(this).load(url)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(mig250_motor_image);
    }
    public void onClick(View v) {
        switch (v.getId()) {

            case(R.id.linkmig250):
                Uri address = Uri.parse("https://drive.google.com/file/d/12leEDc9I9a25sy9fxoFypv2WIrA88laD/view?usp=sharing");
                Intent openlink = new Intent(Intent.ACTION_VIEW, address);
                startActivity(openlink);
                break;
            case(R.id.webmig250):
                Uri webmig = Uri.parse(
                        "https://grovers.ru/catalog/MIG-MAG-svarka/poluavtomaticheskaya_svarka_grovers_mig315/");
                Intent webmig200 = new Intent(Intent.ACTION_VIEW, webmig);
                startActivity(webmig200);
                break;
        }
    }
}