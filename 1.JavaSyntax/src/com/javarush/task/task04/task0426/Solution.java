package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader a1 = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(a1.readLine());
        check(a);//напишите тут ваш код

    }

    public static void check(int a) {
        System.out.println(a==0?"ноль":"");
        System.out.println(a<0&&a%2==0?"отрицательное четное число":a<0&&a%2!=0?"отрицательное нечетное число":"");
        System.out.println(a>0&&a%2==0?"положительное четное число":a>0&&a%2!=0?"положительное нечетное число":"");

    }
}
