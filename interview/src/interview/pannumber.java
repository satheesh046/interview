package interview;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pannumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Please enter your PAN card number:");

	        // Read PAN card number from the user
	        String panNumber = scanner.nextLine();

	        // Validate PAN card number using regular expression
//	        if (validatePanNumber(panNumber)) {
//	            System.out.println("Valid PAN card number: " + panNumber);
//	        } else {
//	            System.out.println("Invalid PAN card number: " + panNumber);
//	        }

	        // Close the scanner
	       
	    }

	    // Function to validate PAN card number using regular expression
	    public static boolean validatePanNumber(String panNumber) {
	        String regex = "[A-Z]{5}[0-9]{4}[A-Z]{1}";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(panNumber);
	        return matcher.matches();

	}

}
