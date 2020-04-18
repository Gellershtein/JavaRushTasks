package com.javarush.task.task04.task0425;

/*
Цель установлена!
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader a1 = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(a1.readLine());
        BufferedReader b1 = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.parseInt(b1.readLine());
//        BufferedReader c1 = new BufferedReader(new InputStreamReader(System.in));
//        int c = Integer.parseInt(c1.readLine());
//        BufferedReader d1 = new BufferedReader(new InputStreamReader(System.in));
//        int d = Integer.parseInt(d1.readLine());

        if (a>0 && b>0) System.out.println(1);
        else if (a>0 && b<0) System.out.println(4);
        if (a<0 && b>0) System.out.println(2);
        else if (a<0 && b<0) System.out.println(3);

    }

}