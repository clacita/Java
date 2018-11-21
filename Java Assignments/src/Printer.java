//1 - The class will be called Printer
//2 - It will simulate a real Computer Printer
//3 - It should have fields for the toner Level, number of pages printed, and also whether its a duplex printer (capable of printing on both sides of the paper).
//4 - Add methods to fill up the toner (up to a maximum of 100%), another method to simulate printing a page (which should increase the number of pages printed).
public class Printer {
	private int tonerLevel;
	private int pagesPrinted;
	private boolean duplex;
	public void increaseToner(int tonerLevel) {
		if (tonerLevel==0) {
			System.out.println("URGENT! To continue printing add toner now to at least 50%");
			tonerLevel = 50;
			
		} else if (tonerLevel<=50) {
			System.out.println("You need to add toner");
			tonerLevel += 20;
		} else if (tonerLevel<=90) {
			System.out.println("It wouldn't hurt to add more toner");
			tonerLevel += 10;
		} else if (tonerLevel == 100) {
			System.out.println("Congratulations! You can print quite a lot!");
		}
		System.out.println("Your toner level is now "+tonerLevel+"%");
	}
	public void pagesPrinted(int pages) {
		for (int i=1; i<=pages; i++) {
			System.out.println("Printing page number: "+i);
		}
	}
	public int getTonerLevel() {
		return tonerLevel;
	}
	public void setTonerLevel(int tonerLevel) {
		this.tonerLevel = tonerLevel;
	}
	public int getPagesPrinted() {
		return pagesPrinted;
	}
	public void setPagesPrinted(int pagesPrinted) {
		this.pagesPrinted = pagesPrinted;
	}
	public boolean isDuplex() {
		return duplex;
	}
	public void setDuplex(boolean duplex) {
		this.duplex = duplex;
	}
}
