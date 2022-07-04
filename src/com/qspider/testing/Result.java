package com.qspider.testing;

import java.util.Scanner;

public class Result {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Marks");
		int number = sc.nextInt();
		if(number<35)
		{
			System.out.println("you are fail");
		}
		else if(number>35 && number<65)
		{
			System.out.println("2nd class");
		}
		else if(number>65 && number<80)
		{
			System.out.println("1st class");
		}
		else if(number>80 && number<100)
		{
			System.out.println("ist with distinction");
		}
		else
		{
			System.out.println("invalid input");
		}
	}

}
