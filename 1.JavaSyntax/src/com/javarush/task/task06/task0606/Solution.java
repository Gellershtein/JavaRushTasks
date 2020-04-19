package com.javarush.task.task06.task0606;

/* 
Чётные и нечётные циферки
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(n.readLine());
        count(N);
        System.out.println("Even: "+even+" Odd: "+odd);


        }
        public static void count(int n){
        int a;

        while (true){
            a=n%10;
            if(a==0) break;
            else if(a%2==0)even+=1;
                else odd+=1;
        n=n/10;
        }

        }
}
