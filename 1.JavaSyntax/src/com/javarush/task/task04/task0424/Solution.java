package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

            BufferedReader a1 = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(a1.readLine());
        BufferedReader b1 = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.parseInt(b1.readLine());
        BufferedReader c1 = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(c1.readLine());


        if (a == b && !(a == c)) System.out.println(3);
        else if (b == c && !(b== a)) System.out.println(1);
        else if (c == a && !(c == b)) System.out.println(2);
    }

}