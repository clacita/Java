import java.util.Scanner;

//Read the numbers from console entered by the user and print the minimum and maximum number the user has entered.
//Before the user enters the number, print the message "Enter number"
//If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
//
//Hint:
//Use an endless while loop
public class Assignment17UserInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int min = 0;
		int max = 0;
		int num = 0;
		String number = "";
		do {
			System.out.println("Enter a number (or not a number to exit)");
			number = scanner.nextLine();
			num = getNumber(number);
			if (num > max) {
				max = num;
			} else if (num < min) {
				min = num;
			}
		} while (num > 0);
		System.out.println("Minimum number is "+min+" and maximum number is "+max);
		scanner.close();
	}
	public static int getNumber(String number) {
	    while (true) {
	        String input = number;
	        try {
	            return Integer.parseInt(input);
	        } catch (NumberFormatException ne) {
	            return -1;
	        }
	    }
	}
}