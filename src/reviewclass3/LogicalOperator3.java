package reviewclass3;

public class LogicalOperator3 {

	public static void main(String[] args) {
		
		double savings=200000;
		boolean freeTime=true;
		String season="Summer";
		
		if(savings>10000 && freeTime&&season.equals("Summer")) {
			System.out.println("lets go to vacations");
		}else {
			System.out.println("I need to stay at home");
		}
	}

}
