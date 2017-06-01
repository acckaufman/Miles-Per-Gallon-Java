package chapter2;

import java.util.Scanner;

/*Amanda Kaufman
 Chapter 2
 Programming Challenge 9
 Miles-per-Gallon
  This program calculates a car's miles per gallon based on the user's input.
*/

public class MilesPerGallon {

	public static void main(String[] args) {
		//Create variables for calculations.
		int milesDriven = 0;
		double gallonsFuelUsed = 0, milesPerGallon = 0;
		
		//Create a Scanner object to read input.
		Scanner keyboard = new Scanner(System.in);
		
		//Get mileage and fuel information from the user.
		System.out.print("Enter the miles driven: ");
		milesDriven = keyboard.nextInt();
		System.out.print("Enter the gallons of fuel used: ");
		gallonsFuelUsed = keyboard.nextDouble();
		
		//Calculate the miles per gallon for the user's car.
		milesPerGallon = milesDriven / gallonsFuelUsed;
		
		//Display the miles per gallon for the user.
		System.out.println("The miles-per-gallon is " + milesPerGallon);
		
		keyboard.close();
	}

}
