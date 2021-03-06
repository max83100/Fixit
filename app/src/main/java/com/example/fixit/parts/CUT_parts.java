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
import com.example.fixit.parts.cut_models.CUT_100S_parts;
import com.example.fixit.parts.cut_models.CUT_100_parts;
import com.example.fixit.parts.cut_models.CUT_120_parts;
import com.example.fixit.parts.cut_models.CUT_40_parts;
import com.example.fixit.parts.cut_models.CUT_45P_parts;
import com.example.fixit.parts.cut_models.CUT_60_parts;

public class CUT_parts extends AppCompatActivity {
    ListView listView;
    Intent intent;
    String[] names = { "GROVERS ENERGY CUT 45P", "GROVERS CUT40 - CUT 40com",
             "GROVERS CUT-60 CNC" , "GROVERS CUT100S"
            ,"GROVERS CUT100", "GROVERS CUT 120CNC"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cut_parts);
        listView = findViewById(R.id.cut_list);
        ArrayAdapter<String>  adapter = new ArrayAdapter<String>(getApplicationContext(),
                R.layout.list_row, R.id.list_row_text, names);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        intent = new Intent(getApplicationContext(), CUT_45P_parts.class);
                        startActivity(intent);
                        finish();
                        overridePendingTransition(0, 0);
                        break;
                    case 1:
                        intent = new Intent(getApplicationContext(), CUT_40_parts.class);
                        startActivity(intent);
                        finish();
                        overridePendingTransition(0, 0);
                        break;
                    case 2:
                        intent = new Intent(getApplicationContext(), CUT_60_parts.class);
                        startActivity(intent);
                        finish();
                        overridePendingTransition(0, 0);
                        break;
                    case 3:
                        intent = new Intent(getApplicationContext(), CUT_100S_parts.class);
                        startActivity(intent);
                        finish();
                        overridePendingTransition(0, 0);
                        break;
                    case 4:
                        intent = new Intent(getApplicationContext(), CUT_100_parts.class);
                        startActivity(intent);
                        finish();
                        overridePendingTransition(0, 0);
                        break;
                    case 5:
                        intent = new Intent(getApplicationContext(), CUT_120_parts.class);
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