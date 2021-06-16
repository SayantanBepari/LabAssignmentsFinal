//Create a method which accepts a hash map and return the values of the map in sorted order as a List.
package labBook;

import java.util.ArrayList;
import java.util.HashMap;

public class Lab6Ex1 {
	public static void main(String[] args) {
	
		HashMap<Integer,String> map = new HashMap<>();
		map.put(10, "Sayantan");
		map.put(14, "Suparna");
		map.put(45,"Abish" );		
		map.put(25, "Zoe");

		System.out.println(map);
		System.out.println(getValues(map));
		
		

}
	
	public static ArrayList<String> getValues(HashMap map){
		ArrayList<String> sortedList = new ArrayList<>(map.values());
		sortedList.sort(null);
		return sortedList;
		
	}
}
