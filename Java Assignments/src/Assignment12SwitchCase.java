//write a method called printnumberinword
//this method should have one parameter called number which a whole number(type int)
//the method needs to print "zero" if the number parameter is passed with the value of 0
//the method needs to print "one" if the number parameter is passed with the value of 0
//the method needs to print "two" if the number parameter is passed with the value of 0
//... and so on up to and including "nine" if the number parameter is passed with the value of 9
//if the number parameter has any other value than 0 to 9, then the method should print "other"

public class Assignment12SwitchCase {

	public static void main(String[] args) {
		printNumberInWord(5);
		printNumberInWord(7);
		printNumberInWord(-1);
		printNumberInWord(19);

	}
	public static void printNumberInWord(int number) {
		switch(number) {
		case 0:
			System.out.println("zero");
			break;
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
		case 6:
			System.out.println("six");
			break;
		case 7:
			System.out.println("seven");
			break;
		case 8:
			System.out.println("eight");
			break;
		case 9:
			System.out.println("nine");
			break;
		default:
			System.out.println("other");
			break;
		}
	}

}
