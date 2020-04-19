package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("Nik",11,"mv");
        Man man2 = new Man ("Tom",12,"km");
        printM(man1);
        printM(man2);
        Woman woman1 = new Woman("kate",18,"pob");
        Woman woman2 = new Woman ("Anna",28,"sex");
        printW(woman1);
        printW(woman2);
        //напишите тут ваш код
    }
    public static void printM(Man a){
        System.out.println(a.name + " "+a.age+" "+a.address);
    }
    public static void printW(Woman a){
        System.out.println(a.name + " "+a.age+" "+a.address);
    }
   public static class Man {
       String name, address;
       int age;

       public Man(String name) {
           this.name=name;
       }
       public Man (String name,int age){
           this.name=name;
           this.age=age;
       }
       public Man (String name,int age,String address){
           this.name=name;
           this.age=age;
           this.address=address;
       }
   }
    public static class Woman {
        String name, address;
        int age;

        public Woman(String name) {
            this.name=name;
        }
        public Woman (String name,int age){
            this.name=name;
            this.age=age;
        }
        public Woman (String name,int age,String address){
            this.name=name;
            this.age=age;
            this.address=address;
        }
    }
}
