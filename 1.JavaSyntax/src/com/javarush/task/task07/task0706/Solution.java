package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
       int[]dom =new int[15]; //напишите тут ваш код
        int counth = 0,countl = 0;
        BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <dom.length ; i++) {
            dom[i]=Integer.parseInt(d.readLine());
            if (i % 2 == 0) counth+=dom[i];
            else countl+=dom[i];
            }
        System.out.println(counth>countl?"В домах с четными номерами проживает больше жителей.":"В домах с нечетными номерами проживает больше жителей.");
        }
        
    }

