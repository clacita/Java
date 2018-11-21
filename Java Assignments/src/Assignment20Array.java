//-Write a method called reverse() with an int array as a parameter.
//-The method should not return any value. In other words, the method is allowed to modify the array parameter.
//-In main() test the reverse() method and print the array both reversed and non-reversed.
//-To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.
//-For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.

import java.util.Arrays;

public class Assignment20Array {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		reverse(array);
	}
	public static void reverse(int[] array) {
		int[] original = array;
		int count = original.length;
		int[] reversed = new int[count];
		for (int num : original) {
			count--;
			reversed[count] = num;
		}
		System.out.println("The original array is : "+Arrays.toString(original));
		System.out.println("The reversed array is : "+Arrays.toString(reversed));
	}

}
