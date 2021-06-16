//Create a method to check String elements are in ascending order or not
package labBook;
import java.io.*;
import java.util.Arrays;

public class Lab3Ex8 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		if(checkString(str)) {
			System.out.println("Positive String !");
		}
		else {
			System.out.println("Not Positive String !");
		}
		
	}

	private static boolean checkString(String str) {
		char sortedStr[] = str.toCharArray();
		Arrays.sort(sortedStr);
		
		for(int i=0; i<sortedStr.length; i++) {
			if(sortedStr[i] != str.charAt(i)) {
				return false;
			}
		}
		return true;
	}

}
