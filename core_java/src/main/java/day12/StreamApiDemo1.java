package day12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiDemo1 {

	public static void main(String[] args) {
		List<String> city = Arrays.asList("Kolkata","Kochin","Chennai","Mumbai","Pune","Delhi","Mysore");
		
		city.stream()
				.filter(c -> c.startsWith("M"))
				.map(cty -> cty.toUpperCase())
				.forEach(System.out::println);
		List<String> kcity = city.stream()
									.filter(cty -> cty.startsWith("u", 1))
									.map(cty -> cty.toLowerCase())
									//.forEach(System.out::println)
									.collect(Collectors.toList());	
		kcity.forEach(System.out::println);
		
		long count = city.stream().count();
		System.out.println(count);
		
		System.out.println(city.stream()
								.filter(cty -> cty.startsWith("K"))
								.count());
		
		city.stream()
				.map(cty -> cty.toUpperCase())
				.sorted()
				.forEach(System.out::println);
		
	
	}

}
