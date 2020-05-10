package com.javarush.task.task08.task0801;

/* 
Set из растений
*/

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Set<String> ros = new HashSet<String>();//напишите тут ваш код
        ros.add("арбуз");
        ros.add("банан");
        ros.add("вишня");
        ros.add("груша");
        ros.add("дыня");
        ros.add("ежевика");
        ros.add("женьшень");
        ros.add("земляника");
        ros.add("ирис");
        ros.add("картофель");
        for (String sRos: ros) {
            System.out.println(sRos);
        }
    }
}
