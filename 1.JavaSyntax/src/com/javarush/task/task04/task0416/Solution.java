package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader m = new BufferedReader(new InputStreamReader(System.in));
        float min = Float.parseFloat(m.readLine());
        colour(min);

    }
    public static void colour(float c){
        float t=c%5;
        if(t>=0.0&&t<3.0) System.out.println("зеленый");
        if (t>=3&&t<4) System.out.println("желтый");
        if (t>=4&&t<5) System.out.println("красный");
    }


}