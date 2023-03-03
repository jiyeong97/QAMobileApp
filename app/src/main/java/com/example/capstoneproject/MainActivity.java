package com.example.capstoneproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;



    



 
    public void signup(View view) {
        // build an intent to open another activity page
        Intent intent = new Intent (this, SignUp.class);
        startActivity(intent);
    }
    public void login(View view) {
        // build an intent to open another activity page
        Intent intent = new Intent(this, SignIn.class);
        startActivity(intent);
    }


