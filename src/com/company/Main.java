package com.company;
import javax.swing.*;
import java.awt.*;// for graphic method was given auto by the program
import java.text.DecimalFormat;

class Time {
    private int hour; // 0 - 23
    private int minute;// 0 - 59
    private int second;// 0-59

    public Time(){
        setTime( 0 , 0 , 0);
    }
    public void setTime(int hour , int minute , int second){
        this.hour = (hour >= 0 && 24 > hour ) ? hour : 0 ;
        this.minute = (minute >= 0 && 60 > minute) ? minute : 0;
        this.second = (second >=0 && 60 > second) ? second : 0;
    }
    public String toUniversalString(){
        DecimalFormat twoDig = new DecimalFormat("00");

        return twoDig.format(hour) + ":" + twoDig.format(minute) + ":" +twoDig.format(second);

    }

    public  String toStandardString(){
        DecimalFormat twoDig = new DecimalFormat("00");

        return ((hour == 12 || hour == 0) ? 12 : hour % 12) + ":" +twoDig.format(minute) + ":" + twoDig.format(second)
                + (hour > 12 ? "AM" : "PM");
    }
}
public class Main {

    public static void main(String[] args) {

        Time t1 = new Time();
        String output = "This is the uninvrasal time " + t1.toUniversalString() +"\nand this is the standard "
                +t1.toStandardString();
        System.out.println(output);

        t1.setTime(98, 5 ,12);
        String output1 = "This is the uninvrasal time " + t1.toUniversalString() +"\nand this is the standard "
                +t1.toStandardString();
        System.out.println(output1);
    }
}
