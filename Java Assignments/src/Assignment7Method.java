//We will say that a number is "teen" if it is in the range 13-19(inclusive)
//Write a method hasTeen with 3 parameters of type int.
//The method should return boolean and it needs to return true if one of parameters is in range 13(inclusive) - 19(inclusive). Otherwise return false.
//
//Sample Output:
//hasTeen(9,99,19); = > true
//hasTeen(23,15,42); = > true
//hasTeen(22,23,34); = > false
public class Assignment7Method {

	public static void main(String[] args) {
		System.out.println(hasTeen(9,99,19));
		System.out.println(hasTeen(23,15,42));
		System.out.println(hasTeen(22,23,34));

	}
	public static boolean hasTeen(int n1, int n2, int n3) {
		if ((n1>12&&n1<20)||(n2>12&&n2<20)||(n3>12&&n3<20)) {
			return true;
		} else {
			return false;
		}
	}

}
