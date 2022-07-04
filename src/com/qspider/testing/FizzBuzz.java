package com.qspider.testing;


public class FizzBuzz {

	public static void main(String[] args) {
		int i =89;
		
		
			if(i%3 ==0 && i%5 ==0 ) {
				System.out.println("FizzzBuzz");
			}
			else if(i%3 ==0) {
				System.out.println("Fizz");
			}
			else if(i%5 ==0) {
				System.out.println("BUzz");
			}
			else {
				System.out.println(i);
			}
		

	}

}
