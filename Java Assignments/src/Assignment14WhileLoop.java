//Write a method called isPalindrome with one int parameter called number.
//The method needs to return a boolean.
//It should return true if the number is a palindrome number otherwise it should return false.
//Sample Output:
//isPalindrome(-1221) - > should return true
//isPalindrome(707) - > should return true
//isPalindrome(11212) - > should return false because reverse is 21211 and that is not equal to 11212
//Hint:
//What is a Palindrome number? A palindrome number is a number which when reversed is equal to the original number.
//For example: 121, 12321, 1001 etc
//Logic to check a palindrome number:
//Find the reverse of the given number. Store it in some variable say reverse. Compare the number with reverse.
//If both are the same then the number is a palindrome otherwise it is not.
//Logic to reverse a number:
//Declare and initialize another variable to store the reverse of a number, for example reverse = 0.
//Extract the last digit to some variable say lastDigit = num % 10
//Increase the place value of reverse by one.
//To increase place value multiply reverse variable by 10 e.g reverse = reverse * 10
//Add lastDigit to reverse
//Since last digit of num is processed, remove last digit of num. To remove last digit divide num by 10
//Repeat steps until num is not equal to (or greater than) zero.

public class Assignment14WhileLoop {

	public static void main(String[] args) {
		System.out.println(isPalindrome(-1221)); 
		System.out.println(isPalindrome(707));
		System.out.println(isPalindrome(11212));
	}
	public static boolean isPalindrome(int num) { //8127
		int num1 = num;
		if (num1<0) {
			num1 = -num1;
		}
		int reverse = 0; 
		int lastDigit = 0;
		while (num1 > 0) {
			lastDigit = num1%10; //7-2-1-8
			reverse = reverse *10; //0-70-720-7210
			reverse += lastDigit; //7-72-721-7218
			num1 /= 10; //812-81-8-0
		}
		if (num == reverse || num == -reverse) {
			return true;
		} else {
			return false;
		}
	}
}
