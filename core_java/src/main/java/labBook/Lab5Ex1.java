package labBook;

import java.io.*;

public class Lab5Ex1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter age : ");
		int age = Integer.parseInt(br.readLine());
		try {
			if(age<15) {
				throw new Lab5Ex1AgeException();
			}
			else {
				System.out.println("valid age");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("In finally.\nEnd of program!");
		}
	}

}
