package com.demo.Day4;

import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) {

	    int num;
	    boolean flag = false;
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter the number");
	    num=s.nextInt();
	    for (int i = 2; i <= num / 2; ++i) {
	      // condition for nonprime number
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	  }
	
}
