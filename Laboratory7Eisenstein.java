package laboratory7eisenstein;

import java.util.Scanner;

public class Laboratory7Eisenstein {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		String input;
		String validName = readValidName(scnr, "Please enter a valid Name: ");
		System.out.println("So your name is " + validName);
		
		
		String validEmail = readValidEmail(scnr, "Please enter a valid email: ");
		System.out.println("So your email is " +validEmail);
		
		
		String validPhone = readValidPhone(scnr, "Please enter a valid phone number: ");
		System.out.println("So your phone number is " +validPhone);
		
		
		String validDate = readValidDate(scnr, "Please enter a valid date: ");
		System.out.println("So a valid date is " +validDate);
		
		System.out.println("Well, that certainly is one way to do it. Thank you.");
	}

	
	
	public static String readValidName(Scanner scnr, String input) {
		do {
			System.out.println("Please enter a valid First Name: ");
			input = scnr.nextLine();
		boolean valid = input.matches("[A-Z]+[a-z]*\\s*{1,30}");
				System.out.println(valid ? "Thank you." : "Are you sure that is your name?");
	}while(!input.matches("[A-Z]+[a-z]*\\s*{1,30}"));
		return input;
		
	}
	public static String readValidEmail(Scanner scnr, String input) {
		do {
			System.out.println("Please enter a valid email: ");
			input = scnr.nextLine();
			boolean valid = input.matches("[A-z0-9]{5,30}[@][A-z0-9]{5,10}[.][A-z0-9]{2,3}");
			System.out.println(valid ? "Thank you." : "Are you sure that is your email?");
		}while(!input.matches("[A-z0-9]{5,30}[@][A-z0-9]{5,10}[.][A-z0-9]{2,3}"));
		return input;
	}
	public static String readValidPhone(Scanner scnr, String input) {
		do {
			System.out.println("Please enter a valid phone number: ");
			input = scnr.nextLine();
			boolean valid = input.matches("[0-9]{3}[-][0-9]{3}[-][0-9]{4}");
			System.out.println(valid ? "Thank you." : "Are you sure that is your phone number? Enter in this format 999-999-9999");
		}while (!input.matches("[0-9]{3}[-][0-9]{3}[-][0-9]{4}"));
		return input;
}
	public static String readValidDate(Scanner scnr, String input) {
		do {
			System.out.println("Please enter a valid date: ");
			input = scnr.nextLine();
			boolean valid = input.matches("[0-9]{2}[/][0-9]{2}[/][0-9]{4}");
			System.out.println(valid ? "Thank you." : "Are you sure that is a valid date? Enter in this format dd/mm/yyyy");
		}while (!input.matches("[0-9]{2}[/][0-9]{2}[/][0-9]{4}"));
		return input;
		}
}

