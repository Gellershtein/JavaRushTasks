package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader a1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader b1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader c1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader d1 = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(a1.readLine());
        int b = Integer.parseInt(b1.readLine());
        int c = Integer.parseInt(c1.readLine());
        int d = Integer.parseInt(d1.readLine());
        System.out.println(compare(a,b)>=compare(c,d)?compare(a,b):compare(c,d));
    }

        public static int compare (int a,int b)
    {
        if (a>=b) return a;
        else return b;
    }

}
