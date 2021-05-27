package day2;

import java.util.Scanner;

public class Assignment_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Finding Area and Perimeter of a circle");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius in Meter: ");
		double radius = sc.nextDouble();
		
		System.out.println("Area of the Circle is : "+ (3.14*radius*radius)+" Meter2");
		System.out.println("Perimeter of the Circle is : "+ (2*3.14*radius)+ " Meter");
		

	}

}
