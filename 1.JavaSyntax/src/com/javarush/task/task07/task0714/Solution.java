package com.javarush.task.task07.task0714;

/* 
Слова в обратном порядке
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> str = new ArrayList<>();
        BufferedReader t = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <5 ; i++) {
            String s = t.readLine();
            str.add(s);
        }//напишите тут ваш код
        str.remove(2);
        for (int i = 0; i <str.size() ; i++) {
            int j = str.size() - i -1;
            System.out.println(str.get(j));
        }
    }
}
