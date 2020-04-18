package com.javarush.task.task04.task0436;

/* 
Рисуем прямоугольник
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader n1=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader m1=new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(n1.readLine());
        int m = Integer.parseInt(m1.readLine());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("8");
            }
            System.out.print("\n");
        }//напишите тут ваш код

    }
}
