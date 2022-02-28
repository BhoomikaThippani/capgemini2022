package com.demo.stringsdemo;

public class splitDemo {
	public static void main(String args[]) {
		String str1="My @name is @Bhoomika";
		String str2="My @name is @Bhoomika";
		String str3="My @name is @Bhoomika";
		System.out.println("---->when the parameter is 1");
		 String[] arrOfStr1 = str1.split("@",1);
	        for (String a : arrOfStr1)
	            System.out.println(a);
	        
	    	System.out.println("---->when the parameter is 2"); 
	        String[] arrOfStr2 = str2.split("@",2);
	        for (String a : arrOfStr2)
	            System.out.println(a);
	        
	    	System.out.println("---->when the parameter is 3");
	        String[] arrOfStr3 = str3.split("@",3);
	        for (String a : arrOfStr3)
	            System.out.println(a);
	}

}