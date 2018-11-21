
public class Task {

	public static void main(String[] args) {
		
		//task
		byte marks = 55;
		for (int i=0; i<3; i++) {
			if (marks < 60) {
				System.out.println(marks+" Fail");
			} else if (marks >= 60 && marks <= 90) {
				System.out.println(marks+" Pass");
			} else if (marks >=90) {
				System.out.println(marks+" Passed with distinction");
			}
		marks += 20;
		}	

	}

}
