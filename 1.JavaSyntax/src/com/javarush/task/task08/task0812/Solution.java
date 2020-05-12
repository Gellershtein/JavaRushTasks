package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        List<Integer> ch = new ArrayList<Integer>();//напишите тут ваш код


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            int x = Integer.parseInt(reader.readLine());
            ch.add(x);
        }
        int count = 1, max = 1;
        for (int i = 0; i < ch.size()-1; i++) {
            if (ch.get(i).equals(ch.get(i + 1))) {
                count++;
                if (max < count) max = count;
            }
                else count = 1;
        }
        System.out.println(max);
    }

}
