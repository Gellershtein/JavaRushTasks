package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader a1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader b1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader c1 = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(a1.readLine());
        int b = Integer.parseInt(b1.readLine());
        int c = Integer.parseInt(c1.readLine());

            sort(a,b,c);
    }

    public static void sort(int a,int b,int c)
    {
        if(a>=b&&a>=c)
                {
                if (b>=c) System.out.println(a +" " + b +" "+c);
                else System.out.println(a +" " + c +" "+ b);
                }
          else  if(b >= c)
                    {
                    if (c>=a) System.out.println(b +" " + c+" "+a);
                    else System.out.println(b +" " + a+" "+c);
                    }
                else if(b >= a) System.out.println(c +" " + b+" "+a);
                        else System.out.println(c +" " + a+" "+b);


        }
    }
