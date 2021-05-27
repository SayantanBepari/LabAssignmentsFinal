//Create a method to check if a number is an increasing number Example 134468
package labBook;

import java.util.Scanner;

public class Lab1Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		System.out.println(checkNumber(num));
		sc.close();

	}
	public static boolean checkNumber(int number) {
		boolean flag = true;
		int lastdigit = number%10;
		number = number/10;
		while(number > 0) {
			if(lastdigit < number%10) {
				flag = false;
				break;
			}
			lastdigit = number%10;
			number = number/10;
		}
		
		return flag;
	}
}
