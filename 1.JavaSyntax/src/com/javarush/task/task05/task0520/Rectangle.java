package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    int top, left, width, height;
    public Rectangle(int left,int  top,int width,int height) {
        this.left=left;
        this.top=top;
        this.width=width;
        this.height=height;
    }
    public Rectangle(int left,int  top) {
        this.left=left;
        this.top=top;
        this.width=0;
        this.height=0;
    }

    public Rectangle(int left,int  top,int width) {
        this.left=left;
        this.top=top;
        this.width=width;
        this.height=width;
    }
    public Rectangle(int width) {
        this.left=0;
        this.top=0;
        this.width=this.height=width;
    }


    public static void main(String[] args) {

    }
}
