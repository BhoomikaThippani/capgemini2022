package com.demo.assignments;

public class Box {
	 public void initialize(double h,double b,double l)
	    {
	        double height=h, breadth=b,length=l;
	    }
	    public double volume(double h,double b,double l)
	    {
	        return h*b*l;
	    }
	    public static void main(String[] args) {
	        Box b=new Box();
	        b.initialize(5,2,5);
	        System.out.println("volume:"+b.volume(5,2,5));
	    }


}
