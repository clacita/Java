
public class StaticMethods {

	public static void main(String[] args) {
		Abc x = new Abc();
//		x.show1(); // it won't run because it is a static method belonging to class, so you have to call from class.
		Abc.show1(); //like this. static method belongs to class. 
		x.show2(); //instance method belongs to object.
		x.show3();
		Abc.show4();
	}

}

class Abc {
	public static void show1() {
		System.out.println("Hi");
//		show2(); //cannot call instance method from a static method
		show4(); //can call static method from static method
	}
	public void show2() {
		System.out.println("Hello");
		show1(); //can call static method from instance method
	}
	public void show3() {
		System.out.println("Hello too");
		show2(); //can call instance method from instance method
		show4(); //can call static method from instance method
	}
	public static void show4() {
		System.out.println("Hellow");
	}
}
