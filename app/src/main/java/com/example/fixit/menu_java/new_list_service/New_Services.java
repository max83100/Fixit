package com.example.fixit.menu_java.new_list_service;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.SearchView;
import android.widget.Toast;

import com.example.fixit.R;
import com.example.fixit.menu_java.Other;

import java.util.ArrayList;

public class New_Services extends AppCompatActivity {
    MyDatabaseHelper myDB;
    ArrayList<DBData> list;
    CustomAdapter customAdapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_services);

        recyclerView = findViewById(R.id.recyclerView);

        myDB = new MyDatabaseHelper(this);
        list = new ArrayList<>();
        showData(recyclerView);
    }


    public void showData(View view){
        try {
            list = myDB.getAllData();
            customAdapter = new CustomAdapter(list);
            recyclerView.hasFixedSize();
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setAdapter(customAdapter);
        } catch (Exception e) {
            Toast.makeText(this, "show data"+e.getMessage(), Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu, menu);

        MenuItem searchItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) searchItem.getActionView();

        searchView.setImeOptions(EditorInfo.IME_ACTION_DONE);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                customAdapter.getFilter().filter(newText);
                return false;
            }
        });
        return true;
    }
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), Other.class);
        startActivity(intent);
    }

}