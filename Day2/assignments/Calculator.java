package com.demo.assignments;
import java.util.*;

public class Calculator {
	  static double  powint(int a,int b)
	    {
	        return Math.pow(a,b);
	    }
	    static double powdob(double a,int b)
	    {
	        return Math.pow(a,b);
	    }


	    public static void main(String[] args) {
	        System.out.println("powerint:"+Calculator.powint(5,2)+"\npower double:"+Calculator.powdob(2.0,2));
	    }
}