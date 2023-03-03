package com.example.capstoneproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


import androidx.annotation.Nullable;

public class MyDatabaseHelper extends SQLiteOpenHelper {
    private SQLiteDatabase db;
    private Context context;

    private static final String DATABASE_NAME = "users.db";
    private static final int DATABASE_VERSION =1;

    private static final String TABLE_NAME = "users_table";
    private static final String COLUMN_ID= "user_id";
    private static final String COLUMN_USERNAME= "username";
    private static final String COLUMN_FULLNAME="fullname";
    private static final String COLUMN_EMAIL= "email";
    private static final String COLUMN_PASSWORD= "password";
    private static final String COLUMN_PHONENUMBER= "phonenumber";
    private static final String COLUMN_NUMBERPROPERTIES= "numberOfProperties";

    public MyDatabaseHelper(@Nullable Context context){
        super(context, DATABASE_NAME , null ,DATABASE_VERSION);
        this.context = context;

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query =
                "CREATE TABLE " + TABLE_NAME + " (" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "+
                COLUMN_FULLNAME +" TEXT, "+
                COLUMN_USERNAME +" TEXT, "+
                COLUMN_EMAIL +" TEXT, "+
                COLUMN_PASSWORD +" TEXT, "+
                COLUMN_PHONENUMBER+" TEXT, "+ COLUMN_NUMBERPROPERTIES +" TEXT);";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            // this method is called to check if the table exists already.
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
            onCreate(db);
    }

    // this method is use to add new course to our sqlite database.
    public void addUser(int userid, String fullName, String email, String password, String username,String number, String numberOfProperties) {

        // on below line we are creating a variable for
        // our sqlite database and calling writable method
        // as we are writing data in our database.
        db = this.getWritableDatabase();

        // on below line we are creating a
        // variable for content values.
        ContentValues values = new ContentValues();

        // on below line we are passing all values
        // along with its key and value pair.
        //values.put(COLUMN_ID);
        values.put(COLUMN_FULLNAME,fullName);
        values.put(COLUMN_USERNAME, username);
        values.put(COLUMN_EMAIL, email);
        values.put(COLUMN_PHONENUMBER, number);
        values.put(COLUMN_PASSWORD, password);
        values.put(COLUMN_NUMBERPROPERTIES, numberOfProperties);

        // after adding all values we are passing
        // content values to our table.
        db.insert(TABLE_NAME, null, values);
       // Toast.makeText(MyDatabaseHelper.this, "InsertedData")

    }



    public boolean getUser(String username, String password){
        String query = "SELECT * FROM "+ TABLE_NAME + " WHERE " + COLUMN_USERNAME+"="+ "'"+username+"'";
        System.out.println("line 86 query "+query);
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor =  db.rawQuery(query, null);
        String user;

        System.out.println("Database count "+cursor.getCount());
        cursor.moveToFirst();
        if(cursor.getCount() > 0){

            user = cursor.getString(cursor.getColumnIndexOrThrow("password"));
            //cursor.getColumnIndex("password")
            System.out.println("line 95 "+ user +"\t"+ password);

            if(user.equals(password)){
               // Toast.makeToast(this,"Successfully signed In",Toast.LENGTH_SHORT).show();\
                System.out.println("line 101 true");
                return true;
            }
        }else{
            System.out.println("Cursor get count is 0");
            System.out.println("Cursor get count is 0");
        }
        

        //String password = cursor.getString(1);

      //  System.out.println("Get user password and username "+ user);
        
        return false;
        // Cursor res =  db.rawQuery( "select * from contacts where id="+id+"", null );
        // return res;
    }
}
