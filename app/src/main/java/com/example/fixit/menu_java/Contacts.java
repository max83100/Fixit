package com.example.fixit.menu_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


import com.example.fixit.R;

public class Contacts extends AppCompatActivity implements View.OnClickListener {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case (R.id.service_number):
                intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+7 (831) 2-808-333"));
                startActivity(intent);
                break;
            case (R.id.whatsapp):
                intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.setPackage("com.whatsapp");
                startActivity(intent);
                break;
            case (R.id.viber):
                intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.setPackage("com.viber.voip");
                startActivity(intent);
                break;
            case (R.id.service_number2):
                intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:89519115204"));
                break;
            case (R.id.common_number):
                intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+7 (800) 500-32-43"));
                break;
            case R.id.common_email:
                String address = "info@grovers.ru";
                intent = new Intent(android.content.Intent.ACTION_SEND);
                intent.setType("plain/text");
                // Кому
                intent.putExtra(android.content.Intent.EXTRA_EMAIL,
                        new String[] { address.toString() });
                this.startActivity(Intent.createChooser(intent,
                        "Отправка письма e-mail"));
                break;
            case R.id.service_email:
                String address2 = "service@grovers.ru";
                 intent = new Intent(android.content.Intent.ACTION_SEND);
                intent.setType("plain/text");
                // Кому
                intent.putExtra(android.content.Intent.EXTRA_EMAIL,
                        new String[] { address2.toString() });
                this.startActivity(Intent.createChooser(intent,
                        "Отправка письма e-mail"));
                break;
            case R.id.service_adress:
                intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:56.314976, 44.033879"));
                break;
        }
        startActivity(intent);
    }
    public void onBackPressed() {
        intent = new Intent(getApplicationContext(), Other.class);
        startActivity(intent);
    }
}