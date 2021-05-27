package day2;
//Calculation of Square and Square Root of a Given Number

import java.util.Scanner;

public class Assignment_12_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculation of Square and Square Root");
		System.out.println("Enter the Number : ");
		double num;
		num = sc.nextInt();
		System.out.println("Enter\n 1 for Square\n 2 for Square root");
		int opt = sc.nextInt();
		
		switch(opt) {
		case 1:
			Square(num);
			break;
		case 2:
			SquareRoot(num);
			break;
		default :
			System.out.println("Envalid Entry!");
		}
		sc.close();

	}
	static void Square(double num) {
		System.out.println("Square of the Number = "+ num*num);
	}
	
	static void SquareRoot(double num) {
		System.out.println("Square root of the Number = "+ Math.sqrt(num));
	}

}
