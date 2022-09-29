package reviewclass3;

import java.util.Scanner;

public class LogicalOperator2 {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Your playing a game! Hit q or Q to quit");
	String response = scanner.next();
	
	if(!response.equals("q") && !response.equals("Q")) {
		System.out.println("You ar still playin");
		
	}
	else {
		System.out.println("You quit the game");
	}
	}

}
