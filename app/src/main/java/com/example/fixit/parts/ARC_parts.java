package com.example.fixit.parts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.fixit.R;

public class ARC_parts extends AppCompatActivity {
    ListView listView;
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
    }
}