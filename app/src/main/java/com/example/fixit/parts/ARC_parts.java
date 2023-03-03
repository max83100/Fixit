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
import com.example.fixit.parts.arc_models.ARC_160_PFC_parts;
import com.example.fixit.parts.arc_models.ARC_160_ROL_parts;
import com.example.fixit.parts.arc_models.ARC_165_mini_parts;
import com.example.fixit.parts.arc_models.ARC_200_parts;
import com.example.fixit.parts.arc_models.ARC_250LT_parts;
import com.example.fixit.parts.arc_models.ARC_315LT_parts;
import com.example.fixit.parts.arc_models.ARC_315_parts;
import com.example.fixit.parts.arc_models.ARC_400_parts;
import com.example.fixit.parts.arc_models.MMA_200G_parts;
import com.example.fixit.parts.arc_models.MMA_200_TEC_Rolwal;
import com.example.fixit.parts.cut_models.CUT_100_parts;

public class ARC_parts extends AppCompatActivity {
    ListView listView;
    Intent intent;
    String[] names = { "ENERGY ARC 165mini", "ENERGY ARC 160",
             "ENERGY ARC 200"
            , "GROVERS MMA-200G professional", "GROVERS ARC 160 PFC", "GROVERS ARC-250LT"
            , "GROVERS ARC 300 ПДУ", "GROVERS ARC 400 ПДУ", "GROVERS ARC-315LT","ENERGY MMA 200 TEC"};

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
                        intent = new Intent(getApplicationContext(), ARC_165_mini_parts.class);
                        startActivity(intent);
                        finish();
                        overridePendingTransition(0, 0);
                        break;
                    case 1:
                        intent = new Intent(getApplicationContext(), ARC_160_ROL_parts.class);
                        startActivity(intent);
                        finish();
                        overridePendingTransition(0, 0);
                        break;
                    case 2:
                        intent = new Intent(getApplicationContext(), ARC_200_parts.class);
                        startActivity(intent);
                        finish();
                        overridePendingTransition(0, 0);
                        break;
                    case 3:
                        intent = new Intent(getApplicationContext(), MMA_200G_parts.class);
                        startActivity(intent);
                        finish();
                        overridePendingTransition(0, 0);
                        break;
                    case 4:
                        intent = new Intent(getApplicationContext(), ARC_160_PFC_parts.class);
                        startActivity(intent);
                        finish();
                        overridePendingTransition(0, 0);
                        break;
                    case 5:
                        intent = new Intent(getApplicationContext(), ARC_250LT_parts.class);
                        startActivity(intent);
                        finish();
                        overridePendingTransition(0, 0);
                        break;
                    case 6:
                        intent = new Intent(getApplicationContext(), ARC_315_parts.class);
                        startActivity(intent);
                        finish();
                        overridePendingTransition(0, 0);
                        break;
                    case 7:
                        intent = new Intent(getApplicationContext(), ARC_400_parts.class);
                        startActivity(intent);
                        finish();
                        overridePendingTransition(0, 0);
                        break;
                    case 8:
                        intent = new Intent(getApplicationContext(), ARC_315LT_parts.class);
                        startActivity(intent);
                        finish();
                        overridePendingTransition(0, 0);
                        break;
                    case 9:
                        intent = new Intent(getApplicationContext(), MMA_200_TEC_Rolwal.class);
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