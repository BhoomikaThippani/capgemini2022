package com.demo.stringsdemo;
import java.util.*;

public class isEmpty {
	    public static void main(String[] args)
	    {
	        // creating an Empty Integer List
	        List<Integer> arr = new ArrayList<Integer>(10);
	        
	          // checking if the list is empty or not
	      boolean ans = arr.isEmpty();
	        if (ans == true)
	            System.out.println("The List is empty");
	        else
	            System.out.println("The List is not empty");
	  
	        // addition of a element to the list
	        
	        arr.add(3);
	        arr.add(1);
	        arr.add(-4);
	  
	        // check if the list is empty or not
	        // after adding elements
	        ans = arr.isEmpty();
	        if (ans == true)
	            System.out.println("The List is empty");

	        else
	            System.out.println("The List is not empty");
	        System.out.println(arr);
	    }
	}
