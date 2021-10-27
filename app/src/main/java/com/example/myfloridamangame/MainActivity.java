package com.example.myfloridamangame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    static EditText user;
    static EditText password;
    static HashMap<String,Account>players= new HashMap<>();
    //static Integer count = 0;
    //static Account player1 = new Account (user,password);
    static String User;
    static String Password;
    static Account currentAccount = new Account(null,null);
    //
    //Iterator<Map.Entry<String,Account>> i;


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
        initialize();
        //i = players.entrySet().iterator();
        Account player1 = new Account ("kate","123");
        players.put("kate",player1);
        Account player2 = new Account ("Life","in general");
        players.put("Life",player2);
        Account player3 = new Account ("I am","tired");
        players.put("I am",player3);




    }
    public static void initialize() {
         User = user.getText().toString();
         Password = password.getText().toString();
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
        //Account player1 = new Account (User,Password);
        //players.put(player1.getPrivateID(),player1);
        //count++;
        //Log.d("account","created");
        //Log.d("privat id", player1.getPrivateID());
    }
    //Context context = getApplicationContext();
    //How to load this screen?
    public void onClick(View view){
        Account player1 = new Account (User,Password);
        //Log.d("player1 privateid1", player1.getPrivateID());
        if (players.get(User) == null){
            //Log.d("second", "first condition");
            //players.put(player1.getPrivateID(),player1);
            //Log.d("player1 privateid2", players.get(player1.getPrivateID()).getPrivateID());
            Log.d(User, "not found");
        }
        //addAccount();
        else if (players.get(User)!=null){
            Account playerFound = players.get(User);
            if (Password.equals(players.get(User).getPassword())) {
                loadScreen();
            }
            else{
                Context context = getApplicationContext();
                CharSequence text = "Are you trying to hack?";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        }
        /*else {
            //Log.d("second", "second condition");
            //
            Context context = getApplicationContext();
            CharSequence text = "Are you trying to hack?";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
        Log.d("buttonStart","clicked");
        //Log.d("whatIsUser", User);
        //Log.d("whatIsPass",Password);
        /*if (//(user.getText().toString().equals("kate")&&password.getText().toString().equals("123"))||
                (user.getText().toString().equals("Life")&&password.getText().toString().equals("in general"))||
                (user.getText().toString().equals("I am")&&password.getText().toString().equals("tired"))){
            loadScreen();
        }*/
        /*if (user.getText().toString().equals("kate")&&password.getText().toString().equals("123")){
            currentAccount = players.get(0);
            loadScreen();
        }
        if (user.getText().toString().equals("life")&&password.getText().toString().equals("in general")){
            currentAccount = players.get(1);
            loadScreen();
        }
        if (user.getText().toString().equals("I am")&&password.getText().toString().equals("tired")){
            currentAccount = players.get(2);
            loadScreen();
        }
        else {
            Context context = getApplicationContext();
            CharSequence text = "Are you trying to hack?";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }*/
    }
    public static int getHighScore() {
        /*Account player1 = new Account (User,Password);
        //Log.d("privat id fetched", player1.getPrivateID());
        return players.get(player1.getPrivateID()).getBestScore();
        //return players.get(thisPerson.getPrivateID()).getBestScore();*/
        if (currentAccount.getBestScore()<TheGame.getScore()){
            Account.setBestScore(TheGame.getScore());
            return TheGame.getScore();
        }
        else return currentAccount.getBestScore();

    }

    public static Account getCurrentAccount(){
        return currentAccount;
    }

}