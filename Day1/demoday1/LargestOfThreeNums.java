package com.demoday1;

public class LargestOfThreeNums {
	public static void main(String args[]) {
		double n1=7908,n2=765435,n3=6542;
		if(n1>=n2 && n1>=n3)
		{
			System.out.println(n1 + "is the largest number");
			
		}
		else if(n2>=n1 && n2>=n3)
		{
			System.out.println(n2 + "is the largest number");
		}
		else
		{
			System.out.println(n3+"n3 is the largest number");
		}

	}

}
