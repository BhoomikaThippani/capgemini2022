package com.demo.stringsdemo;

public class equalsDemo {
	public static void main(String args[]){  
		String s1="Bhoomika";  
		String s2="Bhoomika";  
		String s3="BHOOMIKA";  
		String s4="Student";  
		System.out.println(s1.equals(s2));//true because content and case is same  
		System.out.println(s1.equals(s3));//false because case is not same  
		System.out.println(s1.equals(s4));//false because content is not same  
		}

}
