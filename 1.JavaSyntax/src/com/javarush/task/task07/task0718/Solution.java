package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<String >();//напишите тут ваш код
        BufferedReader w = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <10; i++) {
            list.add(w.readLine());
        }
        for (int i = 1; i <list.size(); i++) {
            if(lengh(list.get(i-1))>=lengh(list.get(i))) {System.out.println(i);break;}
        }
    }
    public static int lengh(String s){
        return s.length();
    }
}

