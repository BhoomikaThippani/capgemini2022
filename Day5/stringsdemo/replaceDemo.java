package com.demo.stringsdemo;

public class replaceDemo {
	public static void main(String args[]){  
		String s1="I am a Student";  
		String replaceString=s1.replace('a','e');//replaces all occurrences of 'a' to 'e'  
		System.out.println(replaceString);
		
		
		String s2="I am doing java programs";  
		String replaceString2=s2.replace("am","was");//replaces all occurrences of 'am' to 'was'  
		System.out.println(replaceString2);  
		
}
}