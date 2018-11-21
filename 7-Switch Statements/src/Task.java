
public class Task {

	public static void main(String[] args) {
		char letter = 'C';
		switch(letter) {
		case 'A': case 'B': case 'C':
		case 'D': case 'E': case 'F':
			System.out.println(letter+" has been found");
			break;
		default:
			System.out.println(letter+" Not found");
			break;
		}

	}

}
