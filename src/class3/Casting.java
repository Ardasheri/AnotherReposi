package class3;

public class Casting {

	public static void main(String[] args) {
		/*
		 * type casting=> type = data type casting= converting
		 * converting one data type to another
		 * 
		 */
		byte box1=127;
		short box2=3333;
		int box3=45454545;
		long box4=45454545;
		float box5=45454545;
		double box6=454545454;
		
		int number=(int)15.2;
		System.out.println(number);
		
		long smallerBox=(long)box2;
		System.out.println(smallerBox);
		
		short biggerBox=box1;
		
		long box7=box1;
		
		float box8=(float)box6;
		
		char a=(char)65;
		System.out.println(a);
		
		int box9=(int)box4;
		System.out.println(box9);
		
	}
	

}
