package com.qspider.testing;

import java.util.Scanner;

public class Table3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value");
		int number = sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(number +" X "+i+ " = "+ number*i);
		} 

	}

}
