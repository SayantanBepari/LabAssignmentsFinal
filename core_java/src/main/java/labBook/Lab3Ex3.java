package labBook;

import java.io.*;
public class Lab3Ex3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the word : ");
		String str = br.readLine().toLowerCase();
		System.out.println(alterString(str.toCharArray()));
	}

	private static String alterString(char[] str) {
		for(int i=0; i<str.length; i++) {
			if(str[i] == 'z') {
				str[i] = 'b';
			}
			else {
				if(!isVowel(str[i])) {
					str[i] = (char) (str[i]+1);
					if(isVowel(str[i])) {
						str[i] = (char) (str[i]+1);
					}
				}
			}
		}
		return String.valueOf(str);
	}

	private static boolean isVowel(char ch) {
		if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
			return false;
		} 
		return true;
	}

}
