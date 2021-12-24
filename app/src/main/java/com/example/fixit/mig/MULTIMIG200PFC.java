package com.example.fixit.mig;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.fixit.R;

public class MULTIMIG200PFC extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multimig200_pfc);
    }
    public void onClick(View v) {
        switch (v.getId()) {

            case(R.id.linkmultimig):
                Uri address = Uri.parse(
                        "https://drive.google.com/file/d/1vCZdf715F_eMXnIW_QNyN_CMytswWTrA/view?usp=sharing");
                Intent openlink = new Intent(Intent.ACTION_VIEW, address);
                startActivity(openlink);
                break;
            case(R.id.webmultimig200):
                Uri webmig_uri = Uri.parse(
                        "https://grovers.ru/catalog/MIG-MAG-svarka/poluavtomaticheskaya-svarka-grovers-multimig-200-pfc-dual-pulse-syn/");
                Intent webmig = new Intent(Intent.ACTION_VIEW, webmig_uri);
                startActivity(webmig);
                break;
        }
    }
}