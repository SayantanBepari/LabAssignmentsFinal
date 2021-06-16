package day7;

public class Account {
	private long accNum;
	protected double balance ;
	private Person accHolder;
	Account(){}
	public Account(long accNum, double balance, Person accHolder) {
		super();
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
		System.out.println("Account Created.");
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	public void deposite(double money) {
		this.balance = this.balance+money;
		System.out.println("Account credited Rs : "+money+"\nNew Balance : "+this.balance);
	}
	
	public void withdrawl(double money){
//		if(this.balance-money >= 500) {
//			this.balance = this.balance-money;
//		}
//		else {
//			System.out.println("Insuficient Balance!");
//		}
	}
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + accHolder + "]";
	}
	public void withdrawl() {
		// TODO Auto-generated method stub
		
	}
	
}
