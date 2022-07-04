package com.qspider.testing;



public class ReverseAndPalindrome {

	public static void main(String[] args) {
		int n = 123456;
		int temp = n;
		int rev = 0,rem;
		while(temp != 0 ) {
			rem = temp%10;
			rev = rev*10+rem;
			temp = temp/10;
		
			
		}
		//if(n == rev) {
		//	System.out.println("number is palindrome");
		//}
		//else {
			//System.out.println("number is not palindrome");
		//}
		System.out.println(rev);
	}

}
