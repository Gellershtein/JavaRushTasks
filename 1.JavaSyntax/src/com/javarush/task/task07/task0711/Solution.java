package com.javarush.task.task07.task0711;

/* 
Удалить и вставить
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String > strings = new ArrayList<>();//напишите тут ваш код
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <5 ; i++) {
            strings.add(str.readLine());
        }
        for (int i = 0; i <13 ; i++) {
            String s = strings.get(strings.size()-1);
            strings.remove(strings.size()-1);
            strings.add(0,s);
        }
        for (int i = 0; i <strings.size() ; i++) {
            System.out.println(strings.get(i));
        }
    }
}
