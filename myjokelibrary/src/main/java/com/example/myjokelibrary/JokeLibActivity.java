package com.example.myjokelibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class JokeLibActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_lib);

        Intent intent = getIntent();
        String myOwnJoke = intent.getStringExtra("mymessage");

        TextView myTextview = (TextView) findViewById(R.id.mypassedjoke);
        myTextview.setText(myOwnJoke);
    }
}
