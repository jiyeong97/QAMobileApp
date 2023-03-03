package com.example.capstoneproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NavigatorC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigator_c);
    }

    //This function links to About Us activity.
    public void goToAboutUsPage(View view){
        Intent intent = new Intent(this, AboutUs.class);
        startActivity(intent);
    }

    //This function links to Ask Question activity.
    public void goToAskQuestionPage(View view){
        Intent intent = new Intent(this, AskQuestion.class);
        startActivity(intent);
    }

    //This function close navigator activity.
    public void goBackToPreviousPage(View view){
        finish();
    }
}