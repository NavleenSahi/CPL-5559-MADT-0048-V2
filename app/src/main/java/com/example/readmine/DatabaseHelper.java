package com.example.readmine;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    // creating databse
    public static final String DATABASE_NAME = "UserLocation.db";

    // NAming LATLNG TABle
    public static final String TABLE_LATLNG = "LocationLATLNG";


    // column for TABLE_LATLNG
    public static final String COL_1 = "ID";
    public static final String COL_2 = "LATITUDE";
    public static final String COL_3 = "LONGITUDE";



    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
       String sql1 = ("create table " + TABLE_LATLNG + "(ID INTEGER PRIMARY KEY AUTOINCREMENT , LATITUDE FLOAT, LONGITUDE FLOAT)");


       db.execSQL(sql1);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_LATLNG);

        onCreate(db);


    }

    // Inserting data of LAT & Lng
    public boolean insertData(double latitude, double longitude) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2, latitude);
        contentValues.put(COL_3, longitude);
        long result = db.insert(TABLE_LATLNG, null, contentValues);
        if (result == -1) {
            return false;
        } else {
            return true;
        }
    }

}



