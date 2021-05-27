//prompts the user for an integer and then prints out all the prime numbers up to that Integer
package labBook;

import java.util.Scanner;

public class Lab1Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the number : ");
		int num = sc.nextInt();

		for (int i = 2; i <= num; i++) {

			boolean flag = true;
			for (int n = 2; n < i / 2; n++) {
				if(i%n == 0) {
					flag = false;
					//System.out.println(i);
				}
			}
			if(flag) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
