package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader a1=new BufferedReader(new InputStreamReader(System.in));
        int a= Integer.parseInt(a1.readLine());
        BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
        int b= Integer.parseInt(b1.readLine());
        BufferedReader c1=new BufferedReader(new InputStreamReader(System.in));
        int c= Integer.parseInt(c1.readLine());

        sumtr(a,b,c);



    }
    public static void sumtr (int a, int b, int c)
    {
        if((a+b)<=c||(a+c)<=b||(b+c)<=a)
            System.out.println("Треугольник не существует.");
        else System.out.println("Треугольник существует." );
    }
}