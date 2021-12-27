package com.example.fixit;

import android.content.Intent;
import android.os.Bundle;

import com.example.fixit.menu_java.Bottom;
import com.example.fixit.menu_java.Contacts;
import com.example.fixit.menu_java.Order_for_repair;
import com.example.fixit.menu_java.new_list_service.New_Services;
import com.example.fixit.menu_java.send_mail.Feedback;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.fixit.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AppCompatDelegate.setDefaultNightMode(
                AppCompatDelegate.MODE_NIGHT_NO);
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (id){
        case(R.id.contacts):
Intent contacts = new Intent(getApplicationContext(), Contacts.class);
startActivity(contacts);
            return true;
            case(R.id.info):
                Intent info = new Intent(getApplicationContext(), Bottom.class);
                startActivity(info);
                return true;
            case(R.id.service_locate):
                Intent locate = new Intent(getApplicationContext(), New_Services.class);
                startActivity(locate);
                return true;
            case(R.id.send_email):
                Intent feedback = new Intent(getApplicationContext(), Feedback.class);
                startActivity(feedback);
                return true;
            case(R.id.order_for_repair):
                Intent order = new Intent(getApplicationContext(), Order_for_repair.class);
                startActivity(order);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}