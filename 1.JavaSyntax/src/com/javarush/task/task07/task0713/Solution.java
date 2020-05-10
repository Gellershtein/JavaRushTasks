package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       ArrayList<Integer> all = new ArrayList<>(); //напишите тут ваш код
        ArrayList<Integer> x3= new ArrayList<>();
        ArrayList<Integer> x2=new ArrayList<>();
        ArrayList<Integer> other = new ArrayList<>();
        BufferedReader ch = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <20 ; i++) {
            int x = Integer.parseInt(ch.readLine());
            all.add(x);
            if(x%3==0) x3.add(x);
            if(x%2==0) x2.add(x);
            if (x%3!=0&&x%2!=0) other.add(x);
        }
        System.out.println("список Х%3");
        printList(x3);
        System.out.println("список Х%2");
        printList(x2);
        System.out.println("другие");
        printList(other);
    }

    public static void printList(ArrayList<Integer> list) {
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }//напишите тут ваш код
    }
}
