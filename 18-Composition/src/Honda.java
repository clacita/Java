
public class Honda extends Car {
	
	private Engine engine; //reference to Engine class... composition -> has a relationship with.
	private int door;
	
	public Honda(String color, int maxSpeed, Engine engine, int door) {
		super(color, maxSpeed);
		this.engine = engine;
		this.door = door;
	}
	
	public void startHonda() {
		engine.start();
	}
	public void hondaDoors() {
		System.out.println("This car has "+door+" doors.");
	}
	
}
