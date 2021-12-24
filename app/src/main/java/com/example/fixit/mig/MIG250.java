package com.example.fixit.mig;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.fixit.R;

public class MIG250 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mig250);
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