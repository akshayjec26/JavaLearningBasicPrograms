package com.qspider.testing;

public class SumOfArray1 {

	public static void main(String[] args) {
	 int a[] = {10,20,30,40};
	 int b[] = {5,6,7,8,};
	 
	 int c[]=new int [a.length];
	 for(int i=0;i<a.length;i++)
	 {
		 c[i] = a[i]+b[i];
				 
	 System.out.println(c[i]);
	 }
	}

}
