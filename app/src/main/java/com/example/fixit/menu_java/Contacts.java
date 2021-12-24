package com.example.fixit.menu_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.fixit.MainActivity;
import com.example.fixit.R;

public class Contacts extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case (R.id.service_number):
                Intent service = new Intent(Intent.ACTION_DIAL);
                service.setData(Uri.parse("tel:+7 (831) 2-808-333"));
                startActivity(service);
                break;
            case (R.id.common_number):
                Intent common = new Intent(Intent.ACTION_DIAL);
                common.setData(Uri.parse("tel:+7 (800) 500-32-43"));
                startActivity(common);
                break;
            case R.id.common_email:
                String address = "info@grovers.ru";
                final Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
                emailIntent.setType("plain/text");
                // Кому
                emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL,
                        new String[] { address.toString() });
                this.startActivity(Intent.createChooser(emailIntent,
                        "Отправка письма e-mail"));
                break;
            case R.id.service_email:
                String address2 = "service@grovers.ru";
                final Intent emailIntent2 = new Intent(android.content.Intent.ACTION_SEND);
                emailIntent2.setType("plain/text");
                // Кому
                emailIntent2.putExtra(android.content.Intent.EXTRA_EMAIL,
                        new String[] { address2.toString() });
                this.startActivity(Intent.createChooser(emailIntent2,
                        "Отправка письма e-mail"));
                break;
            case R.id.service_adress:
                Intent adress = new Intent();
                adress.setAction(Intent.ACTION_VIEW);
                adress.setData(Uri.parse("geo:56.314976, 44.033879"));
                startActivity(adress);
                break;
        }
    }
}