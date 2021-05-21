package day1;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Number to Reverse : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		sb.append(num);
		sb.reverse();
		//System.out.println(sb);
		int rev = Integer.parseInt(sb.toString());
		System.out.println("Reverse of the number is : "+rev);
		sc.close();
		
	}

}
