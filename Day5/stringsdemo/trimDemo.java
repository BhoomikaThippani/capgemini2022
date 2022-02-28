package com.demo.stringsdemo;

public class trimDemo {
public static void main(String args[])
{
	String s1="   Bhoomika is a good girl ";
	System.out.println(s1);     //prints as it is
	
	String s2="   Bhoomika is a good girl  ";
	System.out.println(s2.trim());   //trims the leading and ending spaces
}
}



//a trim() method removes whitespace from both ends of a string.
//It does not change the original string.