package com.demo.Day4;
import java.util.Scanner;

public class Palindrome {
	   
		 public static void main(String[] args) {
	 
	        int rem, rev= 0, temp;
	        Scanner s=new Scanner(System.in);
	        System.out.println("Enter the number");
	    int n=s.nextInt(); // user defined number to be checked for palindrome 
	 
	        temp = n;
	 
	        // reversed integer is stored in variable 
	        while( n != 0 )
	        {
	            rem= n % 10;
	            rev= rev * 10 + rem;
	            n=n/10;
	        }
	 
	        // palindrome if orignalInteger(temp) and reversedInteger(rev) are equal
	        if (temp == rev)
	            System.out.println(temp + " is a palindrome.");
	        else
	            System.out.println(temp + " is not a palindrome.");
	    }
	}