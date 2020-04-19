package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Совершенствуем функциональность
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        int a[] = new int[5];
        for (int i = 0; i <5 ; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            a[i] = Integer.parseInt(reader.readLine());
        }

        int minimum = min(a[0],a[1],a[2],a[3],a[4]);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a,int b,int c,int d,int e) {
        int min=a;
            if (b<=min) min=b;
            if (c<=min) min=c;
            if (d<=min) min=d;
            if (e<=min) min=e;
        return min;
    }
}
