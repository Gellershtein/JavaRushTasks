package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int a = number/100; //5
        int y = (number%100); //46 напишите тут ваш код
        int b = y/10; //4
        int c = y%10; //6

        return  a+b+c;
    }
}