package com.example.fixit.parts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.fixit.R;

public class CUT_parts extends AppCompatActivity {
    ListView listView;
    String[] names = { "GROVERS ENERGY CUT 45P", "GROVERS CUT40",
            "GROVERS CUT 40 compressor", "GROVERS CUT-60 CNC" , "GROVERS CUT100S"
            , "GROVERS CUT 120CNC"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cut_parts);
        listView = findViewById(R.id.cut_list);
        ArrayAdapter<String>  adapter = new ArrayAdapter<String>(getApplicationContext(),
                R.layout.list_row, R.id.list_row_text, names);
        listView.setAdapter(adapter);
    }
}