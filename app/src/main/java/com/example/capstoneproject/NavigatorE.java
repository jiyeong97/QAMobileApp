package com.example.capstoneproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NavigatorE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigator_e);
    }

    //This function links to About Us activity.
    public void goToAboutUsPage(View view){
        Intent intent = new Intent(this, AboutUs.class);
        startActivity(intent);
    }

    //This function links to FAQ categories activity.
    public void goToFAQPage(View view){
        Intent intent = new Intent(this, Categories.class);
        startActivity(intent);
    }

    //This function close navigator activity.
    public void goBackToPreviousPage(View view){
        finish();
    }
}