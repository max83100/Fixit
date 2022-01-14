package com.example.fixit.parts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.fixit.R;
import com.example.fixit.menu_java.Bottom;
import com.example.fixit.menu_java.Spare_parts;
import com.example.fixit.parts.mig_models.MIG350_500_parts;
import com.example.fixit.parts.mig_models.MIG_160Energy_parts;
import com.example.fixit.parts.mig_models.MIG_200C_parts;
import com.example.fixit.parts.mig_models.MIG_200Energy_parts;
import com.example.fixit.parts.mig_models.MIG_200_parts;
import com.example.fixit.parts.mig_models.MIG_220C_parts;
import com.example.fixit.parts.mig_models.MIG_295_395_parts;
import com.example.fixit.parts.mig_models.MIG_315T_parts;
import com.example.fixit.parts.mig_models.MIG_315_parts;
import com.example.fixit.parts.mig_models.MULTIMIG_200_PFC_parts;

public class MIG_parts extends AppCompatActivity {
    ListView listView;
    Intent intent;
    String[] names = { "ENERGY MIG 160","ENERGY MIG 200", "GROVERS MIG 200",
             "GROVERS MIG 200C - MIG 200P" , "GROVERS MIG 250T - MIG 315T"
            , "GROVERS MIG 250 - MIG 315",  "GROVERS MIG 295 - MIG 395"
            ,  "GROVERS MULTIMIG 200 PFC DUAL PULSE SYN",
            "GROVERS MIG-220С AC/DC","GROVERS MIG/MMA - 350 - 500"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mig_parts);
        listView = findViewById(R.id.mig_list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),
                R.layout.list_row, R.id.list_row_text, names);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        intent = new Intent(getApplicationContext(), MIG_160Energy_parts.class);
                        startActivity(intent);
                        finish();
                        overridePendingTransition(0, 0);
                        break;
                    case 1:
                        intent = new Intent(getApplicationContext(), MIG_200Energy_parts.class);
                        startActivity(intent);
                        finish();
                        overridePendingTransition(0, 0);
                        break;
                    case 2:
                        intent = new Intent(getApplicationContext(), MIG_200_parts.class);
                        startActivity(intent);
                        finish();
                        overridePendingTransition(0, 0);
                        break;
                    case 3:
                        intent = new Intent(getApplicationContext(), MIG_200C_parts.class);
                        startActivity(intent);
                        finish();
                        overridePendingTransition(0, 0);
                        break;
                    case 4:
                        intent = new Intent(getApplicationContext(), MIG_315T_parts.class);
                        startActivity(intent);
                        finish();
                        overridePendingTransition(0, 0);
                        break;
                    case 5:
                        intent = new Intent(getApplicationContext(), MIG_315_parts.class);
                        startActivity(intent);
                        finish();
                        overridePendingTransition(0, 0);
                        break;
                    case 6:
                        intent = new Intent(getApplicationContext(), MIG_295_395_parts.class);
                        startActivity(intent);
                        finish();
                        overridePendingTransition(0, 0);
                        break;
                    case 7:
                        intent = new Intent(getApplicationContext(), MULTIMIG_200_PFC_parts.class);
                        startActivity(intent);
                        finish();
                        overridePendingTransition(0, 0);
                        break;
                    case 8:
                        intent = new Intent(getApplicationContext(), MIG_220C_parts.class);
                        startActivity(intent);
                        finish();
                        overridePendingTransition(0, 0);
                        break;
                    case 9:
                        intent = new Intent(getApplicationContext(), MIG350_500_parts.class);
                        startActivity(intent);
                        finish();
                        overridePendingTransition(0, 0);
                        break;


                }
            }
        });
    }
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), Spare_parts.class);
        startActivity(intent);
        overridePendingTransition(0,0);
    }

}