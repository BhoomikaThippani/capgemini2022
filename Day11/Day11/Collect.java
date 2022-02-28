package com.demo.Day11;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Collect { 
	public static void  main(String ar[]) {
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Bhoomika");
		memberNames.add("Sana");
		memberNames.add("Vyshnavi");
		memberNames.add("Sruthi");
		memberNames.add("Sathvika");
		memberNames.add("Bhargavi");
		memberNames.add("Swathi");
		memberNames.add("Sai sree");
		memberNames.add("Nikki");
		List<String> memNamesInUppercase = memberNames.stream().sorted()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

          System.out.print(memNamesInUppercase);
	}
}
