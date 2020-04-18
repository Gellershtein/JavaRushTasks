package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int sum =0,count=0;
        while(true)
        {
            BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
            int m=Integer.parseInt(n.readLine());
           if (m==-1){
               System.out.println((double)sum/count);
               break;
           }
           sum+=m;
           count+=1;

        }
    }
}

