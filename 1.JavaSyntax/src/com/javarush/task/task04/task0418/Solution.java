package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader a1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader b1 = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(a1.readLine());
        int b = Integer.parseInt(b1.readLine());
        equal(a,b);
    }

    public static void equal(int a,int b) {
        System.out.println(a<=b?a:b);
    }
}