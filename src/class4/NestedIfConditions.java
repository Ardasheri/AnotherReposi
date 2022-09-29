package class4;

public class NestedIfConditions {

	public static void main(String[] args) {
		
		int time=9;
		String day="Monday";
		
		if(day.equals("Monday")) { //String is a non primitive so we cant use== we have to use .equals
			if(time>7) {
				System.out.println("Lets go to office");
			}
			if(time<6) {
				System.out.println("Lets sleep more");
			}
		}
	}

}
