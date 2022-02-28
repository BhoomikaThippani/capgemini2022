package com.demo.stringsdemo;

public class concat {
	public static void main(String args[]){    
		String s1="java string";    
		// The string s1 does not get changed, even though it is invoking the method      
		// concat(), as it is immutable. Therefore, the explicit assignment is required here.  
		s1.concat("is immutable");   
		System.out.println(s1);    //here the string is not changed.
		System.out.println(s1.concat("is immutable"));    
		s1=s1.concat(" is immutable so assign it explicitly");    
		System.out.println(s1);    
		} 

}
