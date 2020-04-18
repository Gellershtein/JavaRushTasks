package com.javarush.task.task03.task0305;

/* 
Я так давно родился
*/

public class Solution {
    public static void main(String[] args) {
        Person jack = new Person();
        System.out.println(jack.month("may") +" "+jack.day(20)+" "+jack.year(2019));//напишите тут ваш код

        }
    }
class Person{

    public String month(String s){
        return s.toUpperCase();
    }
    public int day(int d){
        if(d<21){return d;}
        else
            return 0;
    }

    public int year(int y){
        if(y>1900&&y<=9999){return y;}
        else
            return 0;
    }
    }

