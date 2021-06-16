package labBook;

public class Lab5Ex1AgeException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Lab5Ex1AgeException(){
		super("Age under 15 years !");
	}
	Lab5Ex1AgeException(String massage){
		super(massage);
	}

}
