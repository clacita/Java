//ATest.java file has 3 errors. 
//You do not have to make changes in ATest.java file. 
//You are free to change the code inside A.java file. 
//Make changes in A.java file so that on executing ATest class, we get the following output:
//str: JAVA, val: 0.0
//str: test, val: 0.0
//str: JAVA, val: 9876.000873
//str: test, val: 5.6
public class ATest {

	public static void main(String[] args) {
		A a1 = new A();
		a1.print();
		A a2 = new A("test");
		a2.print();
		A a3 = new A(9876.000873);
		a3.print();
		A a4 = new A("test",5.6);
		a4.print();
	}

}
