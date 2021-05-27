package day2;

import java.util.Scanner;

public class Assignment_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row : ");
		int row = sc.nextInt();
		int i,j;
		for(i=1; i<=row; i++) {
			for(j=1; j<=i; j++) {
			System.out.print(j);
		}
			System.out.println();

	}

	}
}
