package com.javarush.task.task04.task0434;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        int i=1,j;
        while (i!=11) {
            j=1;
            while (j!=11){
                System.out.print(i*j+" ");
                if(j==10) System.out.println();
                j++;
            }
            i++;
        }//напишите тут ваш код
        }

    }
