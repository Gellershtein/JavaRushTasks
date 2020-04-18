package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader line = new BufferedReader(new InputStreamReader(System.in));
        int ln = Integer.parseInt(line.readLine());
        System.out.println(ln<0?++ln:ln*2);
        //напишите тут ваш код

    }

}