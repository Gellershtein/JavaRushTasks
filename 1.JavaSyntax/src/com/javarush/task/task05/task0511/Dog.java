package com.javarush.task.task05.task0511;

/* 
Создать класс Dog
*/

public class Dog {
    String name,color;
    int height;
    public void initialize(String name){
        this.name=name;
    }

    public void initialize(String name,int heigth){
        this.name=name;
        this.height=heigth;
    }
    public void initialize(String name,int height, String color){
        this.name=name;
        this.height=height;
        this.color=color;

    }

    public static void main(String[] args) {

    }
}
