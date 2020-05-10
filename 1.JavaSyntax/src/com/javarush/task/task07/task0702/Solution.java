package com.javarush.task.task07.task0702;

/* 
Массив из строчек в обратном порядке
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] s = new String[10];//напишите тут ваш код
        BufferedReader c = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <8; i++) {
            s[i]=c.readLine();
        }
        for (int i = s.length-1; i >=0 ; i--) {
            System.out.println(s[i]);
        }
    }
}