package com.javarush.task.task07.task0704;

/* 
Переверни массив
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array=new int[10];
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <array.length ; i++) {
            array[i]=Integer.parseInt(s.readLine());
        }

        for (int i = array.length-1; i >=0 ; i--) {
            System.out.println(array[i]);
        }
    }
}

