package com.javarush.task.task07.task0709;

/* 
Выражаемся покороче
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader str=new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <5 ; i++) {
            strings.add(str.readLine());
        }
        int min = strings.get(0).length();
        for (int i = 1; i <strings.size(); i++) {
            if(strings.get(i).length()<min) min = strings.get(i).length();
        }
        for (int i = 0; i <strings.size() ; i++) {
            if(strings.get(i).length()==min)System.out.println(strings.get(i));
        }//напишите тут ваш код
    }
}
