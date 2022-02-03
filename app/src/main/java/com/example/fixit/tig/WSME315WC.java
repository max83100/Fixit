package com.example.fixit.tig;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.fixit.R;
import com.example.fixit.TIG_catalog;

public class WSME315WC extends AppCompatActivity implements View.OnClickListener {
    ImageView wsme_315wc_arc_error_image;
    ImageView wsme_315wc_arc_error_image2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wsme315_wc);

        wsme_315wc_arc_error_image = findViewById(R.id.wsme_315wc_arc_error_image);
        String url = "https://github.com/max83100/123/blob/main/problems/Wsme315wc_error_problem.jpg?raw=true";
        Glide.with(this).load(url)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(wsme_315wc_arc_error_image);

        wsme_315wc_arc_error_image2 = findViewById(R.id.wsme_315wc_arc_error_image2);
        String url2 = "https://github.com/max83100/123/blob/main/problems/Wsme315wc_error_problem2.jpg?raw=true";
        Glide.with(this).load(url2)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(wsme_315wc_arc_error_image2);

    }
    public void onClick(View v) {
        switch (v.getId()) {

            case(R.id.linkwsme315wc):
                Uri address = Uri.parse("https://drive.google.com/file/d/1gYFjdQZJo_-7G6xt18oWClJacP92NAmp/view?usp=sharing");
                Intent openlink = new Intent(Intent.ACTION_VIEW, address);
                startActivity(openlink);
                break;
            case(R.id.webwsme315wc):
                Uri webmig_uri = Uri.parse(
                        "https://grovers.ru/catalog/TIG-svarka/grovers_wsme315_wc_ac_dc_pulse_lcd_/");
                Intent webmig = new Intent(Intent.ACTION_VIEW, webmig_uri);
                startActivity(webmig);
                break;
        }
    }
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), TIG_catalog.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }
}