package com.example.fixit.parts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.fixit.R;
import com.example.fixit.menu_java.Spare_parts;
import com.example.fixit.parts.cut_models.CUT_100_parts;

public class ARC_parts extends AppCompatActivity {
    ListView listView;
    Intent intent;
    String[] names = { "ENERGY ARC 165mini", "ENERGY ARC 160",
            "ENERGY ARC 200", "GROVERS ENERGY ARC220" , "GROVERS MMA-160G professional"
            , "GROVERS MMA-200G professional", "GROVERS ARC 160 PFC", "GROVERS ARC-250LT"
            , "GROVERS ARC 300 ПДУ", "GROVERS ARC 400 ПДУ", "GROVERS ARC-315LT","GROVERS ARC-400LT"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arc_parts);
        listView = findViewById(R.id.arc_list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),
                R.layout.list_row, R.id.list_row_text, names);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        intent = new Intent(getApplicationContext(), CUT_100_parts.class);
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
                    case 4:
                        intent = new Intent(getApplicationContext(), CUT_parts.class);
                        startActivity(intent);
                        finish();
                        overridePendingTransition(0, 0);
                        break;
                    case 5:
                        intent = new Intent(getApplicationContext(), CUT_100_parts.class);
                        startActivity(intent);
                        finish();
                        overridePendingTransition(0, 0);
                        break;
                    case 6:
                        intent = new Intent(getApplicationContext(), CUT_100_parts.class);
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