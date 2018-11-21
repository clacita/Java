//import java.util.Arrays;
//-Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.
//-The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.
//-Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.
//-In the main() method read the count from the console and call the method readIntegers() with the count parameter.
//-Then call the findMin() method passing the array returned from the call to the readIntegers() method.
//-Finally, print the minimum element in the array.

import java.util.Arrays;
import java.util.Scanner;

public class Assignment19Array {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number");
		int count = scanner.nextInt();
		int[] myArray = readIntegers(count);
		int myMin = findMin(myArray);
		System.out.println("Array with "+count+" numbers: "+Arrays.toString(myArray));
		System.out.println("The smallest number is "+myMin);
		scanner.close();
	}
	public static int[] readIntegers(int count) {
		int[] intArray = new int[count];
		Scanner scanner = new Scanner(System.in);
		for (int i=0; i<intArray.length; i++) {
			System.out.println("Please enter number "+(i+1));
			intArray[i]=scanner.nextInt();
		}
		scanner.close();
		return intArray;
	}
	public static int findMin(int[] myArray) {
		int[] minArray = myArray;
		int min = minArray[0];
		for (int number : minArray) {
			if (number<min) {
				min=number;
			}
		}
		return min;
	}
	
}
