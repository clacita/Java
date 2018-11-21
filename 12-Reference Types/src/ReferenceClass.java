import java.util.Arrays;

public class ReferenceClass {

	public static void main(String[] args) {
		int myIntvalue=10;
		int anotherIntValue = myIntvalue;
		System.out.println("myIntvalue "+myIntvalue);
		System.out.println("anotherIntValue "+anotherIntValue);
		
		anotherIntValue = anotherIntValue+1;
		System.out.println("myIntvalue "+myIntvalue);
		System.out.println("anotherIntValue "+anotherIntValue);
		
		int[] myIntArray = new int[5];
		int[] anotherArray = myIntArray;
		
		System.out.println("myIntArray:" + Arrays.toString(myIntArray));
		System.out.println("anotherArray:" + Arrays.toString(anotherArray));
		
		anotherArray[0]=1;
		
		System.out.println("myIntArray:" + Arrays.toString(myIntArray));
		System.out.println("anotherArray:" + Arrays.toString(anotherArray));
	}

}
