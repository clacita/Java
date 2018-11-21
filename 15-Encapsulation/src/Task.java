
public class Task {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount();
		acc1.setAccountNumber(123553234);
		acc1.setBalance(10000);
		acc1.deposit(1000);
		acc1.withdraw(12000);
		acc1.withdraw(500);
	}

}
