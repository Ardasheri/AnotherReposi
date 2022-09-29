package reviewclass3;

public class LogicalOperator5 {

	public static void main(String[] args) {
		
		String country="Spain";
		
		if(country.equals("Korea")|| country.equals("Japan")) {
			
			if(!country.equals("Korea")) {
				System.out.println("Welcome to USA");
			}
			else {
				System.out.println("Go live in a hole");
			}
		}

	}

}
