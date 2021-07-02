package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RetestEmployeeMain {

	public static void main(String[] args) {
		RetestEmployee emp1 = new RetestEmployee("Sayantan","Male","IT",27.9);
		RetestEmployee emp2 = new RetestEmployee("Alex","Male","IT",43.5);
		RetestEmployee emp3 = new RetestEmployee("Maria","Female","Sales",23.2);
		RetestEmployee emp4 = new RetestEmployee("Malini","Female","Sales",31.5);
		RetestEmployee emp5 = new RetestEmployee("Srinivas","Male","CEO",23.4);
		
		List<RetestEmployee> list = Arrays.asList(emp1, emp2, emp3, emp4, emp5);
		
		RetestEmployeeImpl obj = new RetestEmployeeImpl();
		System.out.println(obj.getGenderCount(list));
		System.out.println();
		System.out.println(obj.getAverageAgeDept(list));
		

	}

}
