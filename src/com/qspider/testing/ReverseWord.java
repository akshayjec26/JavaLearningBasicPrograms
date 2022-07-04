package com.qspider.testing;

public class ReverseWord {

	public static void main(String[] args) {
		System.out.println("this is sentance");
		String []s ="This is a boy".split(" ");
		String output ="";
		
		for(int i=s.length-1;i>=0;i--) {
			output += s[i]+" ";
			
		}
	      
		System.out.println("The reverse sentence is :"+ output);
		

	}

}
