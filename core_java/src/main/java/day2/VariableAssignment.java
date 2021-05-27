package day2;

public class VariableAssignment {

	byte a;
	short b;
	int c;
	long d;
	static double e;
	static float f;
	static char g;
	boolean h; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 2;
		System.out.println(a);
		short b = 3;
		System.out.println(b);
		int i = 456;
		System.out.println(i);
		long j = 4582;
		System.out.println(j);
		double e = 1530.45;
		System.out.println(e);
		float f = 458.45f;
		System.out.println(f);
		char g = 'S';
		System.out.println(g);
		boolean h = true;
		System.out.println(h);
		
		
		VariableAssignment var = new VariableAssignment();
		System.out.println(var.a);
		System.out.println(var.b);
		System.out.println(var.c);
		System.out.println(var.d);
		System.out.println(VariableAssignment.e);
		System.out.println(var.h);
		

	}

}
