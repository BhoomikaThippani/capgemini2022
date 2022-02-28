package com.demo.stringsdemo;

public class startsWith {
	   
	// main method  
	public static void main(String args[])  
	{    
	// input string  
	String s1="my name is Bhoomika";    
	System.out.println(s1.startsWith("my"));  // true  
	System.out.println(s1.startsWith("my name"));   // true  
	System.out.println(s1.startsWith("My name is"));  // false as 'm' and 'M' are different   
	System.out.println(s1.startsWith("y",1)); //true
	System.out.println(s1.startsWith(" ",2));  //true,space is also a character
	System.out.println(s1.endsWith("Bhoomika"));//true
	System.out.println(s1.endsWith("Mika"));//false because 'm' and 'M' are not same
	System.out.println(s1.endsWith("a"));//true
	}    
}
