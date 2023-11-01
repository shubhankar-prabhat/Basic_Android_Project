package com.example.shubhankar;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final  String DATABASE_NAME = "Student.db";
    public static final  String TABLE_NAME = "student_table";
    public static final  String COL_1 = "ID";
    public static final  String COL_2 = "NAME";
    public static final  String COL_3 = "SUBJECT";
    public static final  String COL_4 = "MARKS";

    public DatabaseHelper(Context context) {

        super(context, DATABASE_NAME, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("create table " + TABLE_NAME +" (ID INTEGER ,NAME TEXT,SUBJECT TEXT PRIMARY KEY AUTOINCREMENT,MARKS INTEGER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(sqLiteDatabase);
    }

    public boolean insertData(String id,String name, String subject, String marks){

        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1,id);
        contentValues.put(COL_2,name);
        contentValues.put(COL_3,subject);
        contentValues.put(COL_4,marks);

        long success= db.insert(TABLE_NAME,null,contentValues);
        if(success == -1){
            return false;
        }
        else{
            return true;
        }
    }

    public Cursor getAllData(){
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cur = db.rawQuery("select * from "+TABLE_NAME,null);
        return cur;
    }


    public boolean updateData(String id,String name,String subject,String marks){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1,id);
        contentValues.put(COL_2,name);
        contentValues.put(COL_3,subject);
        contentValues.put(COL_4,marks);

        db.update(TABLE_NAME,contentValues, "ID = ?",new String[]{id});
        return true;
    }

    public Integer deleteData(String subject){
        SQLiteDatabase db=this.getWritableDatabase();
        return db.delete(TABLE_NAME, "Subject = ?",new String[]{subject});
    }



}
