package com.javarush.task.task07.task0715;

/* 
Продолжаем мыть раму
*/

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String > list = new ArrayList<String>();//напишите тут ваш код
        Collections.addAll(list,"мама","мыла","раму");
        for (int i = 0; i <list.size() ; i++) {
            String s = list.get(i);
            if(s.equals("мама")||s.equals("мыла")||s.equals("раму")) list.add(i+1,"именно");
            System.out.println(s);
        }
    }
}
