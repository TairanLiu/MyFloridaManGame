package com.example.myfloridamangame;
//package com.company;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;


public class HeadlineBank {
    //florida man with Pikachu tattoo charged with attempted murder

    //private static ArrayList<Headline> hdl = new ArrayList<Headline>();
    static HashMap<Integer,Headline> hdlBank = new HashMap<Integer, Headline>();
    //public static void shuffleHeadline(){
    //    Collections.shuffle(hdl);
    //}
    /*public static ArrayList<Headline> getHdl(){
        return hdl;
    }*/
    public static void generateHeadline(){
        Headline pika = new Headline("pikachu", "florida man with____tattoo charged with attempted murder","Pikachu ","JOJO ","Santa ","FL ");
        hdlBank.put(1,pika);
        //florida man dressed on onesie attemped to burn
        Headline onesie = new Headline("burn","florida man dressed on onesie attemped to____","rob ","burn ","murder ","steal ");
        hdlBank.put(2,onesie);
        //florida man tries to kiss venomous snake
        Headline snake = new Headline("snake","florida man tries to__venomous snake","kill ","eat ","kiss ","sleep on ");
        hdlBank.put(3,snake);
        //florida man tells kids where babies come from
        Headline kids = new Headline("where","florida man tells kids__babies come from", "how ","where ","why ","do  ");
        hdlBank.put(4,kids);
        //naked florida man bikes backway on Miami highway
        Headline bikes = new Headline("bikes","naked florida man__backway on Miami highway ","walks ","bikes ","drives ","runs ");
        hdlBank.put(5,bikes);
        //florida man high on flakka raped a tree
        Headline tree = new Headline("flakka","florida man high on__raped a tree","heroin ","cocaine ","weeds ","flakka " );
        hdlBank.put(6,tree);
        //florida man arrested for eating pancakes in crosswalk
        Headline pancake = new Headline("pancakes", "florida man arrested for eating__in crosswalk", "facades ","icecream ","pancakes ","dohnut ");
        hdlBank.put(7,pancake);
        //florida man gets infected by covid after thinking it was a fake crisis
        Headline covid = new Headline("fake crisis","florida man gets infected by covid after thinking it was a__", " lie"  ,"fake crisis ","conspiracy ","trump  ");
        hdlBank.put(8,covid);
        //florida man gets arrested for calling 911 for a ride home
        Headline call= new Headline("home","florida man gets arrested for calling 911 for a ride__","work ","McDonalds ","starbucks ","home ");
        hdlBank.put(9,call);
        //florida man is the best headline
        Headline fl = new Headline("florida man", "__is the best headline", "florida man ","flolida man ","flarida man ","fl man ");
        hdlBank.put(0,fl);
        Headline ba = new Headline("florida man", "__is the best headline", "florida man ","flolida man ","flarida man ","fl man ");
        hdlBank.put(10,ba);
        Headline a = new Headline("florida man", "__is the best headline", "florida man ","flolida man ","flarida man ","fl man ");
        hdlBank.put(11,a);
        Headline c = new Headline("florida man", "__is the best headline", "florida man ","flolida man ","flarida man ","fl man ");
        hdlBank.put(12,c);
        Headline d = new Headline("florida man", "__is the best headline", "florida man ","flolida man ","flarida man ","fl man ");
        hdlBank.put(13,d);
        Headline e = new Headline("florida man", "__is the best headline", "florida man ","flolida man ","flarida man ","fl man ");
        hdlBank.put(14,e);
        Headline f = new Headline("florida man", "__is the best headline", "florida man ","flolida man ","flarida man ","fl man ");
        hdlBank.put(15,f);
        Headline g = new Headline("florida man", "__is the best headline", "florida man ","flolida man ","flarida man ","fl man ");
        hdlBank.put(16,g);
        Headline h = new Headline("florida man", "__is the best headline", "florida man ","flolida man ","flarida man ","fl man ");
        hdlBank.put(17,h);
        Headline i = new Headline("florida man", "__is the best headline", "florida man ","flolida man ","flarida man ","fl man ");
        hdlBank.put(18,i);
        Headline j = new Headline("florida man", "__is the best headline", "florida man ","flolida man ","flarida man ","fl man ");
        hdlBank.put(19,j);
        Headline k = new Headline("florida man", "__is the best headline", "florida man ","flolida man ","flarida man ","fl man ");
        hdlBank.put(20,k);

    }
    public static HashMap bank(){
        return hdlBank;
    }


}
