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
import com.example.fixit.parts.tig_models.TIG_200_DC_parts;
import com.example.fixit.parts.tig_models.TIG_200_EN_parts;
import com.example.fixit.parts.tig_models.TIG_400_parts;
import com.example.fixit.parts.tig_models.WSME_200E_parts;
import com.example.fixit.parts.tig_models.WSME_200W_parts;
import com.example.fixit.parts.tig_models.WSME_200_P_parts;
import com.example.fixit.parts.tig_models.WSME_200_parts;
import com.example.fixit.parts.tig_models.WSME_315WC_parts;
import com.example.fixit.parts.tig_models.WSME_315W_parts;

public class TIG_parts extends AppCompatActivity {
    ListView listView;
    Intent intent;
    String[] names = { "ENERGY TIG /MMA180HF", "GROVERS TIG 200 DC PULSE",
            "GROVERS ENERGY TIG200 AC/DC DOUBLE PULSE", "GROVERS WSME 200P AC/DC" ,"GROVERS WSME 200E AC/DC" , "GROVERS WSME-200 AC/DC"
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
                        intent = new Intent(getApplicationContext(), TIG_200_DC_parts.class);
                        startActivity(intent);
                        finish();
                        overridePendingTransition(0, 0);
                        break;
                    case 2:
                        intent = new Intent(getApplicationContext(), TIG_200_EN_parts.class);
                        startActivity(intent);
                        finish();
                        overridePendingTransition(0, 0);
                        break;
                    case 3:
                        intent = new Intent(getApplicationContext(), WSME_200_P_parts.class);
                        startActivity(intent);
                        finish();
                        overridePendingTransition(0, 0);
                        break;
                    case 4:
                        intent = new Intent(getApplicationContext(), WSME_200E_parts.class);
                        startActivity(intent);
                        finish();
                        overridePendingTransition(0, 0);
                        break;
                    case 5:
                        intent = new Intent(getApplicationContext(), WSME_200_parts.class);
                        startActivity(intent);
                        finish();
                        overridePendingTransition(0, 0);
                        break;
                    case 6:
                        intent = new Intent(getApplicationContext(), WSME_200W_parts.class);
                        startActivity(intent);
                        finish();
                        overridePendingTransition(0, 0);
                        break;
                    case 7:
                        intent = new Intent(getApplicationContext(), WSME_315W_parts.class);
                        startActivity(intent);
                        finish();
                        overridePendingTransition(0, 0);
                        break;
                    case 8:
                        intent = new Intent(getApplicationContext(), WSME_315WC_parts.class);
                        startActivity(intent);
                        finish();
                        overridePendingTransition(0, 0);
                        break;
                    case 9:
                        intent = new Intent(getApplicationContext(), TIG_400_parts.class);
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