package com.qspider.testing;

import java.util.Arrays;

public class SmallestAndLargest {

	public static void main(String[] args) {
		int a[] = {10,20,30,40,-99,80};
		int largest = a[0]; //10
		int smallest = a[0]; //10
		for(int i = 1; i<a.length;i++)
		{
			if(a[i]>largest) {
				largest = a[i];
				}
			else if(a[i]<smallest) {
				smallest = a[i];
			}
		}
		
		System.out.println("given array is :"+ Arrays.toString(a));
		System.out.println("largest :"+largest);
		System.out.println("smallest :"+smallest);
		
	}

}
