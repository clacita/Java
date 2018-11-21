//The cat spend most of the day playing. In particular, they play if the temperature is between 25 and 35(inclusive). Unless it is summer, then the upper limit is 45(inclusive) instead of 35.
//Write a method isCatPlaying that has 2 parameters. Method needs to return true if cat is playing, otherwise return false.
//First parameter should be of type boolean and be named summer it represents if it is summer. Second parameter represents the temperature and is of type int with the name temperature.
//
//Sample Outputs:
//isCatPlaying(true,10) = > false
//isCatPlaying(false,36) = > false
//isCatPlaying(false,35) = > true
public class Assignment2Method {
	public static void main(String[] args) {
		System.out.println(isCatPlaying(true,10));
		System.out.println(isCatPlaying(false,36));
		System.out.println(isCatPlaying(false,35));
	}
	public static boolean isCatPlaying(boolean summer, int temperature) {
		if (((temperature>25 && temperature <=35)&&summer==false)||((temperature>25 && temperature <=45)&&summer==true)) {
			return true;
		} else {
			return false;
		}
	}
}