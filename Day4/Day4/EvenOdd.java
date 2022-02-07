package com.demo.Day4;
import java.util.Scanner;
public class EvenOdd {
public static void main(String[] args)
{
	int n;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	n=s.nextInt();
if(n%2==0)
{
	System.out.println("Even number");
}
else {
	System.out.println("Odd Number");
}
}
}
