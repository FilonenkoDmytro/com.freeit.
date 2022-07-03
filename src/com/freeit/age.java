package com.freeit;

import java.util.Random;
import java.util.Scanner;

public class age {
    public static void main (String[] args){

        Scanner day = new Scanner(System.in);
        System.out.println("Please indicate your gender: if you man press 1, if woman please press 2");
        int gender = day.nextInt();
        System.out.println("Please write your name");
        Scanner ivan = new Scanner(System.in);
        String name= ivan.nextLine();
        if(gender==1)
        {System.out.println("Bro, how old are you?");}
        if (gender>1){System.out.println("Girlfriend,how old are you?");}
        Scanner ded =new Scanner(System.in);
        int age =ded.nextInt();
        if(age<18)
        {System.out.println("Baby, "+name +".Let's get to know each other, my name is Ivan");}
        if (age>18 & age<60)
        {System.out.println(name +",Let's get to know each other, my name is Ivan");}
        if (age>60 & gender==1 ){
            System.out.println("Old man, let's get to know each other, my name is Ivan");}
        if(age>60 & gender==2 ){System.out.println("Old woman,let's get to know each other, my name is Ivan ");}

    }


}
