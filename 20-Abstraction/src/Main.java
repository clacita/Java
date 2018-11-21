
public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog("Yorkie");
		dog.breathe();
		dog.eat();
		
		Parrot p1 = new Parrot("Australia Ringneck");
		p1.breathe();
		p1.eat();
		p1.fly();
		
		Penguin p2 = new Penguin("Emperor");
		p2.fly();
	}

}
