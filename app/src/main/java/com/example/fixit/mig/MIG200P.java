package com.example.fixit.mig;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.fixit.MIG_catalog;
import com.example.fixit.R;

public class MIG200P extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mig200_p);
    }

    public void onClick(View v) {
        switch (v.getId()) {

            case(R.id.linkmig200p):
                Uri address = Uri.parse("https://drive.google.com/file/d/1c5HNq3xreAFAqAV5FnZIEpjsbheMPLy6/view?usp=sharing");
                Intent openlink = new Intent(Intent.ACTION_VIEW, address);
                startActivity(openlink);
                break;

        }
    }
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), MIG_catalog.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }
}