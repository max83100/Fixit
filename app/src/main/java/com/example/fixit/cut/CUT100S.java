package com.example.fixit.cut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.fixit.R;

public class CUT100S extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cut100_s);
    }
    public void onClick(View v) {
        switch (v.getId()) {

            case(R.id.linkcut100s):
                Uri address = Uri.parse(
                        "https://drive.google.com/file/d/1XaB8cJ2QLSH8DmdACvnDB0yiAkK_dlzS/view?usp=sharing");
                Intent openlink = new Intent(Intent.ACTION_VIEW, address);
                startActivity(openlink);
                break;
            case(R.id.webcut100s):
                Uri webmig_uri = Uri.parse(
                        "https://grovers.ru/catalog/vozdushno-plazmennaya-rezka/grovers_cut100s_/");
                Intent webmig = new Intent(Intent.ACTION_VIEW, webmig_uri);
                startActivity(webmig);
                break;
        }
    }
}