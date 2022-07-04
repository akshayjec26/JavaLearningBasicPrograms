package com.qspider.testing;

public class Swap {

	public static void main(String[] args) {
	int i  = 10;
	int j  = 20;
	
	
	j  = j + i;//20 + 10  =30
	i  =j - i;//30 - 10  = 20 
	j  =j - i;//30 - 20 =10
	 System.out.println(i+" is the swap of j");
	 System.out.println(j+ "is th swap of i");

	}

}
