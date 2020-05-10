package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String > list= new ArrayList<String >();// Считать строки с консоли и объявить ArrayList list тут
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <10 ; i++) {
            list.add(str.readLine());
        }

        ArrayList<String> result = doubleValues(list);
        for (int i = 0; i <result.size() ; i++) {
            System.out.println(result.get(i)); // Вывести на экран result
        }

    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for (int i = 0; i <list.size() ; i+=2) {
            String s = list.get(i);
            list.add(i+1,s);
        }
        return list;
    }
}
