package reviewclass3;

public class Array3 {

	public static void main(String[] args) {
		
		String [] dresses=new String[] {"Pink Dress","Cocktail","Summer dress","Night dress"};
		System.out.println(dresses.length);
		for(int i=0;i<dresses.length;i++) {
		System.out.println("Lets try " +dresses[i]);	
			
		}
		//enhanced for loop
		for(String dress:dresses) {
			System.out.println(dress);
	}
		System.out.println("***********************");
		System.out.println(Arrays.toString(dresses));
	}
}
