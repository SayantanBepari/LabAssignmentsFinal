package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhatsappView {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String ss = "y";

		while (ss.equals("y")) {

			System.out.println("********MAIN MENU********");
			System.out.println("press 1 for create profile");
			System.out.println("press 2 for view profile");
			System.out.println("press 3 for edit profile");
			System.out.println("press 4 for delete profile");

			System.out.println("Enter your choice");

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String b = br.readLine();
			int c = Integer.parseInt(b);

			WhatsappFunction fun = new WhatsappFunction();

			switch (c) {
			case 1:
				fun.createProfile();
				break;
			case 2:
				fun.viewProfile();
				break;
			case 3:
				fun.editProfile();
				break;
			case 4:
				fun.deleteProfile();
				break;
			default:
				System.out.println("wrong choice !");
			}

			System.out.println("do you want to continue press y/n");
			ss = br.readLine();

		}
	}

}
