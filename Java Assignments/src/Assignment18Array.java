//1. Create a program using arrays that sorts a list of integers in descending order. Descending order is highest value to lowest.
//    In other words if the array had the values in int 106,26,81,5,15 your program should ultimately have an array with 106,81,26,15,5 in it.
//2. Set up the program so that the numbers to sort are read in from the keyword.
//3. Implement the following methods - getIntegers, printArray, and sortIntegers.
//    getIntegers returns an array of entered integers from keyword.
//    printArray prints out the contents of the array and sortIntegers should sort the array and return a new array containing the sorted numbers
//4. You will have to figure out how to copy the array elements from passed array into a new array and sort them and return the new sorted array.

import java.util.Arrays;
import java.util.Scanner;

public class Assignment18Array {

	public static void main(String[] args) {
		printArray(7);
	}
	public static int[] getIntegers(int num) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter "+num+" integer values");
		int[] intArray = new int[num];
		for (int i=0; i<intArray.length; i++) {
			intArray[i]=scanner.nextInt();
		}
		scanner.close();
		return intArray;
	}
	public static void printArray(int num) {
		System.out.println(Arrays.toString(sortIntegers(num)));
		
	}
	public static int[] sortIntegers(int number) { 
		int[] firstSort = getIntegers(number); 
		System.out.println(Arrays.toString(firstSort));
		Arrays.sort(firstSort);
		int total = firstSort.length;
		int[] sortedArray =  new int[total];
		for (int num : firstSort ) {
			total--;
			sortedArray[total] = num;
		}
		return sortedArray;
	}
}
