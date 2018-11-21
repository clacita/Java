
public class Task {

	public static void main(String[] args) {
		Student st1 = new Student("Mike", 17, 'M', 2016, "Java");
		st1.attendLecture();
		st1.attendLab();
		st1.submitAssignment();
		Student st2 = new Student("Karl", 18, 'M', 2016, "JavaScript");
		st2.attendLecture();
		st2.attendLab();
		st2.submitAssignment();
		Student st3 = new Student("John", 19, 'M', 2016, "TypeScript");
		st3.attendLecture();
		st3.attendLab();
		st3.submitAssignment();
	}

}
