package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList sort = new ArrayList();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <5 ; i++) {
            sort.add(Integer.parseInt(reader.readLine()));
        }
        Collections.sort(sort);

        for (int i = 0; i <5; i++) {
            System.out.println(sort.get(i));
        }
        //напишите тут ваш код
    }
}
