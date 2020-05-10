package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human GF = new Human("Ded1",true,43);
        System.out.println(GF.toString());
        Human GF2 = new Human("Ded2",true,43);
        System.out.println(GF2.toString());
        Human GM1 = new Human("Bab1",false,40);
        System.out.println(GM1.toString());
        Human GM2 = new Human("Bab2",false,40);
        System.out.println(GM2.toString());
        Human father = new Human("Father",true,23,GF,GM1);
        System.out.println(father.toString());
        Human mother = new Human("Mother",false,20,GF2,GM2);
        System.out.println(mother.toString());
        Human sun1 = new Human("Sun",true,3,father,mother);
        System.out.println(sun1.toString());
        Human sun2 = new Human("Sun2",true,3,father,mother);
        System.out.println(sun2.toString());
        Human douth = new Human("Dough",false,0,father,mother);
        System.out.println(douth.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father,mother;

        public Human(String name, boolean sex, int age) {
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.father= null;
            this.mother= null;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.father= father;
            this.mother= mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}