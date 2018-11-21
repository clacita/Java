package com.cybertek.package1;
//import com.cybertek.package2.*; //option 1. easiest way to fix the problem
//import com.cybertek.package2.Class2; //option 2. but if you want to use a different class from that same package, again it will complain.It is not efficient. 
//import com.cybertek.package2.Class3;

public class Class1 {

	public static void main(String[] args) {
		//There are 3 ways to access package from outside the package:
		//1. Import package.*;
		//2. import package.className;
		//3. fully qualified name
		
		//option 3
		com.cybertek.package2.Class2 cl2 = new com.cybertek.package2.Class2(); //not very efficient but it also works
		
//		Class2 cl = new Class2(); //if it is in same package, no issue, but if it is in different package, it is a problem 
//		Class3 cl1 = new Class3();
		
	}

}
