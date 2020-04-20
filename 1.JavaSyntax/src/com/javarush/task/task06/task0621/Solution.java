package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
The cat's name is дедушка Вася, no mother, no father
The cat's name is бабушка Мурка, no mother, no father
The cat's name is папа Котофей, no mother, father is дедушка Вася
The cat's name is мама Василиса, mother is бабушка Мурка, no father
The cat's name is сын Мурчик, mother is мама Василиса, father is папа Котофей
The cat's name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String GFatherName = reader.readLine();
        Cat catGFather = new Cat(GFatherName,null,null,null,null);

        String GMotherName = reader.readLine();
        Cat catGMother = new Cat(GMotherName,null,null,null,null);

        String FatherName = reader.readLine();
        Cat catFather = new Cat(FatherName, catGFather,null,null,null);

        String MotherName = reader.readLine();
        Cat catMother = new Cat(MotherName,null, catGMother,null,null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName,null,null,catFather, catMother);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName,null,null,catFather, catMother);

        System.out.println(catGFather);
        System.out.println(catGMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);

    }

    public static class Cat {
        private String name;
        private Cat parent,parent2,parent3,parent4;


//        Cat(String name) {
//            this.name = name;
//        }
//
//        Cat(String name, Cat parent) {
//            this.name = name;
//            this.parent = parent;
//        }
        Cat(String name, Cat parent, Cat parent2,Cat parent3, Cat parent4) {
            this.name = name;
            this.parent = parent;
            this.parent2=parent2;
            this.parent3 = parent3;
            this.parent4=parent4;

        }

        @Override
        public String toString() {
            if (parent == null&&parent2 == null&&parent3 == null&&parent4 == null)
                return "The cat's name is " + name + ", no mother, no father ";
            else if(parent != null&&parent2 == null&&parent3 == null&&parent4 == null) return "The cat's name is " + name + ", no mother, father is " + parent.name;
                else if(parent == null&&parent2 != null&&parent3 == null&&parent4 == null) return "The cat's name is " + name + ", mother is "+ parent2.name+", no father";
                    else if(parent == null&&parent2 == null&&parent3 != null&&parent4 != null) return "The cat's name is " + name + ", mother is " + parent4.name+", father is " + parent3.name;
                        else return null;
        }
    }
}

