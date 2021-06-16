package day7;

public class SavingsAccount extends Account {
	final double minBalance = 500;
	public SavingsAccount(long accNum, double balance, Person accHolder) {
		super(accNum, balance, accHolder);
	}
	@Override
	public void setBalance(double balance) {
		super.setBalance(balance);
		System.out.println("New Balance = "+super.balance);
	}
	@Override
	public void withdrawl(double money) {
		if((super.balance - money) >= minBalance) {
			System.out.println("Account Debited Rs : "+money);
			setBalance(super.balance - money);
		}
		else {
			System.out.println("Insufficient Balance!");
		}
	}
}
