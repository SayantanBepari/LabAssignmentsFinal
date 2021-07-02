package day12;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamApiDemo1 {

	public static void main(String[] args) {
		List<String> city = Arrays.asList("Kolkata","Kochin","Chennai","Mumbai","Pune","Delhi","Mysore","Austrilia");
		
		city.stream()
				.filter(c -> c.startsWith("M"))
				.map(cty -> cty.toUpperCase())
				.forEach(System.out::println);
		/*
		 * Set<String> kcity = city.stream() .filter(cty -> cty.startsWith("u", 1))
		 * .map(cty -> cty.toLowerCase()) //.forEach(System.out::println)
		 * .collect(Collectors.toSet());
		 */
		//System.out.println(kcity);
										
		System.out.println(city.stream()
				.filter(cit -> cit.startsWith("K"))
				.map(cit -> cit+" demo")
				.collect(Collectors.toSet()));
		
		
		
		
		//kcity.forEach(System.out::println);
		
		long count = city.stream().count();
		System.out.println(count);
		
		System.out.println(city.stream()
								.filter(cty -> cty.startsWith("K"))
								.count());
		
		city.stream()
				.map(cty -> cty.toUpperCase()+" Sayantan")
				.sorted()
				.forEach(System.out::println);
		
	
	}

}
