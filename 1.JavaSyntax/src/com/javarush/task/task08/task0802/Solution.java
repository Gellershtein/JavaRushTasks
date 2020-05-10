package com.javarush.task.task08.task0802;

/* 
Map из 10 пар
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Map<String, String> par = new HashMap<String, String>(); //напишите тут ваш код
        par.put("арбуз","ягода");
        par.put("банан","трава");
        par.put("вишня","ягода");
        par.put("груша","фрукт");
        par.put("дыня","овощ");
        par.put("ежевика","куст");
        par.put("жень-шень","корень");
        par.put("земляника","ягода");
        par.put("ирис","цветок");
        par.put("картофель","клубень");

        for (Map.Entry<String,String> pair: par.entrySet()) {
                String key = (String) pair.getKey();
                String value = (String) pair.getValue();
            System.out.println(key +" - " + value);
        }
    }
}
