package labBook;
//Create a class with a method which can calculate the sum of first n natural numbers which are divisible by 3 or 5.
import java.util.Scanner;

public class Lab1Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = sc.nextInt();
		System.out.println("The Sum is : "+calculateSum(num));
		sc.close();
	}
	
	static int calculateSum(int n) {
		int sum = 0;
		for(int i =1; i<=n; i++) {
			if(i%3==0 && i%5==0) {
				sum = sum+i;
			}
		}
		return sum;
	}

}
