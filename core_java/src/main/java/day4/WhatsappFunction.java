package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhatsappFunction {

	BufferedReader br;

	public WhatsappFunction() {
		br = new BufferedReader(new InputStreamReader(System.in));

	}

	static String name;
	static String pass;
	static int number;

	public void createProfile() throws Exception {
		System.out.println("Enter Name : ");
		name = br.readLine();

		System.out.println("Enter Password : ");
		pass = br.readLine();

		System.out.println("Enter Number : ");
		String strnum = br.readLine();
		if (strnum.length() == 10) {
			number = Integer.parseInt(strnum);
		}
		else {
			System.out.println("Length should be 10 !");
			System.exit(1);
			
		}
		System.out.println("Profile Created Successfully !");

	}

	public void viewProfile() {
		System.out.println("Name : " + name);
		System.out.println("Password : " + pass);
		System.out.println("number : " + number);

	}

	public void editProfile() throws IOException {
		System.out.println("Enter updated details");
		System.out.println("Enter name : ");
		br.readLine();
		System.out.println("Enter password : ");
		br.readLine();
		System.out.println("Enter number : ");
		br.readLine();
		System.out.println("Profile edited successfully !");

	}

	public void deleteProfile() {
		name = "";
		pass = "";
		number = 0;
		System.out.println("Profile deleted successfully !");
	}

}
