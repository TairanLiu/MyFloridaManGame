package com.example.myfloridamangame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TheGame extends AppCompatActivity {
    TextView question;
    Button A;
    Button B;
    Button C;
    Button D;
    static int score = 0;
    String selectedAnswer;
    Iterator i = HeadlineBank.bank().values().iterator();
    Map.Entry mapElement;
    Headline currentHeadlne;
    boolean outOfQuestions = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_game);
        question = findViewById(R.id.textView);
        A = findViewById(R.id.button);
        B = findViewById(R.id.button2);
        C = findViewById(R.id.button3);
        D = findViewById(R.id.button4);
        while (outOfQuestions == false){
            askQuestion(currentHeadlne);
            getNextEntry();
            if (i.hasNext() == false){
                outOfQuestions = true;
            }
        }
        //
        /*for (Integer i = 0; i< 10; i++){
            HashMap hashMap = HeadlineBank.bank();
            askQuestion(HeadlineBank.bank().get(i));
            if (checkResponse()){
                score++;
            }
        }*/
        //if (score>bestScore)
        askQuestion((Headline) mapElement.getValue());
        loadScreen();
        }


    public void getNextEntry() {
        while (i.hasNext()) {
            mapElement = (Map.Entry) i.next();
            currentHeadlne = (Headline) mapElement.getValue();
        }
    }

    public void askQuestion( Headline h ){
        question.setText(h.getStory());
        A.setText(h.getChoiceA());
        B.setText(h.getChoiceB());
        C.setText(h.getChoiceC());
        D.setText(h.getChoiceD());
    }

    public void onClickA(View view){
        if (currentHeadlne.getBlank().equals(A.getText())){
            score++;
        }
    }
    public void onClickB(View view){
        if (currentHeadlne.getBlank().equals(B.getText())){
            score++;
        }
    }
    public void onClickC(View view){
        if (currentHeadlne.getBlank().equals(C.getText())){
            score++;
        }
    }
    public void onClickD(View view){
        if (currentHeadlne.getBlank().equals(D.getText())){
            score++;
        }
    }
    public void loadScreen(){
        Intent intent = new Intent (this, Final.class);
        startActivity(intent);
    }
    public static int score(){
        return score;
    }
}