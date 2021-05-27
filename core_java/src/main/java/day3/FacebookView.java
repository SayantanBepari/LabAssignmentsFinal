package day3;

/*public class FacebookView {

}

package com.capgemini.view;
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import com.capgemini.controller.FacebookController;

public class FacebookView {

	public static void main(String[] args)throws Exception {
		String ss="y";
		
		while(ss.equals("y")) {
			
		System.out.println("*******MAIN MENU******");
		System.out.println("press 1 for create profile");
		System.out.println("press 2 for view profile");
		System.out.println("press 3 for edit profile");
		System.out.println("press 4 for delete profile");
		System.out.println("press 5 for search profile");
		System.out.println("press 6 for view all profile");
		System.out.println("press 7 for login profile");
		System.out.println("press 8 for upload profile");
		
		System.out.println("Enter your choice");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String b=br.readLine();
		int c=Integer.parseInt(b);
		
		FacebookController fc=new FacebookController();
		
		switch(c) {
		case 1 :  fc.createProfile();
			break;
		case 2: fc.viewProfile();
			break;
		case 3 : fc.editProfile();
			break;
		case 4: fc.deleteProfile();
			break;
		case 5 :  fc.searchProfile();
			break;
		case 6: fc.viewAllProfile();
			break;
		case 7 : fc.loginProfile();
			break;
		case 8: fc.uploadProfile();
			break;
			default : System.out.println("wrong choice");
		}
		
		System.out.println("do you want to continue press y/n");
		ss=br.readLine();
		
		//ss=sc.next();
		}

	}

}