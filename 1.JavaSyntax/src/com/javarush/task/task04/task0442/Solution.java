package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
        int sum=0;
        while (true){
            int i = Integer.parseInt(n.readLine());
            if(i==-1) {
                System.out.println(sum-1);break;}
            else sum+=i;

        }//напишите тут ваш код

    }
}
