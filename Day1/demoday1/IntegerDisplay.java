package com.demoday1;
import java.util.Scanner;

public class IntegerDisplay {
	public static void main(String args[])
	{
		int num;
		System.out.println("Enter the integer");
		//create Scanner object
		Scanner s=new Scanner(System.in);
		//read the number from the keyboard
		num=s.nextInt();
		System.out.println("Entered number is "+num);
	}

}
