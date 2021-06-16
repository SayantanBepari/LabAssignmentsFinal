package labBook;
import java.util.Scanner;
public class Lab5Ex2 {

	public static void main(String[] args) throws Lab5Ex2InvalidNameException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name : ");
		String fName = sc.nextLine();
		System.out.println("Enter Middle Name : ");
		String mName = sc.nextLine();
		System.out.println("Enter Last Name : ");
		String lName = sc.nextLine();
		try {
		if((fName.equals("")) || (lName.equals(""))) {
			throw new Lab5Ex2InvalidNameException("Enter Name Properly!");
		}
		else {
			System.out.println(fName+" "+mName+" "+lName);
		}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
		sc.close();
		}

	}

}
