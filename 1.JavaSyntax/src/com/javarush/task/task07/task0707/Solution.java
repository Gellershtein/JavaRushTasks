package com.javarush.task.task07.task0707;

/* 
Что за список такой?
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
       ArrayList<String> test = new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
            test.add("1");
        }
        System.out.println(test.size());
        for (int i = 0; i <test.size() ; i++) {
            System.out.println(test.get(i));
        }
       //напишите тут ваш код
    }
}
