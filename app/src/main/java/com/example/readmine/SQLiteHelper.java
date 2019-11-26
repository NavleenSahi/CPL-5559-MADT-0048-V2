package com.example.readmine;


import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLiteHelper extends SQLiteOpenHelper {

    static String DATABASE_NAME = "UserDataBase";

    public static final String TABLE_NAME = "UserTable";
    public static final String TABLE_NAME_1 = "BookGenre";


    public static final String Table_Column_ID = "id";

    public static final String Table_Column_1_Name = "name";

    public static final String Table_Column_2_Email = "email";

    public static final String Table_Column_3_Password = "password";

    //public static final String Table_Column_4_Pic = "picture";

    public static final String Table_ID = "GenreID";
    public static final String Table_Column_1 = "kids";
    public static final String Table_Column_2 = "sci";
    public static final String Table_Column_3 = "history";
    public static final String Table_Column_4 = "evo";
    public static final String Table_Column_5 = "self";
    public static final String Table_Column_6 = "puzzle";
    public static final String Table_Column_7 = "action";
    public static final String Table_Column_8 = "horror";
    public static final String Table_Column_9 = "mystery";
    public static final String Table_Column_10 = "spirit";
    public static final String Table_Column_11 = "adventure";
    public static final String Table_Column_12 = "war";


    public SQLiteHelper(Context context) {

        super(context, DATABASE_NAME, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase database) {

        String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME + " (" + Table_Column_ID + " INTEGER PRIMARY KEY, " + Table_Column_1_Name + " VARCHAR, " + Table_Column_2_Email + " VARCHAR, " + Table_Column_3_Password + " VARCHAR)";


        String CREATE_TABLE_1 = "CREATE TABLE " + TABLE_NAME_1 + "(" +
                Table_ID + " INTEGER PRIMARY KEY, " +Table_Column_1 + "VARCHAR,"+Table_Column_2 + "VARCHAR,"+Table_Column_3 + "VARCHAR,"+Table_Column_4 + "VARCHAR,"+Table_Column_5 + "VARCHAR,"+Table_Column_6 + "VARCHAR,"+Table_Column_7 + "VARCHAR,"+Table_Column_8 + "VARCHAR,"+Table_Column_9 + "VARCHAR,"+Table_Column_10
                + "VARCHAR,"+Table_Column_11 + "VARCHAR,"+Table_Column_12 + "VARCHAR)";
        database.execSQL(CREATE_TABLE);
        database.execSQL(CREATE_TABLE_1);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME_1);
        onCreate(db);

    }


    public  boolean updateData(String email , String name, String password ){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Table_Column_2_Email,email);
        contentValues.put(Table_Column_1_Name, name);
        contentValues.put(Table_Column_3_Password, password);
        db.update(TABLE_NAME, contentValues,"email = ?", new String[]{email});
        return true;

    }


    public  boolean updateGenre(String kids , String sci, String history , String evo, String self, String puzzle, String action, String horror, String mystery, String spirit, String adventure, String war){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(Table_Column_1,kids);
        contentValues.put(Table_Column_2, sci);
        contentValues.put(Table_Column_3, history);
        contentValues.put(Table_Column_4, evo);
        contentValues.put(Table_Column_5, self);
        contentValues.put(Table_Column_6, puzzle);
        contentValues.put(Table_Column_7, action);
        contentValues.put(Table_Column_8, horror);
        contentValues.put(Table_Column_9, mystery);
        contentValues.put(Table_Column_10, spirit);
        contentValues.put(Table_Column_11, adventure);
        contentValues.put(Table_Column_12, war);

        long result = db.insert(TABLE_NAME_1, null, contentValues);

        if (result == -1) {

            return false;
        } else {
            return true;
        }

          //  return db.insertOrThrow("TABLE",null,contentValues);
        }


//        db.update(TABLE_NAME, contentValues,"email = ?", new String[]{email});
//        return true;

    }


