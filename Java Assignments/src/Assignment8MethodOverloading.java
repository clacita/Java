//Create a method called getDurationString with two parameters, first parameter is minutes and second parameter is seconds.
//You should validate that if the first parameter minutes is >=0.
//You should validate that second parameter seconds is >=0 and <=59
//Return "Invalid Value" in the method if either of the above is not true.
//If the parameters are valid then calculate how many hours minutes and seconds comprise the minutes and seconds passed to this method and return that value as string in format "XXh XXm XXs" where XX represents a number of hours minutes and seconds.
//Create a second method of the same name but with only one parameter seconds.
//Validate that it is >=0, and return "Invalid Value" if it is not true.
//If it is valid, then calculate how many minutes are in the seconds then call the other overloaded method passing the correct minutes and seconds calculated so that it can calculate correctly.
//Call both methods to print values in main method
//Tips:
//Use int or long for your number data types
//1 minute = 60 seconds and 1 hour = 60 minutes = 3600 seconds.
public class Assignment8MethodOverloading {

	public static void main(String[] args) {
		System.out.println(getDurationString(185, 78));
		System.out.println(getDurationString(224, 45));
		System.out.println(getDurationString(3986));
		System.out.println(getDurationString(-35));

	}
	public static String getDurationString(int min, int sec) {
		 if (min<0 || (sec<0 || sec>59)) {
			 return "Invalid Value";
		 } else {
			 int m = min%60;
			 int h = min/60;
			 String seconds = Integer.toString(sec);
			 String minutes = Integer.toString(m);
			 String hours = Integer.toString(h);
			 return hours+"h "+minutes+"m "+seconds+"s";
		 }
	}
	public static String getDurationString(int sec) {
		if (sec<0) {
			 return "Invalid Value";
		 } else {
			 int s = sec%60;
			 int m = sec/60;
			 getDurationString(m,s);
			 return getDurationString(m,s);
			 
		 }
	}

}
