package com.demo.stringsdemo;

public class compareTo {
	public static void main(String args[]){  
		String s1="hello";  
		String s2="hello";  
		String s3="mankind";  
		String s4="history";  
		String s5="flow";  
		System.out.println(s1.compareTo(s2));//0 because both are equal  
		System.out.println(s1.compareTo(s3));//-5 because "h" is 5 times lower than "m"  
		System.out.println(s1.compareTo(s4));//-4 because "e" is 4 times lower than "i"  
		System.out.println(s1.compareTo(s5));//2 because "h" is 2 times greater than "f"  
		}

}
//s1<s2===>negative(s2-s1)
//s1>s2===>positive(s1-s2)
//s1==s2===>returns 0