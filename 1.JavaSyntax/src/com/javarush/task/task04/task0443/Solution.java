package com.javarush.task.task04.task0443;

/* 
Как назвали, так назвали
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
        String name = n.readLine();
        int a[] = new int[3];
        for (int i = 0; i <3 ; i++) {
            BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
            a[i]=Integer.parseInt(b.readLine());
        }
        System.out.println("Меня зовут "+name+".\n"+"Я родился " + a[2]+"."+a[1]+"."+a[0]);
    }
}
