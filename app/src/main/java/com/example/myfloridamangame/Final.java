package com.example.myfloridamangame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Final extends AppCompatActivity {
    TextView finalScore;
    TextView bestScore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        finalScore = findViewById(R.id.textView4);
        bestScore = findViewById(R.id.textView6);
        getFinalScore();

    }
    public void getFinalScore(){
        finalScore.setText(TheGame.score());
    }
    public void getBestScore(){

    }
}