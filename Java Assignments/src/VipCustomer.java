
public class VipCustomer {
	private String name = "Mike";
	private double creditLimit = 100000;
	private String emailAddress = "mike@myemail.com";
	public VipCustomer() {
		
	}
	public VipCustomer(String name, double creditLimit) {
		this.name = name;
		this.creditLimit = creditLimit;
	}
	public VipCustomer(String name, double creditLimit, String emailAddress) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.emailAddress = emailAddress;
	}
	public String getName() {
		return name;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
}
