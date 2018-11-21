//1 - The class will be called Printer
//2 - It will simulate a real Computer Printer
//3 - It should have fields for the toner Level, number of pages printed, and also whether its a duplex printer (capable of printing on both sides of the paper).
//4 - Add methods to fill up the toner (up to a maximum of 100%), another method to simulate printing a page (which should increase the number of pages printed).
public class Assignment22Encapsulation {
	public static void main(String[] args) {
		Printer hp = new Printer();
		hp.setPagesPrinted(1000);
		hp.setDuplex(true);
		hp.setTonerLevel(55);
		hp.increaseToner(25);
		hp.increaseToner(90);
		hp.pagesPrinted(18);
	}
}
