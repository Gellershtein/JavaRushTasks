package com.javarush.task.task07.task0703;

/* 
Общение одиноких массивов
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] st = new String[10];
        int[] ch = new int[10];//напишите тут ваш код
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <st.length; i++) {
            st[i]=s.readLine();
        }
        for (int i = 0; i <ch.length; i++) {
            ch[i]=st[i].length();
        }
        for (int i = 0; i <ch.length ; i++) {
            System.out.println(ch[i]);
        }
    }
}
