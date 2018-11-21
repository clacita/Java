package computer;

public class Main {

	public static void main(String[] args) {
		Dimensions theDimensions = new Dimensions(20, 20, 5);
		Case theCase = new Case("2208","Dell","240",theDimensions);
		Motherboard theMotherboard = new Motherboard("BJ-200","Asus",4,6,"v2.44");
		Monitor theMonitor = new Monitor("27inch Beast","Acer",27,new Resolution(2540,1440));
		
		PC thePC = new PC(theCase,theMonitor,theMotherboard);
		thePC.getTheMonitor().drawPixelAt(1500, 1200, "red");
		thePC.getTheMotherboard().loadProgram("Windows 1.0");
		thePC.getTheCase().pressPowerButton();
		
		Case macCase = new Case("MacBookAir","Apple","45W",new Dimensions(13,9,1));
		Monitor macDisplay = new Monitor("13.3inch","Apple",13,new Resolution(1440,900));
		Motherboard macMB = new Motherboard("Core i5","Intel",2,1,"LPDDR3");
		
		PC theMac = new PC(macCase,macDisplay,macMB);
		theMac.getTheMonitor().drawPixelAt(1020, 600, "blue");
		theMac.getTheMotherboard().loadProgram("Mac 0SX Mojave");
		theMac.getTheCase().pressPowerButton();
		
	}

}
