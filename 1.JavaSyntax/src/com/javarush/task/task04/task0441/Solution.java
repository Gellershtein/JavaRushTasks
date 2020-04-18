package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int N[]=new int [3];
        for (int i = 0; i<3; i++) {
            BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
            N[i]=Integer.parseInt(n.readLine());
        }

        int mid=0;
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i <2 ; i++) {
            if(N[i]>N[i+1]){
                mid=N[i];
                N[i]=N[i+1];
                N[i+1]=mid;
            }
            }
        }
        System.out.println(N[1]);
//        for (int i = 0; i < 3; i++) {
//            System.out.println(N[i]);
//        }
    }
}
