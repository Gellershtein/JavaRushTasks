package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.SocketTimeoutException;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader line = new BufferedReader(new InputStreamReader(System.in));

        //System.out.println("Введите число лет");
        String ns = line.readLine();
        int ny = Integer.parseInt(ns);
        //System.out.println("Введите имя");
        String name = line.readLine();

        System.out.println(name + " захватит мир через " + ny + " лет. Му-ха-ха!");



    }
}
