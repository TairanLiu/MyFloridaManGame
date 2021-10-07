package com.example.myfloridamangame;
//package com.company;
import java.util.ArrayList;
public class Headline {
    private String story;
    private String blank;
    private ArrayList<String> choices = new ArrayList<String>();

    public Headline(String b, String s, String c, String c1, String c2, String c3){
        blank = b;
        story = s;
        choices.add(c);
        choices.add(c1);
        choices.add(c2);
        choices.add(c3);
        HeadlineBank.getHdl().add(this);
    }


    public String getBlank() {
        return blank;
    }

    public String getStory() {
        return story;
    }

    public String getChoices() {
        int c;
        c = (int)(Math.random()*4);
        if (c==0){return (choices.get(0)+choices.get(1)+choices.get(2)+choices.get(3));}
        else if (c==1){return (choices.get(1)+choices.get(0)+choices.get(2)+choices.get(3));}
        else if (c==2){return (choices.get(2)+choices.get(0)+choices.get(1)+choices.get(3));}
        else if (c==3){return (choices.get(3)+choices.get(0)+choices.get(2)+choices.get(1));}
        return (choices.get(3)+choices.get(2)+choices.get(1)+choices.get(0));
    }
}
