//Create a class called VipCustomer
//It should have 3 fields name, credit limit, and email address
//Create 3 constructors:
//1.Constructor empty should call the constructor with 3 parameters with default values.
//2.Constructor should pass on the 2 values it receives and add a default value for the 3rd 
//3.Constructor should save all fields.
//
//Hint: Create only getters. Setter wont be needed.

public class Assignment21EncapsulationAndConstructors {
	
	public static void main(String[] args) {
		VipCustomer vip1 = new VipCustomer();
		VipCustomer vip2 = new VipCustomer("John",1200);
		VipCustomer vip3 = new VipCustomer("Tom",15000,"tom@email.me");
		System.out.println(vip1.getName());
		System.out.println(vip2.getName());
		System.out.println(vip3.getName());
	}
	
}

