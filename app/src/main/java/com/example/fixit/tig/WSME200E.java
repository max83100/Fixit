package com.example.fixit.tig;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.fixit.R;

public class WSME200E extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wsme200_e);
    }
    public void onClick(View v) {
        switch (v.getId()) {

            case (R.id.linkwsme200e):
                Uri address = Uri.parse("https://drive.google.com/file/d/1h9mY1ox-oExV2om87ahIg2F5UCfCJFnZ/view?usp=sharing");
                Intent openlink = new Intent(Intent.ACTION_VIEW, address);
                startActivity(openlink);
                break;

        }
    }
}