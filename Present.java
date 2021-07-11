package ie.Galway.co;
//https://java-programming.mooc.fi/part-1/4-variables
//https://java-programming.mooc.fi/part-1/6-conditional-statements

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

			try (Scanner reader = new Scanner(System.in)) {
				System.out.println("enter a gift value");
				double gift = Double.valueOf(reader.nextLine());
				
				if (gift >= 5000 && gift <= 25000) { // handle the most demanding condition
					double rate1 = 0.08;
					double sum1 = (gift*(rate1));
					System.out.println("tax rate is 8% here" + sum1);
					
				} else if (gift >= 25000 && gift <= 55000) {
					double rate2 = 0.10;
					double sum2 = (gift * rate2);
					System.out.println("tax rate is 10% here" + sum2);
					
				} else if (gift >= 55000 && gift <= 200000) {
					double rate3 = 0.12;
					double sum3 = (double) (gift * rate3);
					System.out.println("tax is 12% rate" + sum3);
					
				} else if (gift >= 200000 && gift <= 1000000){
					double rate4 = 0.15;
					double sum4 = (double)(gift *rate4);
					System.out.println("tax is 15%" + sum4);
				} else {
					System.out.println(gift);
				}
			}
		}
}
