/*Create a method called calcFeetAndInchesToCentimeters . It needs to have two parameters.
Feet is the first parameter, inches is the second parameter.
:black_small_square: You should validate that the first parameter feet is >=0, and second parameter inches is >=0 and <=12.
Return -1 from the method if either of the above is not true.
:black_small_square: If the parameters are valid, then calculate how many centimeters comprise the feet and inches passed to this method
and return that value.
:black_small_square: Create a second method of the same name but with only one parameter inches is the parameter and validate it >=0,
return -1 if it is not true. But if it is valid, then calculate how many feet are in the inches.
:black_small_square: Call the other overloaded method passing the correct feet and inches calculated so that it can calculate correctly.
:black_small_square: Hints : Use double for your number datatypes 1 inch = 2.54cm and 1 ft =12 inches*/

public class Task {

	public static void main(String[] args) {
		calcFeetAndInchesToCm(5,10);		
		calcFeetAndInchesToCm(59);
		calcFeetAndInchesToCm(-10);


	}
	public static double calcFeetAndInchesToCm(double feet, double inches) {
		if (feet<0||inches<0||inches>=12) {
			System.out.println("Invalid feet or inches value");
			return -1;
		}
		double cm = (feet*12+inches)*2.54;
		System.out.println(feet +" feet, "+inches+" inches = "+cm+" cm");
		return cm;

	}
	public static double calcFeetAndInchesToCm(double inches) {
		if (inches<0) {
			System.out.println("Invalid feet or inches value");
			return -1;
		} 
		double ft = (int)(inches/12);
		double inch = (int)(inches%12);
		System.out.println(inches+" inches = "+ft+ "feet, "+inch+" inches");
		return calcFeetAndInchesToCm(ft, inch);
	}
}