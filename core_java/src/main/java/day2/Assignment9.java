package day2;

import java.util.Scanner;

//swap two numbers without using any temporary variable
public class Assignment9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double num1,num2;
		System.out.println("Enter 1st Number : ");
		num1 = sc.nextDouble();
		System.out.println("Enter 2nd NUmber : ");
		num2 = sc.nextDouble();
		
		System.out.println("Before Swapping \n 1st Number = "+ num1 + ", 2nd Number = "+ num2);
		
		num1 = num1 + num2;
		num2 = num1-num2;
		num1 = num1-num2;
		System.out.println("After Swapping \n 1st Number = "+ num1 +", 2nd Number = "+num2 );

	}

}
