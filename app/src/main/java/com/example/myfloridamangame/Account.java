package com.example.myfloridamangame;

import android.widget.EditText;

import java.io.Serializable;

public class Account implements Serializable {
    private String privateID;
    private String username;
    private String password;
    //private String fullName;
    private int bestScore = 0;
    //private int count = 0;
    public Account(EditText u, EditText p){

        username = u.toString();
        password = p.toString();
        bestScore = 0;
        privateID = ""+username+privateID;

        //count ++;
    }
    public void setHighPoint(int p){
        if (p>bestScore){
            bestScore = p;
        }
    }
    public String getPrivateID(){ return privateID; }
    public int getBestScore(){return bestScore;}
}
