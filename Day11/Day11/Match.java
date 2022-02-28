package com.demo.Day11;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Match { 
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
		
		boolean matchedResult = memberNames.stream()
		        .anyMatch((s) -> s.startsWith("k"));
		 
		System.out.println(matchedResult);   
		 
		matchedResult = memberNames.stream()
		        .allMatch((s) -> s.startsWith("k"));
		 
		System.out.println(matchedResult);    
		 
		matchedResult = memberNames.stream()
		        .noneMatch((s) -> s.startsWith("k"));
		 
		System.out.println(matchedResult);     

}
}