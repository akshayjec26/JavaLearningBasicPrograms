package com.qspider.testing;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int number1 = sc.nextInt();
		System.out.println("Enter the 2nd value");
		int number2 = sc.nextInt();
		System.out.println("Enter choice Add(+),sub(-),mul(*),div(/)");
		char ch = sc.next().charAt(0);
		switch(ch)
		{
		case '+' :System.out.println("Addition: "+(number1 + number2));
		break;
		
		case '-' :System.out.println("Substraction: "+(number1 - number2));
		break;
		case '*':System.out.println("Multipilication: "+(number1 * number2));
		break;
		case '/':System.out.println("Division: "+(number1 / number2));
		break;
		default:System.out.println("nvalid input");
		}

	}

}
