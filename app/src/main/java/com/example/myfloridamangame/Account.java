package com.example.myfloridamangame;

import android.widget.EditText;

import java.io.Serializable;

public class Account implements Serializable {
    private String privateID;
    private String username;
    private String password;
    private String fullName;
    private int bestScore = 0;
    private int count = 0;
    public Account(String u, String p){
        fullName = u + "the user";
        username = u;
        password = p;
        bestScore = 0;
        privateID = username + count;

        count ++;
    }
    public void setHighPoint(int p){
        if (p>bestScore){
            bestScore = p;
        }
    }
    public String getPrivateID(){ return privateID; }
    public int getBestScore(){return bestScore;}

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
