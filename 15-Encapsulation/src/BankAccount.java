public class BankAccount {
	
	private int accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private String phoneNumber;
	
	public void deposit(double add) {
		if (add>0) {
			this.balance+=add;
			System.out.println("Deposit of $"+add+" processed");
			System.out.println("Your new balance is: $"+this.balance);
		} else {
			System.out.println("Not a valid deposit number");
		}
	}
	
	public void withdraw(double amount) {
		if (this.balance<amount) {
			System.out.println("Insufficient funds. Withdrawal not processed");
		} else {
			this.balance-=amount;
			System.out.println("Withdrawal of $"+amount+" processed");
			System.out.println("Your new balance is: $"+this.balance);
		}
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
		
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
