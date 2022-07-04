package com.qspider.testing;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int number1 = sc.nextInt();
        System.out.println("Enter 2nd number");
        int number2 = sc.nextInt();
        System.out.println( "Addition: "+ (number1 + number2));
        System.out.println("Multiplication: "+(number1 * number2));
    	System.out.println("Subtraction: " +(number1 - number2)); 
		System.out.println("Division:" +(number1 / number2));

	}

}
