package day12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamApiDemo2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(45, 56, 46, 78, 95, 63, 20, 48, 96, 17, 36, 47, 25);
		
		int max = list.stream()
							.max((n1,n2) -> n1.compareTo(n2))
							.get();
		System.out.println("Max : "+max);
		System.out.println("Min : "+list.stream().min((n1,n2) -> n1.compareTo(n2)).get());
		
		System.out.println();
		System.out.println(list.stream().count());
		System.out.println();
		System.out.println("//Even Numbers from the list");
		//Even Numbers from the list
		list.stream()
				.filter(n -> n%2 == 0)
				.forEach(System.out::println);
		
		System.out.println();
		System.out.println("//Odd numbers from 1 to 15");
		//Odd numbers from 1 to 15
		IntStream.range(1, 15)
					.filter(n -> n%2 != 0)
					.forEach(System.out::println);
		
		
		
		
	}

}
