package day12;

public class LambdaDemo1 {

	public static void main(String[] args) {
		Calculator sum = (n1, n2) -> (n1+n2);
		System.out.println("Summation : "+sum.operation(56, 25));
		
		
		Calculator minus = (n1,n2) -> (n1 - n2);
		System.out.println("Substraction : "+minus.operation(156, 85));
		
		
		Calculator multiply = (n1,n2) -> (n1 * n2);
		System.out.println("Multiplication : "+ multiply.operation(5, 15));
		
		Calculator div = (n1,n2) -> (n1/n2);
		System.out.println("Division : "+ div.operation(45, 5));
		
	}

}

interface Calculator{
	int operation (int n2, int n1);
}