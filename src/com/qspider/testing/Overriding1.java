package com.qspider.testing;



class Demo1{
	void main(int a) {
		System.out.println("print value1");
	}
}
class Demo2 extends Demo1{
	void main(int a) {
		System.out.println("print value2");
	}
}

public class Overriding1 {
	

	public static void main(String[] args) {
		
         Demo2 aa = new Demo2();
         aa.main(1);
         
	}

}
