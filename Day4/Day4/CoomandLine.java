package com.demo.Day4;

public class CoomandLine {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length==0) {
			System.out.println("No values");
		}
		else {
			
			for(String i : args)   
				System.out.print(i+" , ");
		}

	}

}
