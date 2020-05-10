package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Введите N и M");
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());
        ArrayList<String> list = new ArrayList<String>();
//        System.out.println("Введите " + N + "строк");
        for (int i = 0; i <N ; i++) {
            String line = reader.readLine();
            list.add(line);
        }
        int i=0;
        while (i!=M) {
            list.add(list.get(i));
            list.remove(i);
            M--;
        }
        for (i=0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }//напишите тут ваш код
    }
}
