package com.example.fixit.mig;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.fixit.MIG_catalog;
import com.example.fixit.R;

public class MIG295 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mig295);
    }
    public void onClick(View v) {
        switch (v.getId()) {

            case(R.id.linkmig295):
                Uri address = Uri.parse("https://drive.google.com/file/d/1Az7WGBhDSXJzTkE_Ma45xtZoSVNZ-EfZ/view?usp=sharing");
                Intent openlink = new Intent(Intent.ACTION_VIEW, address);
                startActivity(openlink);
                break;
            case(R.id.webmig295):
                Uri webmig = Uri.parse(
                        "https://grovers.ru/catalog/MIG-MAG-svarka/poluavtomat-grovers-mig-395/");
                Intent webmig295 = new Intent(Intent.ACTION_VIEW, webmig);
                startActivity(webmig295);
                break;
        }
}
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), MIG_catalog.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }
}