
public class Main {

	public static void main(String[] args) {
		
		ITelephone mikePhone = new DeskPhone(2022202020,true);
		mikePhone.powerOn();
		mikePhone.callPhone(2025555252);
		mikePhone.dial(2023222020);
		mikePhone.isRinging();
		mikePhone.answer();

	}

}
