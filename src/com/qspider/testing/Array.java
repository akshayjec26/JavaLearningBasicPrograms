package com.qspider.testing;

public class Array {

	public static void main(String[] args) {
		/*int a[] = new int [4];
		a[0]=10;
		a[1]=20;
		a[2]=44;
		a[3]=55;*/
		int a[] = {10,20,44,55};
		int s=a.length;
		
		System.out.println(a.length);
		for(int i=0;i<s;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Reverse array");
		for(int i=s-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		
	}

}
