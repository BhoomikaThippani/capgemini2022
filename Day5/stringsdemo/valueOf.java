package com.demo.stringsdemo;

public class valueOf {
	public static void main(String args[]){  
		int value=50;  
		String s1=String.valueOf(value);  //converts 30 to string
		System.out.println(s1+20);//concatenating string with 10 
		
		
		
		 // Boolean to String  
        boolean bol = true;    
        boolean bol2 = false; 
        System.out.println("Before conversion");
        System.out.println(bol);
        System.out.println(bol2);
        System.out.println(bol&&bol2);  //here both are boolean data types so they are combined using &&.And the result is false.
        System.out.println("After converting to Strings");
        String s2 = String.valueOf(bol);    
        String s3 = String.valueOf(bol2);  
        System.out.println(s2);  
        System.out.println(s3);  
        System.out.println(s2+s3);//here both are strings ,so they are concatenated and the result is "truefalse" 
		} 

}

//valueOf method is used to convert any data type to string data type.
