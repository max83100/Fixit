package com.example.fixit.parts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.fixit.R;

public class MIG_parts extends AppCompatActivity {
    ListView listView;
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
    }
}