package com.demo.stringsdemo;

public class equalsIgnoreCase {
	public static void main(String args[]){  
		String s1="Bhoomika";  
		String s2="Bhoomika";  
		String s3="BHOOMIKA";  
		String s4="BHoomika";
		String s5="student";
		System.out.println(s1.equalsIgnoreCase(s2));//true because content and case both are same  
		System.out.println(s1.equalsIgnoreCase(s3));//true because case is ignored  
		System.out.println(s1.equalsIgnoreCase(s4));//true because case is ignored 
		System.out.println(s1.equalsIgnoreCase(s5));//false
	}
}


//equalsIgnoreCase() checks only content of the string, it ignores the case.
