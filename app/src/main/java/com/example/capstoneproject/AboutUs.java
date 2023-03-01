package com.example.capstoneproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class AboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
    }

    //This function links to string value of url.
    private void goToUrl(String url){
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
    //This function go to twitter url.
    public void goToTwitter (View view){
        goToUrl("https://twitter.com/WinnipegProper1");
    }

    //This function go to facebook url.
    public void goToFacebook (View view){
        goToUrl("https://www.facebook.com/winnipegpropertymanagement/");
    }

    //This function go to youtube url.
    public void goToYoutube (View view){
        goToUrl("https://www.youtube.com/channel/UCRs3SSmwVFbR2QEjIDqU0Ug");
    }

    //This function go to linkedin url.
    public void goToLinkIn (View view){
        goToUrl("https://www.linkedin.com/company/garamark-property-management/");
    }
}