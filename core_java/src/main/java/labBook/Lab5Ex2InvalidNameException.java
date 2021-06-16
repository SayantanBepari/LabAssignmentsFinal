package labBook;

public class Lab5Ex2InvalidNameException extends Exception{
	Lab5Ex2InvalidNameException(){
		super("Invalid Name !");
	}
	Lab5Ex2InvalidNameException(String massage){
		super(massage);
	}
}
