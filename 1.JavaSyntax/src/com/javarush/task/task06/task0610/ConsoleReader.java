package com.javarush.task.task06.task0610;

/* 
Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() - читает с клавиатуры строку
int readInt() - читает с клавиатуры число
double readDouble() - читает с клавиатуры дробное число
boolean readBoolean() - читает с клавиатуры строку "true" или "false" и возвращает соответствующую логическую переменную true или false

Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода.


*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader n= new BufferedReader(new InputStreamReader(System.in));
        String N=n.readLine();
        return N;//напишите тут ваш код

    }

    public static int readInt() throws Exception {
        BufferedReader n= new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(n.readLine());
        return N;//напишите тут ваш код

    }

    public static double readDouble() throws Exception {
        BufferedReader n= new BufferedReader(new InputStreamReader(System.in));
        double N = Double.parseDouble(n.readLine());
        return N;//напишите тут ваш код

    }

    public static boolean readBoolean() throws Exception {
        BufferedReader n= new BufferedReader(new InputStreamReader(System.in));
        boolean N= Boolean.parseBoolean(n.readLine());
        return N;//напишите тут ваш код

    }

    public static void main(String[] args) throws Exception {

    }
}
