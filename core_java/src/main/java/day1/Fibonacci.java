package day1;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the length of the series :");
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int firstNum=1, secondNum=1;
		int thirdNum;
		System.out.print(firstNum+" "+secondNum+" ");
		for(int i=0; i<l-2; i++) {
			thirdNum = firstNum + secondNum;
			System.out.print(thirdNum+" ");
			firstNum = secondNum;
			secondNum = thirdNum;
		}

	}

}
