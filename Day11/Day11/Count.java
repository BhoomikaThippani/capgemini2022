package com.demo.Day11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Count {
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
		long totalMatched = memberNames.stream().filter((s) -> s.contains("t")).count();
		 
		System.out.println(totalMatched);
}
}
