package com.example.fixit.tig;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.fixit.R;

public class WSME315WC extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wsme315_wc);
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
}