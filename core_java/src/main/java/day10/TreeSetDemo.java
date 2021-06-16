package day10;


import java.util.Set;
import java.util.TreeSet;



public class TreeSetDemo {

	public static void main(String[] args) {
		
		Set<Product_ISD> set = new TreeSet<>();
		
		set.add(new Product_ISD(1,"lemon",41.333));
		set.add(new Product_ISD(15,"chai",65.3));
		set.add(new Product_ISD(11,"apple",459.33));
		set.add(new Product_ISD(5,"tea",45.3));
		set.add(new Product_ISD(1,"lemon",41.33));
		set.add(new Product_ISD(19,"lemon",45.73));
		set.add(new Product_ISD(1,"tea",45.3));
		set.add(new Product_ISD(19,"lemon",45.73));
		
	
		
		System.out.println("size = "+set.size());
		for(Product_ISD p: set)
		{
			System.out.println(p);
		}
	}

}


