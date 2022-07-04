package com.qspider.testing;

import java.util.Scanner;

public class PositiveAndNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int number = sc.nextInt();
		if(number<0)
		{
			System.out.println("negative number");
		}
		else if(number==0)
		{
			System.out.println("equal to zero");
		}
		 else
		 {
			 System.out.println("number is positive");
		 }
	}

}
