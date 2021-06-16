//Create a class containing a method to create the mirror image of a String
package labBook;

import java.io.*;

public class Lab3Ex2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string : ");
		String str = br.readLine().toUpperCase();
		System.out.println(getImage(str));
	}

	private static String getImage(String str) {
		StringBuilder sb = new StringBuilder(str);
		String miror = sb + "|" + sb.reverse();
		return miror;
	}

}
