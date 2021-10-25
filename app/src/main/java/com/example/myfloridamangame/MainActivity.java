package com.example.myfloridamangame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.util.HashMap;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    static EditText user;
    static EditText password;
    static HashMap<String,Account>players= new HashMap<String,Account>();
    //static Integer count = 0;
    //static Account player1 = new Account (user,password);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = findViewById(R.id.editTextTextEmailAddress);
        password = findViewById(R.id.editTextTextPassword);
        HeadlineBank.generateHeadline();
        /*Account account0 = new Account(null, null, 0);
        players.put(0,account0);
        Account account1 = new Account(null, null, 1);
        players.put(1,account1);
        Account account2 = new Account(null, null,2);
        players.put(2,account2);*/



    }
    public void loadScreen(){
        Intent intent = new Intent (this, TheGame.class);
        //take from this current view to theGame
        startActivity(intent);
    }
    public void addAccount(){
        /*for (int i = 0; i<3; i++){
            if (!players.get(i).getUsername().equals(null)){
                players.get(i).setUsername(user.toString());
                players.get(i).setPassword(password.toString());
                break;
            }
        }*/
        Account player1 = new Account (user,password);
        players.put(player1.getPrivateID(),player1);
        //count++;
        //Log.d("account","created");
        Log.d("privat id", player1.getPrivateID());
    }

    //How to load this screen?
    public void onClick(View view){
        addAccount();
        loadScreen();
    }
    public static int getHighScore() {
        Account player1 = new Account (user,password);
        return players.get(player1.getPrivateID()).getBestScore();
        //return players.get(thisPerson.getPrivateID()).getBestScore();
    }
    //getBestScore

}