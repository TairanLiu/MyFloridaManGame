package com.example.myfloridamangame;

import android.widget.EditText;

public class Account {
    private Integer privateID;
    private String username;
    private String password;
    private String fullName;
    private int bestScore;
    private int count = 0;
    public Account(EditText u, EditText p){
        privateID = count;
        username = u.toString();
        password = p.toString();
        bestScore = 0;
        fullName = ""+username+privateID;
        count ++;
    }
    public void setHighPoint(int p){
        if (p>bestScore){
            bestScore = p;
        }
    }
    public Integer getPrivateID(){
        return privateID;
    }
}
