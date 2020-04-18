package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    String name,address,color;
    int age,weight;
    public void initialize(String name){
        this.name = name;
        this.color="default_color";
        this.age=18;
        this.weight=2;
    }
    public void initialize(String name,int weight,int age){
        this.name=name;
        this.weight=weight;
        this.age=age;
        this.color="default_color";
    }
    public void initialize(String name,int age){
        this.name=name;
        this.age=age;
        this.color="default_color";
       this.weight=2;
    }
    public void initialize(int weight,String color){
        this.weight=weight;
        this.color=color;
        this.age=18;
    }
    public void initialize(int weight,String color,String address){
        this.age=18;
        this.color=color;
        this.address=address;
        this.weight=weight;
    }


    public static void main(String[] args) {

    }
}
