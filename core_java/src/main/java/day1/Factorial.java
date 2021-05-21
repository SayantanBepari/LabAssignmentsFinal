package day1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n = num;
		int fact = 1;
		while(num>0) {
			fact = fact * num;
			num--;
		}
		System.out.println("Factorial of "+n+" is : "+fact);
		sc.close();

	}

}
