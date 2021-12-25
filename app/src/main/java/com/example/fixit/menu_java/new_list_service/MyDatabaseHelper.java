package com.example.fixit.menu_java.new_list_service;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class MyDatabaseHelper extends SQLiteAssetHelper {
    private static final String DATABASE_NAME = "services.db";
    private static final int DATABASE_VERSION = 1;
    Context context;


    public MyDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
        setForcedUpgrade(1);
    }
    public ArrayList<DBData> getAllData(){
        try {
            ArrayList<DBData> list = new ArrayList<>();
            SQLiteDatabase sqLiteDatabase = getReadableDatabase();
            if(sqLiteDatabase != null){
                Cursor cursor = sqLiteDatabase.rawQuery("select * from locate",null);
                if(cursor.getCount() != 0){
                            while (cursor.moveToNext()){
                                String city_name = cursor.getString(1);
                                String company_name = cursor.getString(2);
                                String map_name = cursor.getString(3);
                                String phone = cursor.getString(4);
                                String web = cursor.getString(5);
                                String geo = cursor.getString(6);


                                list.add(new DBData(city_name,company_name,map_name,phone,web,geo));
                            }
                            return list;
                }
                else {
                    Toast.makeText(context, "No data retired", Toast.LENGTH_SHORT).show();
                    return null;
                }
            }
            else {
                Toast.makeText(context, "Data is null", Toast.LENGTH_SHORT).show();
                return null;
            }


        } catch (Exception e) {
            Toast.makeText(context, "getalldata" + e.getMessage(), Toast.LENGTH_SHORT).show();
            e.printStackTrace();
            return null;
        }
    }
    public int getUpgradeVersion() {

        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        String [] sqlSelect = {"MAX (version)"};
        String sqlTables = "upgrades";

        qb.setTables(sqlTables);
        Cursor c = qb.query(db, sqlSelect, null, null,
                null, null, null);

        int v = 0;
        c.moveToFirst();
        if (!c.isAfterLast()) {
            v = c.getInt(0);
        }
        c.close();
        return v;
    }
}