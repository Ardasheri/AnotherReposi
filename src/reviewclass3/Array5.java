package reviewclass3;

import java.util.Scanner;
import java.util.Arrays;

public class Array5 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please enter the number of dresses you want to buy");
		int size=scanner.nextInt();
		
		double[] prices=new double[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("Please enter the price of dress no "+i);
			prices[i]=scanner.nextDouble();
		}
		System.out.println(Arrays.toString(prices));
		double sum=0;
		for(double price:prices) {
			sum+=price;
		}
		System.out.println("Total for all the dresses = "+sum);
	}

}
