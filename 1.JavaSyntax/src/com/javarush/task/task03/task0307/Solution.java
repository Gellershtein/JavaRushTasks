package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg zname1= new Zerg();
        zname1.name="zname1";
        Zerg zname2= new Zerg();
        zname2.name="zname2";
        Zerg zname3= new Zerg();
        zname3.name="zname3";
        Zerg zname4= new Zerg();
        zname4.name="zname4";
        Zerg zname5= new Zerg();
        zname5.name="zname5";

        Protoss pr1 = new Protoss();
        pr1.name="pr1";
        Protoss pr2 = new Protoss();
        pr2.name="pr2";
        Protoss pr3 = new Protoss();
        pr3.name="pr3";


        Terran ter1 = new Terran();
        ter1.name="1";
        Terran ter2 = new Terran();
        ter2.name = "2";
        Terran ter3 = new Terran();
        ter3.name = "3";
        Terran ter4 = new Terran();
        ter4.name = "4";
        //напишите тут ваш код

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
