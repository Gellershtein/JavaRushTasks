package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }


    public Cat(int i, int i1, int i2) {
        this.age = i;
        this.weight =i1;
        this.strength=i2;
    }

    public boolean fight(Cat anotherCat) {
        int vcat1=0,vcat2 = 0;
        if (this.weight>anotherCat.weight)vcat1+=1;
        else if(this.weight<anotherCat.weight) vcat2+=1;
        if(this.age>anotherCat.age) vcat1+=1;
        else if(this.age<anotherCat.age) vcat2+=1;
        if (this.strength>anotherCat.strength) vcat1+=1;
        else if(this.strength<anotherCat.strength) vcat2+=1;
        if(vcat1==vcat2) return true;
        else return vcat1>vcat2;
    }

    public static void main(String[] args) {
      Cat cat1= new Cat(12,12,12);
      Cat cat2=new Cat(12,12,12);
        System.out.println(cat2.fight(cat1));
    }
}