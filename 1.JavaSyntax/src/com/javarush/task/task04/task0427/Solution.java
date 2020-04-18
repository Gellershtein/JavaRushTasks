package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader a1 = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(a1.readLine());
        if (a>0&&a<1000) {
            System.out.println(
                    a > 0 && a < 10 && a % 2 == 0 ? "четное однозначное число" :
                    a > 0 && a < 10 && a % 2 != 0 ? "нечетное однозначное число" :
                            a > 9 && a < 100 && a % 2 == 0 ? "четное двузначное число" :
                            a > 9 && a < 100 && a % 2 != 0 ? "нечетное двузначное число" :
                                    a > 99 && a < 1000 && a % 2 == 0 ? "четное трехзначное число" :
                                    a > 99 && a < 1000 && a % 2 != 0 ? "нечетное трехзначное число" : "тут нет разницы что написать" );
        }
//        check(a);
    }

//    public static void check(int a){
//    System.out.println(a>=1&&a<10&&a%2==0?"четное однозначное число":a>0&&a<10&&a%2!=0?"не четное однозначное число":"");
//    System.out.println(a>=10&&a<100&&a%2==0?"четное двухзначное число":a>=10&&a<100&&a%2!=0?"не четное двухзначное число":"");
//    System.out.println(a>=100&&a<1000&&a%2==0?"четное трехзначное число":a>=100&&a<1000&&a%2!=0?"не четное трехзначное число":"");
//                  }

    }
