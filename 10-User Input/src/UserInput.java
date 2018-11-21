import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a byte value");
		byte b1=scanner.nextByte();
		
		System.out.println("Enter a short value");
		short s1=scanner.nextShort();
		
		System.out.println("Enter an int value");
		int i1=scanner.nextInt();
		
		System.out.println("Enter a boolean value");
		boolean bool1=scanner.nextBoolean();
		
		System.out.println(b1+"|"+s1+"|"+i1+"|"+bool1);
		
		scanner.nextLine(); //do this before asking for string value		
		System.out.println("Enter your name: ");
		String str = scanner.nextLine(); //with string, nextLine, instead of nextByte,Short,Int,Boolean,Char;
		System.out.println(str);
		
		scan();
		scanner.close();

	}
	public static void scan() {
		Scanner scanner= new Scanner(System.in);
		System.out.print("Type some data for the program:");
		String input=scanner.nextLine();
		System.out.println("input= "+ input);
		scanner.close();
	}
}
