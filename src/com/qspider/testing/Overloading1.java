package com.qspider.testing;

public class Overloading1 {
					void main(String a,int b) {
						System.out.println("i am String and integer value");
					}
					void main(float a,char b) {
						System.out.println("i am float and char value");
					}

	public static void main(String[] args) {
	         Overloading1 aa=new Overloading1();
	         aa.main(4.0f, 'a');

	}

}
