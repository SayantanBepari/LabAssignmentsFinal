package day12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamApiEmployeeDemo {

	public static void main(String[] args) {
		ArrayList<Employee_ISD> list = new ArrayList<>();
		list.add(new Employee_ISD(56,"Sayantan", 6401.26));
		list.add(new Employee_ISD(28, "Alex", 4568.26));
		list.add(new Employee_ISD(34, "Zoe", 4584.529));
		list.add(new Employee_ISD(28, "Teso", 7123.36));
		list.add(new Employee_ISD(28, "Abes", 5695.4555));
		list.add(new Employee_ISD(28, "Abes", 5595.4555));
		list.add(new Employee_ISD(34, "Aain", 4412.082));
		list.add(new Employee_ISD(21, "Aco", 8125.614));
		
		
		System.out.println(list.stream()
					.map(Employee_ISD::getSalary)
					.reduce(0.0,(a,b)->(a+b))   );
		
		
		
		list.stream()
				.filter(e -> e.getEmpId()>20)
				.map(Employee_ISD::getEmpName)				//.map(e -> e.getEmpName())
				.forEach(System.out::println);
		System.out.println("\n");
		list.stream()
				.filter(emp -> emp.getEmpName().startsWith("A"))
				.sorted(Comparator.comparing(Employee_ISD::getEmpId))
				.forEach(System.out::println);
		
		System.out.println("\nSorting by salary");
		list.stream()
				.sorted(Comparator.comparing(Employee_ISD::getSalary))
				.forEach(System.out::println);
		
		System.out.println("\nExp");
		list.stream()
				.filter(emp -> emp.getSalary()>4500)
				.filter(emp -> emp.getEmpName().charAt(0)=='A')
				.sorted(Comparator.comparing(Employee_ISD::getEmpId)
						.thenComparing(Employee_ISD::getEmpName)
						.thenComparing(emp -> emp.getSalary()))
				.forEach(System.out::println);
		
		
				//.forEach(System.out::println);
	System.out.println(
				list.stream()
				//.filter(e -> e.getEmpId()==28)
				.collect(Collectors.groupingBy(emp -> emp.getEmpId(),
						Collectors.averagingDouble(emp-> emp.getSalary()))));
				//.forEach(System.out::println);
				//.mapToDouble(emp-> emp.getSalary()).avera
				//.getAsDouble()
			
		Map<Integer,Long> idCount = list.stream()
												.collect(Collectors.groupingBy(Employee_ISD::getEmpId,
														Collectors.counting()));
		System.out.println(idCount);
				
		
	}

}
