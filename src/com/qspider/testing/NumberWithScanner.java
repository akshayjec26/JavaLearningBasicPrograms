package com.qspider.testing;

import java.util.Scanner;

public class NumberWithScanner {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Any Value");
	int number = sc.nextInt();
	System.out.println("The Value is " + number);
	
	
	for(int i=1;i<=10;i++)
	{
		System.out.println(  number +" X "+ i +"= "+ number*i);
	}

	}

}
