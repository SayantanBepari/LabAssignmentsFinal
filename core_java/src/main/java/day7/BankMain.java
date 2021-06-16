package day7;

public class BankMain {

	public static void main(String[] args) {
		Account ob1 = new SavingsAccount(4526, 2000,new Person("Smith",26f));
		System.out.println(ob1);
		//ob1.withdrawl(2000);
		ob1.deposite(2000);
		
		Account ob2 = new SavingsAccount(4526, 3000,new Person("Kathy",25f));
		System.out.println(ob2);
		ob2.withdrawl(2000);
		//ob1.deposite(2500);
	}

}
