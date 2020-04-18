package com.javarush.task.task01.task0133;

/* 
Не думать о секундах…
*/

public class Solution {
    public static void main(String[] args) {
        int secondsAfter15 = 0;
        secondsAfter15 =secondsAfter15(15.00,15.30);
        System.out.println(secondsAfter15);
    }
    public static int secondsAfter15(double t1,double t2){
        int t= (int)((t2-t1)*100);
        return t*60;

    }
}