//class with a method,find the difference between sum of the squares and square of the sum of n numbers
package labBook;

import java.util.Scanner;

public class Lab1Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		
		System.out.println("The Differenece is : "+calculateDifference(num));
		sc.close();
	}
	
	static int calculateDifference(int n) {
		int sum1=0, sum2=0,diff =0;
		for(int i=1; i<=n; i++ ) {
			sum1=sum1+(i*i);
			sum2=sum2+i;

		}
		
		//System.out.println("sum1 = "+sum1+" sum2 = "+sum2*sum2);
		diff = sum1-(sum2*sum2);
		return diff;
	}

}

