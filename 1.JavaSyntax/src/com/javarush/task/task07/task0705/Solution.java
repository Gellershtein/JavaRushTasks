package com.javarush.task.task07.task0705;

/* 
Один большой массив и два маленьких
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] dv = new int[20];//напишите тут ваш код
        int[] d1 = new int[10];
        int[] d2 = new int[10];
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <dv.length; i++) {
            dv[i]=Integer.parseInt(s.readLine());
        }
        int i = 0;
        int j=dv.length/2;
        while(i!=dv.length/2)
        {
            d1[i]=dv[i];
            d2[i]=dv[j];
            System.out.println(d2[i]);
            i++;
            j++;
}

    }
}

