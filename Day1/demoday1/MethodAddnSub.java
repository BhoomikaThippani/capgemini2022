package com.demoday1;
import java.util.*;
class Operation {
	void add(int a,int b) {
		System.out.println("The sum of given two number is "+(a+b));
	}
}

public class MethodAddnSub {
	public static void main(String args[]) {
		
		System.out.println("Enter two numbers to add:");
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b = sc.nextInt();
		Operation c = new Operation();
		//calling the method
		c.add(a,b);

	}

	

}
