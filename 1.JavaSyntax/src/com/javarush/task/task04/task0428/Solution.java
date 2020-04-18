package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader a1=new BufferedReader(new InputStreamReader(System.in));
       int a[]=new int[3];

        for (int i = 0; i <3; i++) {
        a[i]=Integer.parseInt(a1.readLine());
        }//напишите тут ваш код

        System.out.println(check(a));
//        for (int i = 0; i <3; i++) {
//            if(a[i]>0)count+=1;
//            }

    }
    public static int check(int a[]){
        int count=0;
        for (int i = 0; i <3; i++) {
            if(a[i]>0)count+=1;
        }
        return count;
    }
}
