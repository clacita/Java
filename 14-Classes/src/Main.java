
public class Main {

	public static void main(String[] args) {
//		Dog dog1 = new Dog();
//		dog1.name = "Pepe";
//		dog1.age = 2;
//		dog1.breed = "Greyhound";
//		dog1.color = "tan and white";
//		
//		System.out.println(dog1.name+" is a "+dog1.age+"-year-old "+dog1.color+" "+dog1.breed);
//	
//		dog1.bark();
//		dog1.eat();
//		dog1.wagTail();
//		
//		Dog dog2 = new Dog();
//		dog2.name = "Tenchi";
//		dog2.age = 6;
//		dog2.breed = "German Shepherd";
//		dog2.color = "black and yellow";
//		dog2.bark();
//		dog2.eat();
//		dog2.wagTail();
//		
//		System.out.println(dog2.name+" is a "+dog2.age+"-year-old "+dog2.color+" "+dog2.breed);
//		
//		Dog dog3 = new Dog();
//		dog3.name = "Macarena";
//		dog3.age = 3;
//		dog3.breed = "French bulldog";
//		dog3.color = "black and white";
//		dog3.bark();
//		dog3.eat();
//		dog3.wagTail();
//		
//		System.out.println(dog3.name+" is a "+dog3.age+"-year-old "+dog3.color+" "+dog3.breed);
//		
//		System.out.println("----------------------");
		
		Dog2 dog = new Dog2();//this line invokes the constructor with keyword new.
		Dog2 dog2 = new Dog2("Pepe", 2, "Greyhound", "tan and white");
//		dog.name = "Pepe";
//		dog.age = 2;
//		dog.breed = "Greyhound";
//		dog.color = "tan and white";
//		
		System.out.println(dog.name+" is a "+dog.age+"-year-old "+dog.color+" "+dog.breed);
		System.out.println(dog2.name+" is a "+dog2.age+"-year-old "+dog2.color+" "+dog2.breed);
		
	}

}
