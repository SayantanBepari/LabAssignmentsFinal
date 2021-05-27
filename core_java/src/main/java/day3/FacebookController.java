package day3;

/*public class FacebookColtroller {

}
*/
//package com.capgemini.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FacebookController {

	public void createProfile()throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Name ");
		String name=br.readLine();
		
		System.out.println("Enter Password ");
		String pass=br.readLine();
		
		System.out.println("Enter EMAIL ");
		String email=br.readLine();
		
		System.out.println("Enter Address ");
		String address=br.readLine();
		
		System.out.println("your data is below");
		System.out.println("name is "+name);
		System.out.println("password is "+pass);
		System.out.println("email is "+email);
		System.out.println("address is "+address);
		
	}

	public void viewProfile() {

		System.out.println("Profile Information"
				+ "Name : "+name
				+"Password : "+pass
				+ "Email : "+email
				+ "Address : "+address);
	}

	public void editProfile() throws IOException {
		System.out.println("Make the changes");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name : ");
		String name = br.readLine(); 
		
		System.out.println("Enter password : ");
		String pass = br.readLine(); 

		System.out.println("Enter email : ");
		String email = br.readLine(); 
		
		System.out.println("Enter address : ");
		String address = br.readLine(); 
		
		System.out.println("Updated profile info"
				+ "Name : "+name
				+ "Password : "+pass
				+ "Email : "+email
				+ "Address : "+address);
	}

	public void viewAllProfile() {

		
	}

	public void uploadProfile() {

		
	}

	public void deleteProfile() {

		
	}

	public void searchProfile() {

		
	}

	public void loginProfile() {

		
	}
	

}