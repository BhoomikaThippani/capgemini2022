package com.demo.Day11;

import java.util.ArrayList;
import java.util.List;

public class Filter { 
	public static void  main(String ar[]) {
		
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Abc");
		memberNames.add("def");
		memberNames.add("ghi");
		memberNames.add("jkl");
		memberNames.add("mno");
		memberNames.add("pqr");
		memberNames.add("stu");
		memberNames.add("Avw");
	
		memberNames.stream().filter((s) -> s.startsWith("A")).forEach(System.out::println);

	}
}