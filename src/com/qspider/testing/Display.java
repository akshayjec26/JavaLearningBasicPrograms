package com.qspider.testing;

import java.util.Arrays;
import java.util.Scanner;

public class Display {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int a[]= new int [size];
		System.out.println("Enter the elements of array");
		for(int i=0;i<size;i++)
		{
			a[i] = sc.nextInt();
			
		}
		/*for(int i=0;i<size;i++)
		{
		
			System.out.println(a[i]);
		}*/
		System.out.println("Array is: "+Arrays.toString(a));
		
		

	}

}
