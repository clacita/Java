
public class Main {

	public static void main(String[] args) {
		//charAt(index) -> Returns char value for the particular index.
		String str ="JavaScript";
		System.out.println(str.charAt(3));//a
		
		//length() -> Returns string length.
		System.out.println(str.length());//10
		
		//substring(int beginIndex) -> Returns substring for given begin index.
		System.out.println(str.substring(5));//cript

		//substring(int beginIndex, int endIndex) -> returns substring for given begin and end index, end not included.
		System.out.println(str.substring(2, 6));//vaSc
		
		//contains() -> returns true or false after matching the sequence of char value
		System.out.println(str.contains("va2"));//false
		System.out.println(str.contains("va"));//true
		
		//equals(Object another) -> checks the equality of the string with the given object. boolean.
		System.out.println(str.equals("JavaScrip"));//false
		System.out.println(str.equals("JavaScript"));//true
		
		//isEmpty() -> checks if string is empty
		System.out.println(str.isEmpty());//false
		
		//concat(string str) -> concatenates the specified string
		System.out.println(str.concat(" batch9")); //JavaScript batch9
		
		//replace(char old, char new) -> replaces all occurrences of the specified char value
		System.out.println(str.replace("Script","")); //java
		
		//equalsIgnoreCase(string another) -> compares another string. It does not check case.
		System.out.println(str.equalsIgnoreCase("javascript"));//true
		
		//split(String delimiter) -> returns a split matching delimiter
		String str2 = "   JavaScript is the best batch ever   ";
		String[] myArray = str2.split(" ");
		for (String word : myArray) {
			System.out.println(word);
		}
		
		//indexOf(char) -> returns the specified char value index
		System.out.println(str.indexOf("v"));//2
		
		//indexOf(String substring, int fromIndex) -> returns the specified substring starting with given index number
		System.out.println(str.indexOf('a',4)); //-1 no a from index 4
		
		//toLowerCase() -> returns a string in lowercase
		System.out.println(str.toLowerCase());

		//toUpperCase() -> returns a string in UPPERCASE
		System.out.println(str.toUpperCase());
		
		//trim() -> removes beginning and ending spaces of this string
		System.out.println(str2.trim());
		
		
	}

}
