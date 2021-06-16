//reads a line of integers and then displays each integer and the sum of all integers
package labBook;

import java.io.*;

public class Lab3Ex5 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter text : ");
		String txt = br.readLine();
		int charCount = 0, wordCount = 0, lineCount = 0;

		charCount = txt.length();

		String[] wordList = txt.split(" ");
		wordCount = wordList.length;
		wordCount = txt.split(" ").length;

		String[] lineList = txt.split(".");
		lineCount = lineList.length;

		System.out.println("Number of Character : " + charCount 
				+ "\nNumber of Words : " + wordCount
				+ "\nNumber of Lines : " + lineCount);
	}

}
