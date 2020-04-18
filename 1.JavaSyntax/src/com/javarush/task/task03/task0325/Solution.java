package com.javarush.task.task03.task0325;

/* 
Финансовые ожидания
*/

import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader numb = new BufferedReader(new InputStreamReader(System.in));
        String nm = numb.readLine();
        int number = Integer.parseInt(nm);
        System.out.println("Я буду зарабатывать $" + number + " в час");
    }
}
