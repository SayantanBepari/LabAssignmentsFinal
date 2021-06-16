package day12;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaDemo2 {

	public static void main(String[] args) {
		Function<Integer, Integer> cube = n -> n*n*n;
		System.out.println("Cube : "+cube.apply(5));
		
		BiFunction<Integer, Integer, Integer> mod = (n1,n2) -> n1 % n2;
		System.out.println("Mod : "+mod.apply(45, 4));
		
		BiFunction<String, Integer, Integer> obj = (str, n) -> Integer.parseInt(str)+n;
		System.out.println("BiFunction : "+obj.apply("123", 20));
		
		BiFunction<Integer, Integer, String> obj1 = (n1, n2) -> n1+" Hello from Sayantan "+n2; 
		System.out.println(obj1.apply(12, 25));
		
		BiFunction<Integer, Integer, String> obj2 = (n1, n2) -> n1+n2+" Hello from Sayantan"; 
		System.out.println(obj2.apply(12, 25));
		
		Predicate<String> tf = str -> str.startsWith("a");
		System.out.println(tf.test("Arnab"));
		
	}

}
