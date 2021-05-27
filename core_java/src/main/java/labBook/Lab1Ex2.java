package labBook;
//On entering the choice, an appropriate message with “stop” or “ready” or “go”

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab1Ex2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter choice\n :red\n :yellow\n :green");
		String light = br.readLine();
		
		switch(light) {
		case "red" :
			System.out.println("stop");
			break;
		case "yellow" :
			System.out.println("ready");
			break;
		case "green" :
			System.out.println("go");
			break;
			default : System.out.println("Wrong choice !");
		}

	}

}
