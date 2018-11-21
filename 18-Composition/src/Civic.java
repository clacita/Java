
public class Civic extends Honda {

	private boolean hybrid;
	
	public Civic(String color, int maxSpeed, Engine engine, int door, boolean hybrid) {
		super(color, maxSpeed, engine, door);
		this.hybrid = hybrid;
	}
	public void Hybrid() {
		if (hybrid) {
			System.out.println("This car is hybrid");
		} else {
			System.out.println("This car is not hybrid");
		}
	}
}
