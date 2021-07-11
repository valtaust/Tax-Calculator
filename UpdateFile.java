package ie.gmit.dip;
//more efficient to have rate in the else if statements
//the if statement handles the most complex scenario in conditionals

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

			try (Scanner reader = new Scanner(System.in)) {
				System.out.println("enter a gift value");
				double gift = Double.valueOf(reader.nextLine());
				
				double rate = 0;
				
				
				if (gift >= 5000 && gift <= 25000) { // handle the most demanding condition
					rate = 0.08;
				} else if (gift >= 25000 && gift <= 55000) {
					rate = 0.10;
				} else if (gift >= 55000 && gift <= 200000) {
					rate = 0.12;
				} else if (gift >= 200000 && gift <= 1000000){
					rate = 0.15;
				} else {
			    System.out.println("no tax");	
				} 	
				double tax = gift * rate;   //equation placed here to utilise all of the rates set in the program
				System.out.println("The tax is: " + tax);  
				}
			}
	}
