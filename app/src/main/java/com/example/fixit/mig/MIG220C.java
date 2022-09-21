package com.example.fixit.mig;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.fixit.MIG_catalog;
import com.example.fixit.R;

public class MIG220C extends AppCompatActivity {
    ImageView hf_dont_work;
    ImageView motor_power_pcb;
    ImageView motor_controlpcb;
    ImageView pfc_error;
    ImageView ac_dont_work;
    ImageView dc_dont_work;
    ImageView ac_problem;
    ImageView ac_problem2;
    ImageView dc_problem;
    ImageView current_dont_work;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mig220_c);

        hf_dont_work = findViewById(R.id.hf_dont_work);
        motor_power_pcb = findViewById(R.id.motor_power_pcb);
        String hf = "https://github.com/max83100/123/blob/main/problems/MIG220C_hf%20dont%20work.jpg?raw=true";
        Glide.with(this).load(hf)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(hf_dont_work);
        motor_power_pcb = findViewById(R.id.motor_power_pcb);
        String url = "https://github.com/max83100/123/blob/main/problems/MIG220C_motor_dont%20work_power_pcb.jpg?raw=true";
        Glide.with(this).load(url)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(motor_power_pcb);
        motor_controlpcb = findViewById(R.id.motor_controlpcb);
        String url2 = "https://github.com/max83100/123/blob/main/problems/MIG220C_motor%20dont%20work.jpg?raw=true";
        Glide.with(this).load(url2)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(motor_controlpcb);
        pfc_error = findViewById(R.id.pfc_error);
        String url3 = "https://github.com/max83100/123/blob/main/problems/MIG220C_pfclocate.jpg?raw=true";
        Glide.with(this).load(url3)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(pfc_error);
        ac_dont_work = findViewById(R.id.ac_dont_work);
        String url4 = "https://github.com/max83100/123/blob/main/problems/MIG220C_aclocate.jpg?raw=true";
        Glide.with(this).load(url4)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(ac_dont_work);
        dc_dont_work = findViewById(R.id.dc_dont_work);
        String url5 = "https://github.com/max83100/123/blob/main/problems/MIG220C_aclocate.jpg?raw=true";
        Glide.with(this).load(url5)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(dc_dont_work);
        ac_problem = findViewById(R.id.ac_problem);
        String url6 = "https://github.com/max83100/123/blob/main/problems/MIG220C_ac_problem.jpg?raw=true";
        Glide.with(this).load(url6)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(ac_problem);
        ac_problem2 = findViewById(R.id.ac_problem2);
        String url7 = "https://github.com/max83100/123/blob/main/problems/MIG220C_ac_problem2.jpg?raw=true";
        Glide.with(this).load(url7)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(ac_problem2);
        dc_problem = findViewById(R.id.dc_dont_work);
        String url8 = "https://github.com/max83100/123/blob/main/problems/MIG220C_dclocate.jpg?raw=true";
        Glide.with(this).load(url8)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(dc_problem);
        current_dont_work = findViewById(R.id.current_dont_work);
        String url9 = "https://github.com/max83100/123/blob/main/problems/faffc596-747f-494e-abe5-fd0d916cd61d.jpg?raw=true";
        Glide.with(this).load(url9)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(current_dont_work);


    }



    public void onClick(View v) {
        switch (v.getId()) {

            case(R.id.linkmig220c):
                Uri address = Uri.parse("https://drive.google.com/drive/folders/1FJTFwekIJb2HlzLt4CTd79uB3iAYyUrt?usp=sharing");
                Intent openlink = new Intent(Intent.ACTION_VIEW, address);
                startActivity(openlink);
                break;
            case(R.id.webmig220c):
                Uri webmig = Uri.parse(
                        "https://grovers.ru/catalog/pioner-2020-mig220c-acdc/grovers_mig_220s_ac_dc_/");
                Intent webmig200 = new Intent(Intent.ACTION_VIEW, webmig);
                startActivity(webmig200);
                break;
        }
    }
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), MIG_catalog.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }
}