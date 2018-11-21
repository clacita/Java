
public class Main {

	public static void main(String[] args) {
		
		Dog doggie = new Dog();
		doggie.speak();
		Cat kitty = new Cat();
		kitty.speak();
		Bird birdie = new Bird();
		birdie.speak();
		
		Animal a1 = new Dog();
		a1.speak();
		
		Animal a = new Dog();
		a.speak();
		a = new Cat();
		a.speak();
		a = new Bird();
		a.speak();
	}

}
