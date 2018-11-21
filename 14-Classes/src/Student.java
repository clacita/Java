
public class Student {
	public String name;
	public int age;
	public char gender;
	public int year;
	public String course;
	public static String university="Cybertek";
	
	public Student(String name, int year, String course) { //auto generated with right-click -> source -> generate constructor using fields and you can choose your fields.
		this.name = name;
//		studentName = name; (this is another way to do it, it will work as long as the name of the parameter and the variable are different, the protocol is to to with this.)
		this.year = year;
		this.course = course;
	}

	public Student(String name, int age, char gender, int year, String course) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.year = year;
		this.course = course;
	}
	
	public void attendLecture() {
		System.out.println(name+" attended lecture at "+ university);
	}
	public void submitAssignment() {
		System.out.println(name+" submitted assignment at "+ university);
	}
	public void attendLab() {
		System.out.println(name+" attended lab at "+ university);
	}
}
