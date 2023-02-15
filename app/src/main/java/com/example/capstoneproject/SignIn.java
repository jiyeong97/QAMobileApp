



/*
 *	This content is generated from the API File Info.
 *	(Alt+Shift+Ctrl+I).
 *
 *	@desc
 *	@file 		iphone_14___2
 *	@date 		Wednesday 08th of February 2023 08:46:33 AM
 *	@title 		Page 1
 *	@author
 *	@keywords
 *	@generator 	Export Kit v1.3.figma
 *
 */


package com.example.capstoneproject;


import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SignIn extends Activity {


    //IPHONE 3
    private View _bg__iphone_14___3_ek2;
    private View rectangle_10;
    private ImageView logo_1;
    private View rectangle_11;
    private ImageView vector;
    private TextView username;
    private View rectangle_12;
    private TextView password;
    private ImageView vector_ek1;
    private TextView full_name;
    private View rectangle_14;
    private TextView how_many_properties_do_you_manage_;
    private View rectangle_15;
    private TextView email;
    private View rectangle_16;
    private TextView phone_number;
    private View rec;
    private ImageView vector_ek2;
    private ImageView polygon_2;
    private ImageView polygon_1;
    private ImageView polygon_3;
    private TextView sign_up;
    private ImageView vector_ek3;
    private TextView you_have_no_accounts__sign_in;

    private MyDatabaseHelper database;



    //IPHONE 2
    private int userid =0;
    private View _bg__iphone_14___2_ek2;
    private ImageView mask_group_ek1;
    private ImageView pattern;
    private ImageView polygon2;
    private ImageView vector2;
    private TextView username2;
    private TextView password2;
    private ImageView vector_ek4;
    private View view2;
    private ImageView logo_2;
    private ImageView upperlogo_2;
    private ImageView vectorek2;
    private TextView log_in;
    private TextView already_have_an_account__sign_up;

    public SignIn() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        database = new MyDatabaseHelper(SignIn.this);

        _bg__iphone_14___2_ek2 = (View) findViewById(R.id._bg__iphone_14___2_ek2);
        mask_group_ek1 = (ImageView) findViewById(R.id.mask_group_ek1);
        pattern = (ImageView) findViewById(R.id.pattern);
        polygon2 = (ImageView) findViewById(R.id.polygon_1);
        vector2 = (ImageView) findViewById(R.id.vector_1);
        username2 = (TextView) findViewById(R.id.username2);
        password2 = (TextView) findViewById(R.id.password2);
        vector_ek4 = (ImageView) findViewById(R.id.vector_ek4);

        view2 = (View) findViewById(R.id.view2);

        logo_1 = (ImageView) findViewById(R.id.logo_1);
        ImageView upperlogo_1 = (ImageView) findViewById(R.id.upperlogo_1);
        vector_ek2 = (ImageView) findViewById(R.id.vector_ek5);
        log_in = (TextView) findViewById(R.id.log_in);
        already_have_an_account__sign_up = (TextView) findViewById(R.id.already_have_an_account__sign_up);





    }

    public void signIn(View view){

        EditText username = findViewById(R.id.username2);
        EditText password = findViewById(R.id.password2);
//        System.out.println("Email "+username.getText().toString() );
//        System.out.println("Password "+password.getText().toString() );
        System.out.println("Pressing Sign In button "+ username.getText().toString() + password.getText().toString());

        if(database.getUser(username.getText().toString(), password.getText().toString())){
            Toast.makeText(this,"Successfully Signed In",Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this,"Username or password Invalid",Toast.LENGTH_SHORT).show();
        }
    }
    public void signIn2(View view){
        setContentView(R.layout.activity_sign_up);
        Toast.makeText(this,"Opening Sign In page",Toast.LENGTH_SHORT).show();
    }
    public void register1(View view){
        setContentView(R.layout.activity_sign_in);
        Toast.makeText(this,"Opening register page",Toast.LENGTH_SHORT).show();
    }
    public void register2(View view){
        EditText fullname = findViewById(R.id.full_name);
        EditText username = findViewById(R.id.username);
        EditText phonenumber = findViewById(R.id.phone_number);
        EditText password = findViewById(R.id.password1); //TODO : ENCRYPT PASSWORD 2. VALIDATE USER INPUT DATA

        EditText email = findViewById(R.id.email);
        EditText editNumberOfHouses = findViewById(R.id.how_many_properties_do_you_manage_);

        database.addUser(userid,fullname.getText().toString(),email.getText().toString() , password.getText().toString(), username.getText().toString(),phonenumber.getText().toString(), editNumberOfHouses.getText().toString());
        userid = userid+1;


        System.out.println("Pressing register button ");
    }



}



