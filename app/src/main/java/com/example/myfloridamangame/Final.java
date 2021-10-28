package com.example.myfloridamangame;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Final extends AppCompatActivity {
    TextView finalScore;
    TextView bestScore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        finalScore = findViewById(R.id.textView4);
        bestScore = findViewById(R.id.textView6);
        finalScore.setText(""+TheGame.score());
        bestScore.setText(getBestScore());
        if (MainActivity.getHighScore()<TheGame.score()){
            Context context = getApplicationContext();
            CharSequence text = "You beat yourself! lol";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }

    }
    public void getFinalScore(){
        finalScore.setText(TheGame.score());
    }

    public String getBestScore(){
        return ""+MainActivity.getHighScore();
    }
}