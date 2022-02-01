package com.demoday1;
import java.util.*;
class Operationn {
	void checkChar(char a) {
		if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u' || a=='A' || a=='E' || a=='I' || a=='O' || a=='U') {
			System.out.println("The given Alphabet is vowel");
		}
		else if(a>'A'&& a<'z') {
			System.out.println("the given Alphabet is a consonant");
		}
		else {
			System.out.println("Invalid Input. Please enter a valid Alphabet");
		}
	}
}

public class MethodVowelOrConsonant {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Alphabet :");
		//reading character from keyboard
		char a = sc.next().charAt(0);
		Operationn c = new Operationn();
		//calling method 
		c.checkChar(a);
	}


}
