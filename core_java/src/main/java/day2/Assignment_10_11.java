package day2;
//Calculation of Simple Interest and Compound Interest

import java.util.Scanner;

public class Assignment_10_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Interest Calculation System");
		double principle,rate,time,repeter;
		System.out.println("Enter principal amount : ");
		principle = sc.nextDouble();
		System.out.println("Enter Interest rate : ");
		rate = sc.nextDouble();
		System.out.println("Enter time in year : ");
		time = sc.nextDouble();
		
		int opt;
		System.out.println("Enter 1 for Simple Interest\nEnter 2 for Compund Interest");
		opt = sc.nextInt();
		switch (opt) {
		case 1:
			SimpleInterest(principle, rate, time);
			break;
		case 2:
			System.out.println("Calculate Compund interest in :"
					+"\n For"
					+ "\n yearly Enter 1"
					+ "\n half yearly Enter 2"
					+ "\n quaterly Enter 4"
					+"\n monthly Enter 12");
			repeter = sc.nextInt();
			CompoundInterest(principle, rate, time, repeter);
			break;
		default :
			System.out.println("Invalid Option");
				
		}
		sc.close();
		

	}
	
	static void SimpleInterest(double principle, double rate, double time) {
		double interest;
		interest = (principle * time * rate)/100;
		System.out.println("Simple Interest = "+ interest + "\n"+"Return = " + (interest+principle));
		
	}
	static void CompoundInterest(double p, double r, double t, double n) {
		double interest,total;
		total = p * Math.pow(1 + ((r/100) / n), n * t);
		interest = total - p;
		System.out.println("Compound Interest = "+ interest + "\n"+"Return = " + total);
		
	}
	
	

}
