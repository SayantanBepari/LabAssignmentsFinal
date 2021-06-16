package day7;

public class CurrentAccount extends Account{
	double overDraftLimit = 20000.00;
	public CurrentAccount(long accNum, double balance, Person accHolder) {
		super(accNum, balance, accHolder);
	}
	@Override
	public void setBalance(double balance) {
		// TODO Auto-generated method stub
		super.setBalance(balance);
	}
	@Override
	public void withdrawl(double money) {
		if((super.balance - money)>=overDraftLimit) {
			System.out.println("Account Debited Rs : "+money);
			setBalance(super.balance - money);
		}
		else {
			System.out.println("Over Draft Limit reached. cannot withdraw !");
		}
	}
	
	
	
}
