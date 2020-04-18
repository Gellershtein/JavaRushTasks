package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader nm1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader ag1 = new BufferedReader(new InputStreamReader(System.in));
        String name = nm1.readLine();
        int age = Integer.parseInt(ag1.readLine());//напишите тут ваш код
        if (age < 18) System.out.println("Подрасти еще");
    }
}
