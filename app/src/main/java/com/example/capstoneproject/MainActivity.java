package com.example.capstoneproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
 /*
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
*/
}
