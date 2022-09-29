package reviewclass3;

import java.util.Scanner;

public class LogicalOperator4 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter if ");
		boolean goodWithOp=scanner.nextBoolean();
		
		if(!goodWithOp) {
			System.out.println("Do some research");
		}
	}

}
