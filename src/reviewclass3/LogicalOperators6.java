package reviewclass3;

import java.util.Scanner;

public class LogicalOperators6 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in); 
		System.out.println("Are you from batch14");		
		String batch14=scanner.next();
		if(batch14.equalsIgnoreCase("yes")) {
			System.out.println("You are amazing");
		}
		else {
			System.out.println("You are good");
		}

	}

}
