package com.qspider.testing;

public class ReverseString {

	public static void main(String[] args) {
	String s = "Akshay";
	String res ="";
	int len = s.length();
	for(int i=len-1;i>=0;i--) {
		res = res + s.charAt(i);
	}
	System.out.println(s);
	System.out.println(res);
	//if(s.equals(res)) {
	//	System.out.println("this is palindrome");
	//}
	//else {
		//System.out.println("this is not palindrome");
	//}

	}
   
}
