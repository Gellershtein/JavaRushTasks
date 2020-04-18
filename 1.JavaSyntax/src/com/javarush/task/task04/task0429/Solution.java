package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader a1=new BufferedReader(new InputStreamReader(System.in));
        int a[]=new int[3];
//

        for (int i = 0; i <3; i++) {
            a[i]=Integer.parseInt(a1.readLine());
        }//напишите тут ваш код
        int count[]=check(a);
        System.out.println("количество отрицательных чисел: "+ count[1]);
        System.out.println("количество положительных чисел: "+ count[0]);
//        for (int i = 0; i <3; i++) {
//            if(a[i]>0)count+=1;
//            }

    }
    public static int[] check(int a[]){
        int count[]=new int[2];

        for (int i = 0; i <3; i++) {
            if(a[i]>0)count[0]+=1;
            else if(a[i]<0)count[1]+=1;
        }

        return count;
    }
}