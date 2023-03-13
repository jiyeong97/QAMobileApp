package com.example.capstoneproject;

import android.content.Intent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    public void signup(View view) {
        // build an intent to open another activity page
        Intent intent = new Intent(this, SignUp.class);
        startActivity(intent);
    }

    public void login(View view) {
        // build an intent to open another activity page
        Intent intent = new Intent(this, SignIn.class);
        startActivity(intent);
    }
}