package com.company;

import java.util.Scanner;

public class AddTwoWithout {
  public static void main(String[] args) {
    // W.A.P to find Addition of two numbers without using +.
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter first number: ");
    int a = in.nextInt();
    System.out.println("Please enter second number: ");
    int b = in.nextInt();
    // first method
    int c = Math.addExact(a, b);
    // second method
    int d = a - (-b);
    System.out.println("Addition of two numbers: " + c);
    System.out.println("Addition of two numbers: " + d);
  }
}
