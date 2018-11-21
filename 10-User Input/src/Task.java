import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		int counter = 1;
		int sum = 0;
		
		while (counter<11) {
			System.out.print("Enter number #"+counter+": ");
			boolean bool = scanner.hasNextInt();
			
			if (bool) {
				counter++;
				int number=scanner.nextInt();
				sum+=number;
			} else {
				System.out.println("Invalid number");
			}
			scanner.nextLine();//if you don't put this line, it becomes infinite loop
		}
		System.out.println("Total sum of 10 numbers is "+sum);
		scanner.close();
	}
	//my code, it works but it is incorrect 
//	public static void main(String[] args) {
//		System.out.println("Total sum of 10 numbers is"+hasNextInt());
//
//	}
//	public static int hasNextInt() {
//		int counter = 1;
//		int sum = 0;
//		boolean isInt;
//		Scanner scanner= new Scanner(System.in);
//		while (counter<=10) {
//			System.out.print("Enter number #"+counter);
//			int number=scanner.nextInt();
//			if (number> -32768 && number< 32767) {
//				isInt = true;
//				counter++;
//				sum+=number;
//			} else {
//				isInt=false;
//				System.out.println(number + "is invalid");
//				continue;
//			}
//			
//		}
//		scanner.close();
//		return sum;
//	}
}
