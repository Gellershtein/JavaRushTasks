package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] mass = new int[20];
        int maximum = 0;
        int minimum = 0;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = Integer.parseInt(reader.readLine());
            if (i == 0) {
                maximum = mass[i];
                minimum = mass[i];
            }
                if (mass[i] > maximum) maximum = mass[i];
                if (mass[i] < minimum) minimum = mass[i];
            }
            //напишите тут ваш код

            System.out.print(maximum + " " + minimum);
        }
    }
