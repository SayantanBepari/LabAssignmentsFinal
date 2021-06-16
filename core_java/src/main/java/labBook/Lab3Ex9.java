package labBook;
import java.io.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Lab3Ex9 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Date(dd/mm/yyyy) : ");
		String dateIn = br.readLine();
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate today = LocalDate.now();
		LocalDate dateEntered = LocalDate.parse(dateIn, format);
		
		System.out.println("System's date : "+today.format(format));
		System.out.println("Entered date : "+dateEntered);
		
		Period period = dateEntered.until(today);
		System.out.println("Duration"
				+ "\nDays : " + period.getDays()
				+ "\nMonthes : "+ period.getMonths()
				+ "\nYears : " + period.getYears());
		
		
	}

}
