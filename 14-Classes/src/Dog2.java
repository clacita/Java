
public class Dog2 {
	
	public String name;
	public int age;
	public String breed;
	public String color;
	
	public Dog2() {//constructor: there is no return type and it has the same name as the class, and it has no parameters
		this("x",15,"y","t");//invokes another constructor -- the one with 4 parameters
		name="Rusty";
		age=15;
		breed="bulldog";
		color="brown";
		System.out.println("default constructor");
	}
	public Dog2(String name, int age, String breed, String color) { //constructor overloading, same name different parameters
		
//		this();//invokes another constructor -- the one with no parameters
		this.name = name;
		this.age = age;
		this.breed = breed;
		this.color = color;
		System.out.println("I am running constructor");
	}
	public void bark() {
		System.out.println(name+" is barking");
	}
	
	public void eat() {
		System.out.println(name+" is eating");
	}
	public void wagTail() {
		System.out.println(name+" has a helicopter tail that is wagging at this time");
	}
}
