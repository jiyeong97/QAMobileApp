package com.example.capstoneproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class AskQuestion extends AppCompatActivity {

    private EditText textMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask_question);

        //Assigned edit text box to variable.
        textMessage = findViewById(R.id.messageInput);

        //Assigned send image button to variable.
        ImageButton buttonSend = findViewById(R.id.sendBtn);

        //Put onclick event to send button.
        buttonSend.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sendMail();
            }
        });
    }

    //This function links user input to e-mail application.
    private void sendMail(){
        String message = textMessage.getText().toString();

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"97yunjy@gmail.com"});
        intent.putExtra(Intent.EXTRA_TEXT, message);

        intent.setType("message/rfc822");
        startActivity(Intent.createChooser(intent,"Choose an email client"));
    }

    //This function links to navigator activity.
    public void goToNavigatorPage(View view){
        Intent intent = new Intent(this,NavigatorC.class);
        startActivity(intent);
    }
}