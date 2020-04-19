package com.javarush.task.task05.task0532;

/* 
Задача по алгоритмам
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int N;
        int maximum = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(reader.readLine());
        if (N > 0) {
            int a[] = new int[N];
            for (int i = 0; i < N; i++) {
                BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
                a[i] = Integer.parseInt(reader1.readLine());
            }

            for (int i = 0; i <a.length ; i++) {
                if (i == 0) {maximum = a[i];}
                if (a[i] >maximum) maximum = a[i];

            }
            System.out.println(maximum);
        }

        else { reader.close();}
    }
    }
