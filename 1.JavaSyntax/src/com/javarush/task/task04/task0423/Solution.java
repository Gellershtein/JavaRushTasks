package com.javarush.task.task04.task0423;

/* 
Фейс-контроль
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader nm1 = new BufferedReader(new InputStreamReader(System.in));
        String name = nm1.readLine();
        BufferedReader ag1 = new BufferedReader(new InputStreamReader(System.in));
        int age = Integer.parseInt(ag1.readLine());
        if (age > 20) System.out.println("И 18-ти достаточно");///напишите тут ваш код

    }
}
