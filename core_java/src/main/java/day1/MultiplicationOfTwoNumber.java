package day1;

import java.util.Scanner;

public class MultiplicationOfTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Multiplication of Two Numbers");
		System.out.println("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number : ");
		int num2 = sc.nextInt();
		
		System.out.println("Answere is "+(num1 * num2));
		sc.close();

	}

}
