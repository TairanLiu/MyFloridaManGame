package com.example.myfloridamangame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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
    Headline currentHeadlne;
    boolean outOfQuestions = false; //So we know when to stop playing

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_game);
        //getNextEntry(); // Mr. U - We set currentHeadline to the first headline found in the HashMap. Without this being called, we get a NullPointerException
        question = findViewById(R.id.textView);
        A = findViewById(R.id.button);
        B = findViewById(R.id.button2);
        C = findViewById(R.id.button3);
        D = findViewById(R.id.button4);
        if (outOfQuestions == false) {
            getNextEntry(); // Mr. U - We set currentHeadline to the first headline found in the HashMap. Without this being called, we get a NullPointerException
            askQuestion(currentHeadlne); //Mr. U - You play a "round"
            //getNextEntry(); //Mr. U - We move to the next question
            outOfQuestions = isOutOfQuestions(); //Mr. U - Check if the one above was the last so we know when to stop playing
        }

    }


    public void getNextEntry() {
        while (i.hasNext()) {
            currentHeadlne = (Headline)  i.next(); //Mr U - Cast Not Needed afterall
        }
    }

    public boolean isOutOfQuestions() {
        if(i.hasNext()) {
            return false;
        }
        else {
            return true;
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
        iterate();
        System.out.print("life in general");
        Log.d("Button","clicked");
        if (currentHeadlne.getBlank().equals(A.getText())){
            score++;

        }
    }
    public void onClickB(View view){
        iterate();
        System.out.print("life in general");
        if (currentHeadlne.getBlank().equals(B.getText())){
            score++;

        }
    }
    public void onClickC(View view){
        iterate();
        System.out.print("life in general");
        if (currentHeadlne.getBlank().equals(C.getText())){
            score++;

        }
    }
    public void onClickD(View view){
        iterate();
        System.out.print("life in general");
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
    public void iterate(){
        if (i.hasNext()) {
            getNextEntry(); // Mr. U - We set currentHeadline to the first headline found in the HashMap. Without this being called, we get a NullPointerException
            askQuestion(currentHeadlne); //Mr. U - You play a "round"
            Log.d("life","gone");
            outOfQuestions = isOutOfQuestions(); //Mr. U - Check if the one above was the last so we know when to stop playing
        }
        else{
            Log.d("Life","remain");
        }
    }

}