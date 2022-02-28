package com.demo.stringsdemo;

public class intern {
	public static void main(String Args[]) {
	String st1=new String("hello");  
	String st2="hello";  
	String st3=st1.intern();//returns string from pool, now it will be same as s2  
	System.out.println(st1==st2);//false because reference variables are pointing to different instance  
	System.out.println(st2==st3);//true because reference variables are pointing to same instance 
}
}
