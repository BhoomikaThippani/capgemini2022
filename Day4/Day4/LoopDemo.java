package com.demo.Day4;

class Loop {

	void show() {
		// for loop demo
		for (int i = 0; i < 9; i++) {

			System.out.println("numbers" + i);
		}

		// while loop demo
		int i = 0;
		while (i < 9) {

			i++;
			System.out.println("numbers" + i);
		}

		// do while loop

		// while loop demo

		int k=0;
		
		do {
		
			k++;
			System.out.println("numbers" + k);
		} while(k < 9);

	}

}


public class LoopDemo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Loop s=new Loop();
		s.show();

	
	}

}