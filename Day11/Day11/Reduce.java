package com.demo.Day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
public class Reduce {
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
		Optional<String> reduced = memberNames.stream().reduce((s1,s2) -> s1 + "#" + s2);
		 
		reduced.ifPresent(System.out::println);
	}
}