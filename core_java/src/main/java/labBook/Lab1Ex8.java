//Exercise 8: Create a method to check if a number is a power of two or not
package labBook;

import java.util.Scanner;

public class Lab1Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check : ");
		int num = sc.nextInt();
		System.out.println(checkNumber(num));
		sc.close();

	}
	
	public static boolean checkNumber(int num) {
		boolean flag = true;
		while(num>1) {
			if(num%2 != 0) {
				flag = false;
				break;
			}
			num = num/2;
			System.out.println(num);
		}
		return flag;
		
	}

}
