package com.qspider.testing;

import java.util.Scanner;

public class NameWithScanner {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter your name");
	String name = sc.nextLine();

	System.out.println("my name is " + name);

	}

}
