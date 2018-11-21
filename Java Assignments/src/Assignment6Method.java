//Write a method hasEqualSum with 3 parameters of type int. The method should return boolean and it needs to return true if sum of first and second parameter is equal to third parameter. Otherwise return false.
//
//Sample Outputs:
//
//hasEqualSum(1,1,1); = > false
//hasEqualSum(1,1,2); = > true
//hasEqualSum(1,-1,0); = > true
public class Assignment6Method {

	public static void main(String[] args) {
		System.out.println(hasEqualSum(1,1,1));
		System.out.println(hasEqualSum(1,1,2));
		System.out.println(hasEqualSum(1,-1,0));

	}
	public static boolean hasEqualSum(int n1, int n2, int n3) {
		if (n1+n2 == n3) {
			return true;
		} else {
			return false;
		}
	}

}
