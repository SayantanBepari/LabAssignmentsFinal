//Java program reads a line of integers then displays each integer and the sum of all integers
// input 10 20 20 30 43 23
package labBook;
import java.io.*;
import java.util.StringTokenizer;

public class Lab3Ex1 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter all numbers with space : ");
		String numbers = br.readLine();
		StringTokenizer st = new StringTokenizer(numbers," ");
		int sum = 0;
		
		while(st.hasMoreTokens()) {
			int num = 0;
			num = Integer.parseInt(st.nextToken());
			System.out.println(num);
			sum = sum+num;
		}
		System.out.println("Sum of the number : "+sum);
	}

}
