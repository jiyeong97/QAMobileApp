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

        textMessage = findViewById(R.id.messageInput);

        ImageButton buttonSend = findViewById(R.id.sendBtn);
        buttonSend.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sendMail();
            }
        });
    }

    private void sendMail(){
        String message = textMessage.getText().toString();

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, "97yunjy@gmail.com");
        intent.putExtra(Intent.EXTRA_TEXT, message);

        intent.setType("message/rfc822");
        startActivity(Intent.createChooser(intent,"Choose an email client"));
    }
}