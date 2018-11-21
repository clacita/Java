
public class MethodOverloading {

	public static void main(String[] args) {
		System.out.println(sum(5,6));
		System.out.println(sum(5,6,7));
		System.out.println(sum(5,6,9,19));

	}
	public static int sum(int a,int b) {
		return a+b;
	}
	public static int sum(int a,int b,int c) {
		return a+b+c;
	}
	public static int sum(int a,int b,int c,int d) {
		return a+b+c+d;
	}

}
