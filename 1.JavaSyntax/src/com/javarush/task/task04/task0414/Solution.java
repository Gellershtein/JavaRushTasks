package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader yr = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(yr.readLine());

        checkyear(year);//напишите тут ваш код

    }
    public static void checkyear(int y)
    {
        if(y%400==0) System.out.println("количество дней в году: 366");
        else if(y%100==0) System.out.println("количество дней в году: 365");
            else if (y%4==0) System.out.println("количество дней в году: 366");
                else System.out.println("количество дней в году: 365");

    }
}