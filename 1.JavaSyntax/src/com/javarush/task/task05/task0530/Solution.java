package com.javarush.task.task05.task0530;

/* 
Шеф, что-то не пашет
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        BufferedReader reade3 = new BufferedReader(new InputStreamReader(System.in));
        int b= Integer.parseInt(reade3.readLine());

        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}
