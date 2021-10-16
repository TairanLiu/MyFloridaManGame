package com.example.myfloridamangame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    static EditText user;
    EditText password;
    static HashMap<Integer,Account>players= new HashMap<Integer,Account>();

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
    }

    //How to load this screen?
    public void onClick(View view){
        addAccount();
        loadScreen();
    }
    public static int getHighScore(){
        return players.get(user).getBestScore();
    }

    //getBestScore

}