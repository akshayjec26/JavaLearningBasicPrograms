package com.qspider.testing;

import java.util.Arrays;

public class SumOfArray {

	public static void main(String[] args) {
		int a[] = {10,20,30,40};
		//System.out.println(a[0]+a[1]+a[2]+a[3]);
		int sum =0;
		/*for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			
		}*/
		
		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<a.length;i++)
		{
			sum = sum+a[i];
			
			
		}
		System.out.println("Sum of arrar is "+sum);
		System.out.println("Average is Array is "+(sum/a.length));
	}

}
