package day12;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RetestEmployeeImpl {
	public Map<String, Long> getGenderCount(List<RetestEmployee> list){
		Map<String, Long> map = new HashMap<>();
		
		map = list.stream()
					.collect(Collectors.groupingBy(e -> e.geteGender() , Collectors.counting()));
		
		return map;
		
	}
	public Map<String, Double> getAverageAgeDept(List<RetestEmployee> list){
		Map<String, Double> map = new HashMap<>();
		
		map = list.stream()
					.collect(Collectors.groupingBy(i -> i.geteDept() , Collectors.averagingDouble(emp -> emp.geteAge())));
		
		return map;
		
	}
}
