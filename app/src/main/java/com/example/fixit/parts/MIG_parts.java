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

public class MIG_parts extends AppCompatActivity {
    ListView listView;
    Intent intent;
    String[] names = { "ENERGY MIG 160", "ENERGY MIG 200",
            "GROVERS MIG 200", "GROVERS MIG 200C" , "GROVERS MIG 250T"
            , "GROVERS MIG250", "GROVERS MIG 315T", "GROVERS MIG 295"
            , "GROVERS MIG315", "GROVERS MIG 395", "GROVERS MULTIMIG 200 PFC DUAL PULSE SYN",
            "GROVERS MIG-220С AC/DC","GROVERS MIG/MMA - 350 - 500","GROVERS MIG505-2"};

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
                        intent = new Intent(getApplicationContext(), TIG_parts.class);
                        startActivity(intent);
                        finish();
                        overridePendingTransition(0, 0);
                        break;
                    case 1:
                        intent = new Intent(getApplicationContext(), MIG_parts.class);
                        startActivity(intent);
                        finish();
                        overridePendingTransition(0, 0);
                        break;
                    case 2:
                        intent = new Intent(getApplicationContext(), ARC_parts.class);
                        startActivity(intent);
                        finish();
                        overridePendingTransition(0, 0);
                        break;
                    case 3:
                        intent = new Intent(getApplicationContext(), CUT_parts.class);
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