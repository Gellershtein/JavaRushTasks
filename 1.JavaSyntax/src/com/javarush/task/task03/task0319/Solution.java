package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader line = new BufferedReader(new InputStreamReader(System.in));
        String name = line.readLine();
        String n1s=line.readLine();
        int n1=Integer.parseInt(n1s);
        String n2s=line.readLine();
        int n2 = Integer.parseInt(n2s);
        System.out.println( name + " получает " + n1 +  " через " + n2 + " лет.");
    }
}
