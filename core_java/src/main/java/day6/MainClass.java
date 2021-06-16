package day6;

public class MainClass {

	public static void main(String[] args) {
		Employee e = new Employee("Sayantan",1523,"Analyst");
		
		System.out.println(e);
		
		
		Employee e1 = new Manager("Akash",1586,"Senior Manager",1536.023);
		System.out.println(e1);
	}

}
