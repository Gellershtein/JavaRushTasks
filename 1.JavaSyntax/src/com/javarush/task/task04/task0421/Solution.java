package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader n1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader n2 = new BufferedReader(new InputStreamReader(System.in));
        String nm1 = n1.readLine();//напишите тут ваш код
        String nm2 = n2.readLine();
        int len1 = nm1.length();
        int len2 = nm2.length();
        if (nm1.equals(nm2)) System.out.println("Имена идентичны");
        else if (len1==len2) System.out.println("Длины имен равны");

    }
}
