import java.util.Arrays;
import java.util.Scanner;

public class ArrayClass {

	public static void main(String[] args) {
		
		int[] myIntArray = new int[10];
		myIntArray[0]=35;
		myIntArray[1]=30;
		
		int[] myIntArray2 = {1,20,30,4,5,17};
		
		System.out.println(myIntArray[2] + "|" + myIntArray2[4]);
		//we didn't instantiate myIntArray[2], but java automatically assigns default value as 0
		
		System.out.println("---------------");
		
		int[] myIntegers = getIntegers(5);
		System.out.println("The average is: "+getAverage(myIntegers));
		System.out.println(Arrays.toString(myIntegers));//to print array as array
		
	}
	public static int[] getIntegers(int number) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter "+number+" integer values");
		int[] values = new int[number];
		
		for (int i=0; i<values.length; i++) {
			values[i]=scanner.nextInt();
		}
		scanner.close();
		return values;
	}
	public static double getAverage(int[] array) {
		int sum=0;
		for (int i=0; i<array.length;i++) {
			sum+=array[i];
		}
		return (double)sum/array.length;
	}
	
}
