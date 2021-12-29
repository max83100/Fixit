package com.example.fixit.parts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.fixit.R;

public class TIG_parts extends AppCompatActivity {
    ListView listView;
    String[] names = { "ENERGY TIG /MMA180HF", "GROVERS TIG 200 DC PULSE",
            "GROVERS ENERGY TIG200 AC/DC DOUBLE PULSE", "GROVERS WSME 200P AC/DC" , "GROVERS WSME-200 AC/DC"
            , "GROVERS WSME-200W", "GROVERS WSME315W", "GROVERS WSME315 WC"
            , "GROVERS TIG 400 AC/DC"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tig_parts);
        listView = findViewById(R.id.tig_list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),
                R.layout.list_row, R.id.list_row_text, names);
        listView.setAdapter(adapter);
    }
}