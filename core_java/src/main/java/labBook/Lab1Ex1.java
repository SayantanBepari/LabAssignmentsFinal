package labBook;

import java.util.Scanner;

//Create a method to find the sum of the cubes of the digits of an n digit number
public class Lab1Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter te Number : ");
		int num = sc.nextInt();
		int rem,sum = 0;
		while(num>0) {
			rem = num%10;
			sum = sum + (rem*rem*rem);
			num = num/10;
		}
		
		System.out.println("Sum of the cubes of the digits : "+sum);

	}

}
