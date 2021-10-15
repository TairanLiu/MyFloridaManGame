package com.example.myfloridamangame;
//package com.company;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;

public class Headline {
    private String story;
    private String blank;
    //private ArrayList<String> choices = new ArrayList<String>();
    private HashMap <Integer, String> choices = new HashMap <Integer, String>();

    public Headline(String b, String s, String c1, String c2, String c3, String c4){
        blank = b;
        story = s;
        //choices.add(c);
        //choices.add(c1);
        //choices.add(c2);
        //choices.add(c3);
        //HeadlineBank.getHdl().add(this);
        choices.put(1,c1);
        choices.put(2,c2);
        choices.put(3,c3);
        choices.put(4,c4);
    }


    public String getBlank() {
        return blank;
    }

    public String getStory() {
        return story;
    }

    public String getChoiceA(){
        return choices.get(1);
    }
    public String getChoiceB(){
        return choices.get(2);
    }
    public String getChoiceC(){
        return choices.get(3);
    }
    public String getChoiceD(){
        return choices.get(4);
    }

    /*public String getChoices() {
        int c;
        c = (int)(Math.random()*4);
        if (c==0){return (choices.get(0)+choices.get(1)+choices.get(2)+choices.get(3));}
        else if (c==1){return (choices.get(1)+choices.get(0)+choices.get(2)+choices.get(3));}
        else if (c==2){return (choices.get(2)+choices.get(0)+choices.get(1)+choices.get(3));}
        else if (c==3){return (choices.get(3)+choices.get(0)+choices.get(2)+choices.get(1));}
        return (choices.get(3)+choices.get(2)+choices.get(1)+choices.get(0));
    }*/



}
