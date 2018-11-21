//Write a JAVA program to calculate the tax:
//income ≤ 150,000,000 tax ratio %25
//income ≤ 300,000,000 tax ratio %30
//income ≤ 600,000,000 tax ratio %35
//income ≤ 1,200,000,000 tax ratio %40
//income > 1,200,000,000 tax ratio %50
//Create needed variables and print the tax 

public class Assignment1IfStatement {

	public static void main(String[] args) {
		double income = 149_000_000;
		double tax = 0;
		for (int i=0; i<5; i++) {	
			if (income <= 150_000_000) {
				tax = income * 0.25;
			} else if (income <= 300_000_000) {
				tax = (income-150_000_000) * 0.30 + 150_000_000 * 0.25;
			} else if (income <= 600_000_000) {
				tax = (income-300_000_000) * 0.35 + 150_000_000 * 0.30 + 150_000_000 * 0.25;
			} else if (income <= 1_200_000_000) {
				tax = (income-600_000_000) * 0.40 + 300_000_000 * 0.35 + 150_000_000 * 0.30 + 150_000_000 * 0.25;
			} else if (income > 1_200_000_000) {
				tax = (income-1_200_000_000) * 0.50 + 600_000_000 * 0.40 + 300_000_000 * 0.35 + 150_000_000 * 0.30 + 150_000_000 * 0.25;
			}
			System.out.println(income+" tax is "+tax);
			income = income *2;
		}
	}

}
