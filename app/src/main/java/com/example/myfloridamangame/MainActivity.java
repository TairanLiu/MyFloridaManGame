package com.example.myfloridamangame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.HashMap;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    static EditText user;
    static EditText password;
    static HashMap<String,Account>players= new HashMap<String,Account>();
    //static Integer count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = findViewById(R.id.editTextTextEmailAddress);
        password = findViewById(R.id.editTextTextPassword);
        HeadlineBank.generateHeadline();

    }
    public void loadScreen(){
        Intent intent = new Intent (this, TheGame.class);
        //take from this current view to theGame
        startActivity(intent);
    }
    public void addAccount(){
        Account player1 = new Account(user,password);
        players.put(player1.getPrivateID(),player1);
        //count++;
    }

    //How to load this screen?
    public void onClick(View view){
        addAccount();
        loadScreen();
    }
    public static int getHighScore() {
        Account thisPerson = new Account(user, password);
        return players.get(thisPerson.getPrivateID()).getBestScore();
    }
    //getBestScore

}