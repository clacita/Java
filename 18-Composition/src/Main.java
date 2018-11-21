
public class Main {

	public static void main(String[] args) {
		Engine e1 = new Engine();
		Honda h1 = new Honda("Red",200,e1,4); //option 1
		Honda h2 = new Honda("Blue",180,new Engine(),4); //option 2
		h1.carInfo();
		h2.startHonda();
		Civic c1 = new Civic("Blue",200,e1,4,true);
		c1.carInfo();
		c1.startHonda();
	}

}
