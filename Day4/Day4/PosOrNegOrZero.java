package com.demo.Day4;
import java.util.Scanner;
public class PosOrNegOrZero {
public static void main(String[] args) {
	int n;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	n=s.nextInt();
	if(n>0)
	{
		System.out.println("Positive Number");
	}
	else if(n==0)
	{
		System.out.println("Zero");
	}
	else
	{
		System.out.println("Negative number");
	}
}
}