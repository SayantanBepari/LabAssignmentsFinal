package day16_JUnit;

public class MainMoney {

	public static void main(String[] args) {
		Money m1 = new Money(10,"INR");
		Money m2 = new Money(20,"INR");
		try {
//		Money m1 = new Money(10,"INR");
//		Money m2 = new Money(20,"INR");
		Money add = m1.addMoney(m2);
		System.out.println(add);
		System.out.println(add.addMoney(new Money(10,"DOLLER")));
		System.out.println(add.addMoney(m2));
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("Done!");
		}
		
	}

}
