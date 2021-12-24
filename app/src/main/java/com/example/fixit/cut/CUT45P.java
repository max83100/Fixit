package com.example.fixit.cut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.fixit.R;

public class CUT45P extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cut45_p);
    }
    public void onClick(View v) {
        switch (v.getId()) {

            case(R.id.linkcut45p):
                Uri address = Uri.parse(
                        "https://drive.google.com/file/d/1n8atbsx5zZOjtJ67ejVEA8y6Fx1U1503/view?usp=sharing");
                Intent openlink = new Intent(Intent.ACTION_VIEW, address);
                startActivity(openlink);
                break;
            case(R.id.webcut45p):
                Uri webmig_uri = Uri.parse(
                        "https://grovers.ru/catalog/vozdushno-plazmennaya-rezka/grovers-energy-cut-45p/");
                Intent webmig = new Intent(Intent.ACTION_VIEW, webmig_uri);
                startActivity(webmig);
                break;
        }
    }
}