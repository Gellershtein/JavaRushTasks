package com.javarush.task.task04.task0432;

/* 
Хорошего много не бывает
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
        String str = n.readLine();
        BufferedReader c = new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(c.readLine());
        while (N>0)//напишите тут ваш код
        {
            System.out.println(str);
            N--;
        }
    }
}
