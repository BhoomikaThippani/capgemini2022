package com.demo.Day11;

import java.util.ArrayList;
import java.util.List;
public class ForEach {
	public static void  main(String ar[]) {
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Rita");
		memberNames.add("Geeta");
		memberNames.add("Seeta");
		memberNames.add("Sheela");
		memberNames.add("Teena");
		memberNames.add("Reena");
		memberNames.add("Meena");
		memberNames.add("Sona");
		
		memberNames.forEach(System.out::println);
	}
}
