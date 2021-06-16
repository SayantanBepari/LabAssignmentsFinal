package day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaEmpMain {

	public static void main(String[] args) {
		ArrayList<Employee_ISD> list = new ArrayList<>();
		list.add(new Employee_ISD(56,"Sayantan", 456.26));
		list.add(new Employee_ISD(28, "Alex", 4568.26));
		list.add(new Employee_ISD(34, "Zoe", 4584.529));
		list.add(new Employee_ISD(28, "Teso", 71623.36));
		list.add(new Employee_ISD(28, "Abes", 45695.4555));
		list.add(new Employee_ISD(34, "Zila", 4512.082));
		list.add(new Employee_ISD(21, "Cokz", 125.614));
		
		System.out.println("Printing by Lambda :");
		list.forEach(e -> System.out.println(e));
	
		System.out.println("\nSorting by Lambda by EmpId :");
		list.sort((e1,e2) -> (e1.getEmpId() - e2.getEmpId()));
		list.forEach(e -> System.out.println(e));
		
		System.out.println("\nSorting by Lambda by EmpName :");
		Collections.sort(list, (e1, e2) -> e1.getEmpName().compareTo(e2.getEmpName()));
		list.forEach(System.out::println);
		
		System.out.println("\nSorting by Lambda by Salary :");
		Comparator<Employee_ISD> bySal = (e1, e2) ->Double.compare(e1.getSalary(), e2.getSalary());
		Collections.sort(list,bySal);
		list.forEach(System.out::println);
	}

}
