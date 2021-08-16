package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Converter {

	private static Scanner scanner = new Scanner(System.in);
	private static String selectionErrorMessage = "******* That was not a valid selection. Please select a number from 1 to 3. *******";

	private static double usersQuantity;
	private static double convertedUnit;

	public static void main(String args[]) {

		boolean exit = false;
		int menuSelection = 0;

		while (menuSelection != 3) {
			try {
				System.out.println();
				System.out.println("Welcome to Unit Converter Application!");
				System.out.println("Below, make a selection by entering the number of the option.");
				System.out.println("1. Volume");
				System.out.println("2. Distance");
				System.out.println("3. Quit Application");
				System.out.println();
				System.out.print("What above menu option number do you select? ");

				menuSelection = scanner.nextInt();

				switch (menuSelection) {
					case 1:
						volume();
						break;
					case 2:
						distance();
						break;
					case 3:
						exit = true;
						break;
					default:
						System.out.println();
						System.out.println(selectionErrorMessage);
				}
				if (exit) {
					System.out.println("Exiting program...");
					break;
				}
			} catch (InputMismatchException error) {
				System.out.println();
				// System.out.println(error);
				System.out.println(selectionErrorMessage);
				scanner.nextLine();
			}
		}
		System.out.println("Program successfully exited.");
		scanner.close();
	}

	public static double collectUsersQuantity(String unit) {
		System.out.print("What is the quantity of " + unit + " to convert? ");
		usersQuantity = scanner.nextDouble();
		return usersQuantity;
	}

	public static double convertCupsToTeaspoons(double quantity) {
		convertedUnit = quantity * 48;
		return convertedUnit;
	}

	public static double convertUSgallonToImperialGallon(double quantity) {
		convertedUnit = quantity * .8326741881485;
		return convertedUnit;
	}

	private static void volume() {
		int menuSelection = 0;

		while (menuSelection != 3) {
			try {
				System.out.println();
				System.out.println("Which Volume conversion would you like to make?");
				System.out.println("1. Cups to Teaspoons");
				System.out.println("2. US Gallons to Imperial Gallons");
				System.out.println("3. Return to the main menu");
				System.out.println();
				System.out.print("What above menu option number do you select? ");
	
				menuSelection = scanner.nextInt();
				// scanner.nextLine();

				switch (menuSelection) {
					case 1:
						System.out.println("Converted: " + collectUsersQuantity("Cups") + " Cups" + " is equal to " + convertCupsToTeaspoons(usersQuantity) + " Teaspoons.");
						break;
					case 2:
						System.out.println("Converted: " + collectUsersQuantity("US Gallons") + " US Gallons" + " is equal to " + convertUSgallonToImperialGallon(usersQuantity) + " Imperial Gallons.");
						break;
					case 3:
						System.out.println("Return to the main menu");
						break;
					default:
						System.out.println();
						System.out.println(selectionErrorMessage);
				}
			} catch (InputMismatchException error) {
				System.out.println();
				System.out.println(selectionErrorMessage);
				scanner.nextLine();
			}
		}
	}

	public static double convertMilesToKilometers(double quantity) {
		convertedUnit = quantity * 1.609344 ;
		return convertedUnit;
	}

	public static double convertKilometersToMiles(double quantity) {
		convertedUnit = quantity * .62137;
		return convertedUnit;
	}

	private static void distance() {
		int menuSelection = 0;

		while (menuSelection != 3) {
			try {
				System.out.println();
				System.out.println("Which Distance conversion would you like to make?");
				System.out.println("1. Miles to Kilometers");
				System.out.println("2. Kilometers to Miles");
				System.out.println("3. Return to the main menu");
				System.out.println();
				System.out.print("What above menu option number do you select? ");
	
				menuSelection = scanner.nextInt();
	
				switch (menuSelection) {
					case 1:
						System.out.println("Converted: " + collectUsersQuantity("Miles") + " Miles" + " is equal to " + convertMilesToKilometers(usersQuantity) + " Kilometers.");
						break;
					case 2:
						System.out.println("Converted: " + collectUsersQuantity("Kilometers") + " Kilometers" + " is equal to " + convertKilometersToMiles(usersQuantity) + " Miles.");
						break;
					case 3:
						System.out.println("Return to the main menu");
						break;
					default:
						System.out.println();
						System.out.println(selectionErrorMessage);
				}
			} catch (InputMismatchException error) {
				System.out.println();
				System.out.println(selectionErrorMessage);
				scanner.nextLine();
			}
		}
	}
}
