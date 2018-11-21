import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) { 
//	public static void main(String[] args) throws ParseException { 	//Option 1 - Add throws ParseException  declaration-> helps with parsing the date issue.
		//SimpleDate format is a concrete class for formatting and parsing date which inherits java.text.Dateformat class. Formatting means converting date to String, and parsing means converting String to date.
		
		Date date = new Date();
		System.out.println(date);
		
		//formatting -> date into string
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); //M-month, m-minute
		String strDate = formatter.format(date);
		System.out.println(strDate);
		
		formatter = new SimpleDateFormat("MM/dd/yy");//DD - days from beginning of year, dd - days from beginning of month. two yy abbreviates the year(11/21/18). 
		strDate = formatter.format(date);
		System.out.println(strDate);
		
		formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		strDate = formatter.format(date);
		System.out.println(strDate);
		
		formatter = new SimpleDateFormat("dd MMMM yyyy"); //MMMM gives full month
		strDate = formatter.format(date);
		System.out.println(strDate);
		
		formatter = new SimpleDateFormat("dd MMMM yyyy zzzzz");//zzzz time zone not abbreviated, z abbreviated
		strDate = formatter.format(date);
		System.out.println(strDate);
		
		formatter = new SimpleDateFormat("MMMM d, yyyy"); //Date standard way (November 21, 2018)
		strDate = formatter.format(date);
		System.out.println(strDate);
		
		formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z"); //Wed, 21 Nov 2018 11:31:14 EST E is for day of the week, z for time zone
		strDate = formatter.format(date);
		System.out.println(strDate);
		
		formatter = new SimpleDateFormat("EEEE, MMMM dd, yyyy"); //Wednesday, November 21, 2018
		strDate = formatter.format(date);
		System.out.println(strDate);
		
		// convert -> string into date
		formatter = new SimpleDateFormat("dd/MM/yyyy");
		try { //Option 2 try - catch to handle parse date exceptions
			date = formatter.parse("31/03/2015");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(date);
		
		
	}

}