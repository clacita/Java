//ATest.java file has 3 errors. You do not have to make changes in ATest.java file. You are free to change the code inside A.java file. Make changes in A.java file so that on executing ATest class, we get the following output:
//str: JAVA, val: 0.0
//str: test, val: 0.0
//str: JAVA, val: 9876.000873
//str: test, val: 5.6
public class A {
	public String str = "JAVA";
	public double val = 0;
	public A() {
	}
	public A(String str) {
		this.str = str;
	}
	public A(double val) {
		this.val = val;
	}
	public A(String str, double val) {
		this.str = str;
		this.val = val;
	}
	public void print() {
		System.out.println("str: "+this.str+", val: "+this.val);
	}
}
