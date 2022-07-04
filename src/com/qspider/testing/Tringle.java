package com.qspider.testing;

import java.util.Scanner;

public class Tringle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st side");
		int number1 = sc.nextInt();
		System.out.println("Enter 2nd side");
		int number2 = sc.nextInt();
		System.out.println("Enter 3rd side");
		int number3 = sc.nextInt();
		if((number1==number2)&&(number2==number3))
		{
			System.out.println("equlitral  Triangle");
		}
		else if((number1==number2) || (number2==number3)|| (number1==number3))
		{
			System.out.println("isoscale triqangle");
		}
		else
		{
			System.out.println("Scalane Tringle");
		}
		

	}

}
