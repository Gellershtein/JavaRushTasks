package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader a1 = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(a1.readLine());
        BufferedReader b1 = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.parseInt(b1.readLine());
        BufferedReader c1 = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(c1.readLine());

        check(a,b,c);//напишите тут ваш код

    }

    public static void check(int a, int b, int c) {
        if (a==b&&b==c) System.out.println(a+" "+ b +" "+ c);
            else if (a==b&&b!=c || b!=a&&b==c) System.out.println(b + " "+ b);
                else if(a==c) System.out.println(a + " " +c);
    }
}