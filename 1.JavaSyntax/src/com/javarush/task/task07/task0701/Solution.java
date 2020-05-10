package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        int[] ar =new int[20];
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <ar.length; i++) {
            ar[i]=Integer.parseInt(s.readLine());
        }// создай и заполни массив
        return ar;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]>max) max = array[i];
        }// найди максимальное значение
        return max;
    }
}
