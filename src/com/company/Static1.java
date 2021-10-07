package com.company;


class Class1{
    static int a = 3;
    final static int b = 4;
    static final int c = 5;
    static void fun(){
        System.out.println("Welcome to java!");
    }

}
public class Static1 {
    public static void main(String args[]){
        System.out.println(Class1.a);
        System.out.println(Class1.b);
        System.out.println(Class1.c);
        Class1.fun();
    }

}
